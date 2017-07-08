/**
 * Created by Administrator on 2017/6/15 0015.
 */
var loginModule = angular.module('login', ['ngMaterial', 'ngAnimate']);


loginModule.controller('loginController', ['$scope','$http', function ($scope, $http) {
    $scope.userInfo = {username: "", password: ""};

    $scope.login = function() {
        var loginActionName = "action/user_login.action";
        var data = {
            email: $scope.userInfo.email,
            password: $scope.userInfo.password
        };

        var promise = $http.post(loginActionName, data);

        if (promise) {
            promise.then(function(data) {
                alert(data);
            });
        }
    };

    $scope.reset = function() {
        $scope.userInfo = {};
    };
}])