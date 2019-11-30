import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';
import {CustomerService} from '../../shared/customer.service';
import {Customer} from '../../shared/customer.model';
import {CustomValidators} from 'ng2-validation';

@Component({
  selector: 'app-customer-form',
  templateUrl: './customer-form.component.html'
})
export class CustomerFormComponent implements OnInit {

  public contentHeadingText = 'Clientes';
  public cardHeaderText: string;
  public customerForm: FormGroup;

  constructor(private formBuilder: FormBuilder,
              private route: ActivatedRoute,
              private router: Router,
              private customerService: CustomerService) {
  }

  ngOnInit() {
    this.initForm();
    this.setFormData();
  }

  private setFormData(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.cardHeaderText = 'Registrar Cliente';
    if (id !== 0) {
      this.cardHeaderText = 'Actualizar Cliente';
      this.customerService.get(id).subscribe(customer => this.customerForm.patchValue(customer));
    }
  }

  private initForm(): void {
    this.customerForm = this.formBuilder.group({
      id: [0],
      name: ['', Validators.required],
      ruc: ['', [Validators.required, CustomValidators.number, CustomValidators.rangeLength([11, 11])]],
      address: '',
      phone: '',
      email: ['', CustomValidators.email]
    });
  }

  public onSubmit(customer: Customer): void {
    this.customerService.save(customer).subscribe(result => {
      this.goBack();
    });
  }

  public goBack(): void {
    this.router.navigate(['/maintenance/customer']);
  }

}
