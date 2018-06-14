import { Component, OnInit } from '@angular/core';
import {Router}        from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html'
})
export class NavbarComponent implements OnInit {

  constructor(  private _Router:Router) { }

  ngOnInit() {
  }

  buscarHeroe(texto:string){
    console.log("NavbarComponent"+texto);

    this._Router.navigate(['buscar',texto]);
  }

}
