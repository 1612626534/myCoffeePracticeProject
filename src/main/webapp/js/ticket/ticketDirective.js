ticketModule.directive("ticketLeftNav", function () {
    return {
        restrict: "AE",
        replace: true,
        templateUrl: "view/ticket/ticket-left-nav.html",
        controller: "ticketController",
        controllerAs: "ticketCtrl"
    }
});

ticketModule.directive("ticketDetail", function () {
    return {
        restrict: "AE",
        replace: true,
        templateUrl: "view/ticket/ticket-detail.html",
        controller: "ticketDetailController",
        controllerAs: "ticketDetailCtrl"
    }
});

ticketModule.directive("ticketList", function () {
    return {
        restrict: "AE",
        replace: true,
        templateUrl: "view/ticket/ticket-list.html",
        controller: "ticketListController",
        controllerAs: "ticketListCtrl"
    }
});