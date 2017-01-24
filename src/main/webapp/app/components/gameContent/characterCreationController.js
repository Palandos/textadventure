
(function () {

  'use strict';
  var app = angular.module('app-character-creation', []);

  app.directive('characterCreationView', function () {
    return {
      templateUrl: 'app/components/gameContent/characterCreationView.html',
      controllerAs: 'characterCreationControl',
      controller: ['$scope', '$rootScope', function ($scope, $rootScope) {
        $http.get('./character/creation').then(function (resp) {
          $scope.character = resp.data;
        });
      }]
    }
  });
})();

