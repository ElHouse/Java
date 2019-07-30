import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CssComponent } from './components/css/css.component';
import { ClasesComponent } from './components/clases/clases.component';
import { ResaltadoDirective } from './directives/resaltado.directive';
import { NgSwitchsComponent } from './components/ng-switchs/ng-switchs.component';

import {APP_ROUTING} from './app.routes';
import { NavbarComponent } from './components/navbar/navbar.component';
import { UsuarioComponent } from './components/usuario/usuario.component';
import { UsuarioEditarComponent } from './components/usuario/usuario-editar.component';
import { UsuarioNuevoeComponent } from './components/usuario/usuario-nuevoe.component';
import { UsuarioDetalleComponent } from './components/usuario/usuario-detalle.component';
import { HomeComponent } from './components/home/home.component';
import { UsuarioDeComponent } from './components/usuario/usuario-de.component';

@NgModule({
  declarations: [
    AppComponent,
    CssComponent,
    ClasesComponent,
    ResaltadoDirective,
    NgSwitchsComponent,
    NavbarComponent,
    UsuarioComponent,
    UsuarioEditarComponent,
    UsuarioNuevoeComponent,
    UsuarioDetalleComponent,
    HomeComponent,
    UsuarioDeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    APP_ROUTING
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
