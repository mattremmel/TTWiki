//
// ContentTopicControllers.js
// WorldWiki
//
// Created by Matthew Remmel on 7/7/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

angular.module('ContentTopic.controllers', []);
angular.module('ContentTopic.controllers').controller('ContentTopicController', function($scope, ContentTopicService) {

    ContentTopicService.getContentTopic('577e8ebfd4c61ebc71746fcd')
        .then(function success(response) {
            $scope.topicData = response.data;
    }, function failed(response) {
        console.log('An error occurred: ' + response.statusText);
    });
});