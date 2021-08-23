angular.module('app', []).controller('studentsController', function ($scope, $http) {
    const contextPath = 'http://localhost:8189/api/v1/students';

    $scope.loadList = function () {
        $http({
            url: contextPath,
            method: 'GET'
        }).then(function (response) {
            $scope.students = response.data;
        });
    };

    $scope.delete = function (id) {
        $http.delete(contextPath + '/' + id
        ).then(function () {
            $scope.loadList();
        });
    };

    $scope.createNewStudent = function () {
        $http.post(contextPath, $scope.newStudent)
                .then(function successCallback(response) {
                    $scope.loadList();
                    $scope.newStudent = null;
                }, function errorCallback(response) {
                    console.log(response.data);
                    alert('Error: ' + response.data.messages);
                });
    };

    $scope.loadList();

});

