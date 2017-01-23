/**
 * Created by daniel on 23.01.17.
 */

define(function (require) {
  'use strict';

  var module = require('./module');


  var characterControl = function ($stateParams, $http, env) {
    var _this = this;
    this.format = 'dd.MM.yyyy';

    var getCleanCharacter = function () {
      $http.get(env.apiEndpoint + '/character/creation').then(function (resp) {
        _this.character = resp.data;
      });
    };

    this.open = function ($event) {
      $event.preventDefault();
      $event.stopPropagation();
      _this.character = getCleanCharacter();
      _this.opened = true;
    };

  };
  characterControl.$inject = ['$stateParams', '$http', 'env'];
  module.controller('characterControl', characterControl);

  return module;
});

