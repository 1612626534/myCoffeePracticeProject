/**
*   var loginModule = angular.module('login', ['ngMaterial', 'ngAnimate']);
*
*   loginModule.config(['$locationProvider', function($locationProvider) {
*       // $location in HTML5 mode requires a <base> tag to be present!
*       $locationProvider.html5Mode(true);
*   }]);

*
*    Share: 1,Accept属于请求头, Content-Type属于实体头.
*           2,Accept代表发送端（客户端）希望接受的数据类型.
*           3,Content-Type代表发送端（客户端|服务器）发送的实体数据的数据类型.

*     It uses methods other than GET, HEAD or POST. Also, if POST is used to send request data with a Content-Type other than application/x-www-form-urlencoded,multipart/form-data, or text/plain, e.g. if the POST request sends an XML payload to the server using application/xml or text/xml, then the request is preflighted.
*     It sets custom headers in the request (e.g. the request uses a header such as X-PINGOTHER)
*
*/

var coffeeModule = angular.module("coffee", ["ngRoute", "ngMaterial", "ngAnimate"]);



