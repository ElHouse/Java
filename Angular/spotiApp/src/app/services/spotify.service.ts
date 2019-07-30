import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class SpotifyService {

  constructor(private http: HttpClient){
     console.log("SpotifyService listo 22");
 }

 getQuery( query: string){

   const headers =    new HttpHeaders({
     'Authorization': "Bearer BQAEhrZIovNeZW7WWLByQtmmAsBeRKKU1xI7vZceg8Sd9gS4gbFW3bJWGq_YaI3ZDlOQrVqtEw_sAHBqgx8",
   });

   const url =  `https://api.spotify.com/v1/${query}`;

   return this.http.get(url , {headers});
 }

 getNewReleases(){

     return this.getQuery("browse/new-releases").pipe( map( data =>{
               return data['albums'].items;
            }));

}

 getArtistas(termino: string ){

   return this.getQuery(`search?q=${termino}&type=artist&limit=15`).pipe( map( data=> data["artists"].items));
 }

getArtista( id:string){

  return this.getQuery(`artists/${id}`);
}


getTopTracks(id:string){

  return this.getQuery(`artists/${id}/top-tracks?country=us`).pipe(map(data=>data["tracks"]));
}



}
