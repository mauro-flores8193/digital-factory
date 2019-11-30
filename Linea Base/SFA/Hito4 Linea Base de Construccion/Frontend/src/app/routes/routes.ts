import {LayoutComponent} from '../layout/layout.component';

export const routes = [
  {
    path: '',
    component: LayoutComponent,
    children: [
      {path: '', redirectTo: 'home', pathMatch: 'full'},
      {path: 'home', loadChildren: './home/home.module#HomeModule'},
      {path: 'maintenance', loadChildren: './maintenance/maintenance.module#MaintenanceModule'}
    ]
  },

  // Not found
  {path: '**', redirectTo: 'home'}
];
