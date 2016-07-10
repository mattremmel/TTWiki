//
// ContentTopicControllers.js
// WorldWiki
//
// Created by Matthew Remmel on 7/7/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

angular.module('ContentTopic.controllers', []);
angular.module('ContentTopic.controllers').controller('ContentTopicController', function($scope, ContentTopicService) {

    ContentTopicService.getContentTopic('57800722d4c62d383380acb6')
        .then(function success(data, status, headers) {
            $scope.topicData = data.data;
        }, function failed(data, status, headers, config) {
        console.log(status + ' ' + data.statusText);
        });

    function saveContentTopic() {
        ContentTopicService.updateContentTopic($scope.topicData)
            .then(function success(response) {
                console.log(response.statusText)
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

    $scope.saveContentTopic = function() {
        console.log("Saving content topic");
        saveContentTopic()
        $scope.editMode = false;
    };
});