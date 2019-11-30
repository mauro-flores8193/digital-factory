import {Component} from '@angular/core';
import {Router} from '@angular/router';
import {MessageService} from '../../../core/message.service';
import {CrudTableComponent} from '../../shared/crud-table.component';
import {CustomerService} from '../../shared/customer.service';

@Component({
  selector: 'app-customer',
  templateUrl: '../../shared/crud-table.component.html'
})
export class CustomerComponent extends CrudTableComponent {

  constructor(public customerService: CustomerService, public router: Router, public messageService: MessageService) {
    super(customerService, router, messageService, '/maintenance/customer/form');
    this.columns = [
      {title: 'Nombre', name: 'name', filtering: {filterString: ''}},
      {title: 'RUC', name: 'ruc', filtering: {filterString: ''}},
      {title: 'Dirección', name: 'address', filtering: {filterString: ''}},
      {title: 'Teléfono', name: 'phone', filtering: {filterString: ''}},
      {title: 'Email', name: 'email', filtering: {filterString: ''}}
    ];
  }

  get contentHeadingText(): string {
    return 'Clientes';
  }

}
