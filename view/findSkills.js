angular.module('app', [])
  .controller('FindPeopleHaveSkillController', function() {
    
    var peopleHaveSkillList = this;
    
    peopleHaveSkillList.todos = [
      {name:'Rafael'},
      {name:'Alcir'},
      {name:'Diego'},
      {name:'Higor'},
      {name:'Rennan'},
      {name:'Helder'}]; 

    peopleHaveSkillList.find = function() {
      //alert(text:findPeopleHaveSkill.skill);
      
      peopleHaveSkillList.todos.push({name:findPeopleHaveSkill.skill});
      findPeopleHaveSkill.skill = '';
    };

  });