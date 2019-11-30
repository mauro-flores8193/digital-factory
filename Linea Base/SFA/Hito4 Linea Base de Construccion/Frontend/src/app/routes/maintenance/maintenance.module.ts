import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {NgxSelectModule} from 'ngx-select-ex';
import {Ng2TableModule} from '../shared/ng2-table/ng2-table';
import {SharedModule} from '../../shared/shared.module';
import {DataTableComponent} from '../shared/data-table/data-table.component';
import {ValidationMessageComponent} from '../shared/validation-message/validation-message.component';
import {OfficeComponent} from './office/office.component';
import {OfficeFormComponent} from './office-form/office-form.component';
import {CustomerComponent} from './customer/customer.component';
import {CustomerFormComponent} from './customer-form/customer-form.component';
import {RentFormComponent} from './rent-form/rent-form.component';
import {RentComponent} from './rent/rent.component';

const routes: Routes = [
  {path: 'office', component: OfficeComponent},
  {path: 'office/form', component: OfficeFormComponent},
  {path: 'office/form/:id', component: OfficeFormComponent},
  {path: 'customer', component: CustomerComponent},
  {path: 'customer/form', component: CustomerFormComponent},
  {path: 'customer/form/:id', component: CustomerFormComponent},
  {path: 'rent', component: RentComponent},
  {path: 'rent/form', component: RentFormComponent},
  {path: 'rent/form/:id', component: RentFormComponent},
];

@NgModule({
  imports: [
    SharedModule,
    RouterModule.forChild(routes),
    Ng2TableModule,
    NgxSelectModule
  ],
  declarations: [
    DataTableComponent,
    ValidationMessageComponent,
    OfficeComponent,
    OfficeFormComponent,
    CustomerComponent,
    CustomerFormComponent,
    RentComponent,
    RentFormComponent
  ],
  exports: [
    RouterModule
  ]
})
export class MaintenanceModule {
}
