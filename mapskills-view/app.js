(function() {
  
  var app = angular.module('mapSkills', []);

  app.controller('SearchController', ['$http', function($http) {
    this.skillName = '';
    
    this.peopleFound = [];
    
    this.search = function(peopleFound) {    
      //this.peopleFound = $http.get('people.json').success(function(data) {
        //this.peopleFound = data;
      //});
      this.peopleFound = [
        {
          name: 'Rafael Goncalves'
        },
        {
          name: 'Hugo Pena'
        },
        {
          name: 'Abacaxi Paniago'
        },
        {
          name: 'Alcir da Silva'
        }
      ];
    };

  }]);
 
})();
