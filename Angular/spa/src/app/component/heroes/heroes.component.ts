import { Component, OnInit } from '@angular/core';
import {HeroesService} from '../../services/heroes.service';
import {Heroes}        from '../../services/heroes.service';
import {Router}        from '@angular/router';

@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html',
  styles: []
})
export class HeroesComponent implements OnInit {

  private heroes:Heroes[] = [];

  constructor(private _heroesService:HeroesService, private _Router:Router) {

  }

  ngOnInit() {
     this.heroes = this._heroesService.getHeroes();
  }

  verHeroe(idx:number){
    console.log("HeroesComponent"+idx);
    this._Router.navigate(['/heroe',idx]);
  }


}
