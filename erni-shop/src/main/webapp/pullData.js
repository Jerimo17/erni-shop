/**
 * Controler "customers" pull all data from JAX-RS Jersey web service from JPA Customer
 */

var app = angular.module('pullDataFromOrder', []);

app.controller('orders', function($scope, $http) {

  $http.get('http://localhost:8080/erni-shop/rest/shoporder')
    .then(function(response) {
      $scope.datas = response.data;
      $scope.sortType     = 'article';
      $scope.sortReverse  = false;
      $scope.searchName   = '';
    });
});
