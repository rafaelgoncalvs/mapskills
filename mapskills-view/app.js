(function() {
  
  var app = angular.module('mapSkills', []);

  app.controller('SearchController', function($scope, $http) {
    this.skillName = '';
    
    this.search = function() {    
      $http.get('http://localhost:8080/mapskills-api/people').success(function(data) {
        $scope.peopleFound = data;
      });
    };

  });
 
})();
