/**
 * Created by daniel on 23.01.17.
 */
(function() {
  var app = angular.module('textadventure',
    [
      'ui.bootstrap',
      'ngRoute',
      'ngResource',
      'app-filters',
      'app-menu',
      'app-footer',
      'app-alert',
      'characterCreation'
    ]);

  app.controller('appController', ['$scope', '$rootScope', function($scope, $rootScope) {

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
    when('/', {
      templateUrl: 'app/components/content/authentication/authentication.html'
    }).
    otherwise({
      redirectTo: '/'
    });
  })
})();

