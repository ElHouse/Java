import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { SpotifyService } from 'src/app/services/spotify.service';

@Component({
  selector: 'app-artista',
  templateUrl: './artista.component.html',
  styles: []
})
export class ArtistaComponent implements OnInit {

  loading: boolean;
  artista: any = {};
  topTracks: any[] = [];

  constructor(private _activatedRoute: ActivatedRoute,
              private _spotify: SpotifyService) {

    this._activatedRoute.params.subscribe( params=>{
       console.log(params["id"]);
       this.getArtista(params["id"]);
       this.getTopTracks(params["id"]);
    });


  }

  ngOnInit() {
  }


  getArtista(id:string){

      console.log("id a buscar>"+id);
      this.loading = true;
      this._spotify.getArtista(id)
                   .subscribe( artista=>{
                        this.artista = artista;
                        this.loading = false;
                   });
  }

  getTopTracks(id:string){

      this._spotify.getTopTracks(id)
                   .subscribe( topTrack => {
                      this.topTracks = topTrack;
                      console.log("track>"+this.topTracks);
                   });
  }



}
