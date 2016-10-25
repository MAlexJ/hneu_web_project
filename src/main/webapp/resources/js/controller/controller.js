'use strict';

// ************  Home Page  ******************
myApp.controller('homeController', function ($scope, $http) {

    $('.collapsible').collapsible({
        accordion: false // A setting that changes the collapsible behavior to expandable instead of the default accordion style
    });


});

// ************  Teachers Page  ******************
myApp.controller('teachersController', function ($scope, $http) {
});

// ************  Timetable Page  ******************
myApp.controller('timetableController', function ($scope, $http) {


});

// ************  Mobiles Page  ******************
myApp.controller('mobilesController', function ($scope, $http) {

    $('.collapsible').collapsible({
        accordion: false // A setting that changes the collapsible behavior to expandable instead of the default accordion style
    });


});

// ************  News Page  ******************
myApp.controller('newsController', function ($scope, $http) {

});

// ************  Comments Page  ******************
myApp.controller('commentsController', function ($scope, $http) {
});


// ************ ADMIN:  Admin Home Page  ******************
myAdmin.controller('adminHomeController', function ($scope, $http) {
});

// ************ ADMIN:  Admin Create Page  ******************
myAdmin.controller('adminCreateController', function ($scope, $http) {
});

// ************ ADMIN:  Admin Update Page  ******************
myAdmin.controller('adminUpdateController', function ($scope, $http) {
});

// ************ ADMIN:  Admin Delete Page  ******************
myAdmin.controller('adminDeleteController', function ($scope, $http) {
});

// ************ ADMIN:  Admin View Page  ******************
myAdmin.controller('adminViewController', function ($scope, $http) {
});

