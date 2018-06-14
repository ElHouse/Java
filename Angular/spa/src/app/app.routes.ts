

import { RouterModule, Routes } from '@angular/router';
import {HomeComponent}          from './component/home/home.component';
import {AboutComponent}         from './component/about/about.component';
import {HeroesComponent}        from './component/heroes/heroes.component';
import {HeroeComponent}         from './component/heroe/heroe.component';
import {BuscarComponent}        from './component/buscar/buscar.component';


const app_routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'about', component: AboutComponent },
  { path: 'heroe/:id', component: HeroeComponent },
  { path: 'heroes', component: HeroesComponent },
  { path: 'buscar/:heroes', component: BuscarComponent },
  { path: '**', pathMatch: 'full', redirectTo: 'home' }
];

export const app_routing = RouterModule.forRoot(app_routes);
