var userModule = angular.module("userModule", []);

userModule.controller("userController", ["$scope", "$http", function($scope, $http) {
    var _this = this;
    _this.userInfo = {username: "", password: ""};

    _this.login = function() {
        var loginActionName = "action/user_login.action";
        var data = {
            username: _this.userInfo.username,
            password: _this.userInfo.password
        };
        var promise = $http.post(loginActionName, data);

        if (promise) {
            promise.then(function(data) {
                alert(data);
            });
        }
    };

    _this.reset = function() {
      _this.userInfo = {};
    };
}]);

userModule.directive("login", function () {
    return {
        restrict: "AE",
        replace: false,
        templateUrl: "view/login.html",
        controller: "userController",
        controllerAs: "userCtrl"
    };
});