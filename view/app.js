(function() {
  var app = angular.module('mapSkills', []);

  var people = [];

  app.controller('SearchController', function() {
    this.skillName = '';
    
    this.search = function() {
      console.log('nome: ' + this.skillName);
      people = ['Rafael', 'Hiago', 'Abacaxi'];
    };

  });
 
})();
