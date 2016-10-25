'use strict';

// USER
var myApp = angular.module('myApp', ["ngRoute"]).config(function ($routeProvider) {

    $('.button-collapse').sideNav({
            menuWidth: 300, // Default is 240
            edge: 'left', // Choose the horizontal origin
            closeOnClick: true // Closes side-nav on <a> clicks, useful for Angular/Meteor
        }
    );



    // ************  Home Page  ******************
    $routeProvider.when('/home',
        {
            templateUrl: './home.html',
            controller: 'homeController'
        });

    // ************  Teachers Page  ******************
    $routeProvider.when('/teachers',
        {
            templateUrl: './teachers.html',
            controller: 'teachersController'
        });

    // ************  Timetable Page  ******************
    $routeProvider.when('/timetable',
        {
            templateUrl: './timetable.html',
            controller: 'timetableController'
        });

    // ************  Mobiles Page  ******************
    $routeProvider.when('/mobiles',
        {
            templateUrl: './mobiles.html',
            controller: 'mobilesController'
        });

    // ************  News Page  ******************
    $routeProvider.when('/news',
        {
            templateUrl: './news.html',
            controller: 'newsController'
        });

    // ************  Comments Page  ******************
    $routeProvider.when('/comments',
        {
            templateUrl: './comments.html',
            controller: 'commentsController'
        });

    // ************  Default Page  ******************
    $routeProvider.otherwise({redirectTo: '/home'});
});

// ADMIN
var myAdmin = angular.module('myAdmin', ["ngRoute"]).config(function ($routeProvider) {

    // ************  Home Page  ******************
    $routeProvider.when('/home',
        {
            templateUrl: './admin/adminHome.html',
            controller: 'adminHomeController'
        });

    // ************  Create Page  ******************
    $routeProvider.when('/create',
        {
            templateUrl: './admin/adminCreate.html',
            controller: 'adminCreateController'
        });

    // ************  Update Page  ******************
    $routeProvider.when('/update',
        {
            templateUrl: './admin/adminUpdate.html',
            controller: 'adminUpdateController'
        });

    // ************  Delete Page  ******************
    $routeProvider.when('/delete',
        {
            templateUrl: './admin/adminDelete.html',
            controller: 'adminDeleteController'
        });

    // ************  View Page  ******************
    $routeProvider.when('/view',
        {
            templateUrl: './admin/adminView.html',
            controller: 'adminViewController'
        });

    // ************  Default Page  ******************
    $routeProvider.otherwise({redirectTo: '/home'});
});




