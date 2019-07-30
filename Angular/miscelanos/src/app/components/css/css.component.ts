import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-css',
  template:`
      <p>
           P  solo le afectan estilos locales
      </p>
  `,
  styleUrls: ['./css.component.css']
})
export class CssComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
