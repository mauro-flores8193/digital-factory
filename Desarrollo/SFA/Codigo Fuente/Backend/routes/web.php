<?php

/*
|--------------------------------------------------------------------------
| Application Routes
|--------------------------------------------------------------------------
|
| Here is where you can register all of the routes for an application.
| It is a breeze. Simply tell Lumen the URIs it should respond to
| and give it the Closure to call when that URI is requested.
|
*/

$router->get('/', function () use ($router) {
    return $router->app->version();
});

$version = 'v0';
$router->group(['prefix' => "api/$version"], function () use ($router) {
    function resource($uri, $controller, $router) {
        $router->get($uri, $controller . '@index');
        $router->post($uri, $controller . '@create');
        $router->post($uri . '/list', $controller . '@list');
        $router->get($uri . '/{id}', $controller . '@show');
        $router->put($uri . '/{id}', $controller . '@update');
        $router->patch($uri . '/{id}', $controller . '@update');
        $router->delete($uri . '/{id}', $controller . '@destroy');
    }

    resource("offices", 'OfficesController', $router);
    resource("meters", 'MetersController', $router);
    resource("customers", 'CustomersController', $router);
    resource("rents", 'RentsController', $router);
});
