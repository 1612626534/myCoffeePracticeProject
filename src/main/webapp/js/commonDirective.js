/**
 * Created by Administrator on 2016/5/1 0001.
 */

coffeeModule.directive("coffeeWatermark", function () {
    return {
        restrict: "A",
        replace: false,
        template: '<div class="coffee-watermark">Coffee</div>'
    };
});

coffeeModule.directive("leftNavSection", function() {
    return {
        restrict: "EA",
        replace: false,
        templateUrl:'view/leftNavSection.html',
        controllerAs: "leftNavSectionCtrl",
        controller: [function () {
            var _this = this;

            _this.tasksList = [
                {
                    name: "TODO",
                    status: "TO_DO",
                    number: 1
                },
                {
                    name: "In Progress",
                    status: "IN_PROGRESS",
                    number: 2
                },
                {
                    name: "Finished",
                    status: "FINISHED",
                    number: 3
                },
                {
                    name: "Blocked",
                    status: "BLOCKED",
                    number: 4
                }
            ];







            /*
            *
            *
            *   任务列表
            *   邮件信息
            *   系统信息
            *   用户管理
            *   
            *
            *
            *
            * */
        }]
    };
});