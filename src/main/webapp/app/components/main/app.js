/**
 * Created by daniel on 23.01.17.
 */
(function() {
  var app = angular.module('textadventure',
    [
      'ui.bootstrap',
      'ngRoute',
      'ngCookies',
      'ngResource',
      'ngMaterial',
      'app-alert',
      'app-login',
      'app-register',
      'app-content-home',
      'app-character-creation'
    ]);

  app.controller('textadventureController', ['$scope', '$rootScope', function($scope, $rootScope) {

    $rootScope.global = {
      wait: false,
      alerts: [],
      timeframes: []
    };

    $scope.$on('$locationChangeStart', function (event) {
      if (!$rootScope.global.wait) {
        $rootScope.global = {
          alerts: []
        };
      } else {
        $rootScope.global.wait = false;
      }
    });
  }]);

  app.config(function($routeProvider) {

    $routeProvider.
    when('/characterCreation', {
      templateUrl: 'app/components/gameContent/characterCreationView.html',
      controller: 'characterCreationControl'
    }).
    when('/login', {
      controller: 'loginController',
      templateUrl: 'app/components/authentication/loginView.html',
      controllerAs: 'loginCtrl'
    }).
    when('/register', {
      controller: 'registerController',
      templateUrl: 'app/components/authentication/registerView.html',
      controllerAs: 'registerCtrl'
    }).
    when('/', {
      templateUrl: 'app/components/home/homeView.html'
    }).
    otherwise({ redirectTo: '/' });
  })
})();

