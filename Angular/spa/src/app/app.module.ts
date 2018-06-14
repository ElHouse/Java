import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
//componentes
import { AppComponent } from './app.component';
import { NavbarComponent } from './component/shared/navbar/navbar.component';
import { HomeComponent } from './component/home/home.component';
import { AboutComponent } from './component/about/about.component';
import { HeroesComponent } from './component/heroes/heroes.component';
//rutas
import {app_routing} from './app.routes';
//Servicios
import {HeroesService} from './services/heroes.service';
import { HeroeComponent } from './component/heroe/heroe.component';
import { BuscarComponent } from './component/buscar/buscar.component';
import { HeroeTarjetaComponent } from './component/heroe-tarjeta/heroe-tarjeta.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomeComponent,
    AboutComponent,
    HeroesComponent,
    HeroeComponent,
    BuscarComponent,
    HeroeTarjetaComponent
  ],
  imports: [
    BrowserModule,
    app_routing
  ],
  providers: [HeroesService],
  bootstrap: [AppComponent]
})
export class AppModule { }
