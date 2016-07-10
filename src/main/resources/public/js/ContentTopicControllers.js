//
// ContentTopicControllers.js
// WorldWiki
//
// Created by Matthew Remmel on 7/7/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

angular.module('ContentTopic.controllers', []);
angular.module('ContentTopic.controllers').controller('ContentTopicController', function($scope, ContentTopicService) {

    // The topic data as it is represented on the server
    var remoteTopicData = {};

    $scope.getContentTopic = function (id) {
        ContentTopicService.getContentTopic(id)
            .then(function success(data, status, headers) {
                $scope.topicData = data.data;
                remoteTopicData = angular.copy(data.data);
            }, function failed(data, status, headers, config) {
                console.log(status + ' ' + data.statusText);
            });
    }

    function saveContentTopic() {
        ContentTopicService.updateContentTopic($scope.topicData)
            .then(function success(response) {
                $scope.topicData = response.data;
                remoteTopicData = angular.copy(response.data);
            }, function failed(response) {
                console.log(response.statusText)
            });
    }

    $scope.filterSnippets = function() {
        return function(snippet) {
            if ($scope.editMode) {
                return true;
            }

            // Handle Text Snippet
            if (snippet['@type'] == 'text') {
                return snippet.content.length > 0
            }

            return false;
        }
    };

    $scope.startEditMode = function() {
        $scope.editMode = true;
    };

    $scope.cancelEditMode = function() {
        // Reset topic data
        $scope.topicData = angular.copy(remoteTopicData);
        $scope.editMode = false;
    };

    $scope.addTextSnippet = function(groupIndex) {
        $scope.topicData.snippetGroups[groupIndex].snippets.push(
            {
            "@type": "text",
            "title": "Title",
            "annotations": [],
            "truthLevel": "Truth",
            "revealed": false,
            "style": "Normal",
            "content": ""
            }
        )
    };

    $scope.addSnippetGroup = function() {
        $scope.topicData.snippetGroups.push(
            {
                "title": "Category",
                "snippets": [
                    {
                        "@type": "text",
                        "title": "Title",
                        "annotations": [],
                        "truthLevel": "Truth",
                        "revealed": false,
                        "style": "Normal",
                        "content": ""
                    }
                ]
            }
        )
    };

    $scope.deleteSnippet = function(groupIndex, index) {
        $scope.topicData.snippetGroups[groupIndex].snippets.splice(index, 1);
    };

    $scope.deleteSnippetGroup = function(groupIndex) {
        $scope.topicData.snippetGroups.splice(groupIndex, 1);
    };

    $scope.saveContentTopic = function() {
        console.log("Saving content topic");
        saveContentTopic()
        $scope.editMode = false;
    };
});