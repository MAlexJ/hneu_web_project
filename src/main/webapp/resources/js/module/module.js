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


