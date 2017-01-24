/**
 * Created by daniel on 24.01.17.
 */
(function () {

  'use strict';

  var myApp = angular.module('app-register',[]);

  myApp.controller('registerController', ['$scope', function($scope) {
    $scope.firstName = "";
    $scope.lastName = "";
    $scope.format = 'dd.MM.yyyy';
    $scope.birthDate = new Date();
    $scope.username = "";
    $scope.password = "";
    $scope.responseSuccess = false;
    $scope.responseFailure = false;

    $scope.submitRegisterForm = function(){
      $http.post('./rest/register', $scope.username, $scope.password, $scope.birthDate, $scope.firstName, $scope.lastName).then(function (resp) {
        if (resp == true) {
          $scope.responseSuccess = true;
        } else {
          $scope.responseFailure = true;
        }
      });
    };
  }]);
})();
