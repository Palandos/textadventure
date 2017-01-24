(function () {

  'use strict';

  var myApp = angular.module('app-login',[]);

  myApp.controller('loginController', ['$scope', function($scope) {
      $scope.username = "";
      $scope.password = "";
      $scope.responseSuccess = false;
      $scope.responseFailure = false;

      $scope.submitLoginForm = function(){
        $http.post('./rest/login', $scope.username, $scope.password).then(function (resp) {
          if (resp == true) {
            $scope.responseSuccess = true;
          } else {
            $scope.responseFailure = true;
          }
        });
      };
  }]);
})();

