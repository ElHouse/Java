import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import {HeroesService} from '../../services/heroes.service';
import {Heroes} from '../../services/heroes.service';
import {Router}        from '@angular/router';

@Component({
  selector: 'app-heroe-tarjeta',
  templateUrl: './heroe-tarjeta.component.html'
})
export class HeroeTarjetaComponent implements OnInit {

  @Input() heroe:Heroes;
  @Input() i:number;

  //nombre del vento
  @Output() heroeSeleccionado:EventEmitter<number>;

  constructor(private _Router:Router) {
    this.heroeSeleccionado = new EventEmitter();
  }

  ngOnInit() {
  }

  verHeroe(){
    console.log("HeroeTarjetaComponent"+this.i);
    this.heroeSeleccionado.emit(this.i);

    //this._Router.navigate(['/heroe',this.i]);
  }


}
