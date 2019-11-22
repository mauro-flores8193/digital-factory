<?php

namespace App\Http\Controllers;

use App\Customer;

class CustomersController extends CrudController {

    public function __construct(Customer $customer) {
        parent::__construct($customer);
    }

    public function getSelectColumns() {
        return ['id' => 'id',
            'name' => 'name',
            'ruc' => 'ruc',
            'address' => 'address',
            'phone' => 'phone',
            'email' => 'email'
        ];
    }

    public function getFromList() {
        return app('db')->table('customers')->whereNull('deleted_at');
    }
}
