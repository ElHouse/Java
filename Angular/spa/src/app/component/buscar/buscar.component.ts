import { Component, OnInit } from '@angular/core';
import {HeroesService} from '../../services/heroes.service';
import {Heroes}        from '../../services/heroes.service';
import {ActivatedRoute}      from '@angular/router';

@Component({
  selector: 'app-buscar',
  templateUrl: '../heroes/heroes.component.html'
})
export class BuscarComponent implements OnInit {

  heroes:Heroes[] = [];

  constructor(private heroesService:HeroesService,private activatedRoute:ActivatedRoute) {
   }

  ngOnInit() {
    this.activatedRoute.params.subscribe(
      params=>{
          console.log("BuscarComponent::>"+params['heroes']);
          let texto = params['heroes'];
          this.heroes =  this.heroesService.buscarHeroe(texto);
          console.log("Num heroes encontados:"+this.heroes.length);
    });
  }

}
