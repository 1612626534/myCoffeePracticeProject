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