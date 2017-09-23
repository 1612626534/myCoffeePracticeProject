var ticketModule = angular.module("ticketModule", []);

ticketModule.controller("ticketController", ["$scope", "$mdDialog", function ($scope, $mdDialog) {
    var _this = this;

    _this.tickets = [
        {
            id: 1,
            name: "java"
        },
        {
            id: 2,
            name: "c#"
        },
        {
            id: 3,
            name: "c"
        },
        {
            id: 4,
            name: "c++"
        },
        {
            id: 5,
            name: "typescript"
        }
    ];

    $scope.closePopover = function() {
        $mdDialog.hide();
    }
    _this.createTicket = function () {
        $mdDialog.show({
            templateUrl: 'view/ticket/ticket-create.html',
            clickOutsideToClose: false,
            controller: 'ticketController'
        });
    };
}]);

ticketModule.controller("ticketDetailController", ["$scope", "$mdDialog", function ($scope,  $mdDialog) {
    var _this = this;
    _this.ticket = {
        name: "ticket name",
        authorName: "Caesar Li",
        createdDate: new Date(),
        lastModifiedDate: new Date(),
        description: "123123",
        status: "To Do",
        comments: [{
            author: 1,
            comment: "313312311112312312",
            createdDate: new Date()
        },
        {
            author: 1,
            comment: "313312311112312312",
            createdDate: new Date()
        },
        {
            author: 1,
            comment: "313312311112312312",
            createdDate: new Date()
        },
        {
            author: 1,
            comment: "313312311112312312",
            createdDate: new Date()
        }]
    };

    _this.status = {

    };
}]);

ticketModule.controller("ticketListController", ["$scope", "$http", function($scope, $http) {
    $http({
        method: "post",
        url: "coffee-1/ticket_getMyTicket.action",
        data: {assigneeId: "30d88c5b8fb211e7bdd408144c436944"}
    }).then(function(data) {
        console.log(data);
    }).then(function(data) {
        console.log(data);
    });

}]);