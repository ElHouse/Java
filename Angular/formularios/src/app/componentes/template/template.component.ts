import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-template',
  templateUrl: './template.component.html',
  styles: []
})
export class TemplateComponent {

  paises =  [{
    codigo: "MEX",
    nombre: "mexico"
  },{
    codigo: "us",
    nombre: "gringolandia"
  }]


  usuario:Object = {
    nombre : null,
    apellido: null,
    correo: "casdsa@sadsa.com",
    pais: "",
    sexo: "hombre",
    terminos:false
  }

  constructor() { }

  guardar( forma:NgForm){
    console.log("Inicial el post por template");
    console.log(forma.valid);
    console.log(forma.value);

    console.log(this.usuario);
  }

}
