import {RouterModule, Routes} from '@angular/router';
import { AppComponent } from './app.component';
import { UsuarioComponent } from './components/usuario/usuario.component';
import { HomeComponent } from './components/home/home.component';
import { UsuarioDetalleComponent } from './components/usuario/usuario-detalle.component';
import { UsuarioNuevoeComponent } from './components/usuario/usuario-nuevoe.component';
import { UsuarioEditarComponent } from './components/usuario/usuario-editar.component';



const APP_ROUTES: Routes = [

  { path: 'home', component: HomeComponent},
  { path: 'usuario/:id', component: UsuarioComponent,
    children: [
      { path: 'nuevo',   component: UsuarioNuevoeComponent },
      { path: 'detalle', component: UsuarioDetalleComponent},
      { path: 'editar',  component: UsuarioEditarComponent},
      { path: '**'     , pathMatch: 'full', redirectTo: 'nuevo' }
    ]
  },
  { path: '**'  , pathMatch: 'full', redirectTo: 'home' }
];

export const APP_ROUTING = RouterModule.forRoot(APP_ROUTES);
