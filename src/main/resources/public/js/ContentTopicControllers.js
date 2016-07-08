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

    $scope.startEditMode = function() {
        $scope.editMode = true;
    };

    $scope.cancelEditMode = function() {
        $scope.editMode = false;
    };

    $scope.addTextSnippet = function(index) {
        $scope.topicData.snippetGroups[index].snippets.push({
            "type": "TextSnippet",
            "title": "Title",
            "annotations": [],
            "truthLevel": "Truth",
            "revealed": false,
            "style": "Normal",
            "content": ""
        });
    };

    $scope.deleteSnippet = function(group, index) {
        $scope.topicData.snippetGroups[group].snippets.splice(index, 1);
    };

    $scope.saveContentTopic = function() {
        console.log("Saving content topic");
        $scope.editMode = false;
    };
});