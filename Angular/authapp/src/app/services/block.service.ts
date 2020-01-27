import { Injectable } from '@angular/core';
import { CanActivate } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class BlockService implements CanActivate {


  canActivate() {

    var myDate = new Date().getMinutes();

    console.log(myDate);

    if(myDate%2){
        console.log("no bloque")

        return true;
    }else{
      console.log("bloquea")

      return false;
    }

  }

  constructor() { }
}
