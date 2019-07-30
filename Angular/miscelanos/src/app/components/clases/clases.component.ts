import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-clases',
  templateUrl: './clases.component.html',
  styles: []
})
export class ClasesComponent implements OnInit {

  alerta: String = "alert-info";

  propiedades:Object = {

    danger: false
  };


  loading:boolean = false;

  ejecutar(){
    this.loading = true;
    setTimeout( ()=> this.loading = false, 3000 )
  }

  constructor() { }

  ngOnInit() {
  }

}
