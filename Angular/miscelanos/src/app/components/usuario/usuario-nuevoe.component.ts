import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-usuario-nuevoe',
  template: `
    <p>
      usuario nuevo, ver el log del navegador
    </p>
  `,
  styles: []
})
export class UsuarioNuevoeComponent implements OnInit {

  constructor(private router: ActivatedRoute) {

    this.router.parent.params.subscribe( param=>{

        console.log("---RUTA hijo usuario nuevo");
        console.log(param);
    });
  }

  ngOnInit() {
  }

}
