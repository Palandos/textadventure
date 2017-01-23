/**
 * Created by daniel on 23.01.17.
 */

(function () {

  'use strict';
  var app = angular.module('app-alert', []);

  app.directive('alertView', function () {
    return {
      restrict: 'E',
      templateUrl: 'app/components/alert/alertView.html',
      controllerAs: 'alertController',
      controller: ['$scope', '$rootScope', function ($scope, $rootScope) {
        $rootScope.closeAlert = function (index) {
          $rootScope.global.alerts.splice(index, 1);
        };

      }]
    }
  });
})();
