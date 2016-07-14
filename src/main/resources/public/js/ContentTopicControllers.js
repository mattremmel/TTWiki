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

    $scope.decodeBase64 = function(data) {
       return atob(data);
    } ;

    $scope.startEditMode = function() {
        $scope.editMode = true;
    };

    $scope.cancelEditMode = function() {
        // Reset topic data
        $scope.topicData = angular.copy(remoteTopicData);
        $scope.editMode = false;
    };

    $scope.setSnippetTruthLevel = function(groupIndex, snippetIndex, truthLevel) {
        $scope.topicData.snippetGroups[groupIndex].snippets[snippetIndex].truthLevel = truthLevel;
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

    $scope.addAnnotation = function(groupIndex, snippetIndex) {
        $scope.topicData.snippetGroups[groupIndex].snippets[snippetIndex].annotations.push(
            {"revealed": false,
            "content": ""
            }
        );
    };

    $scope.deleteSnippetGroup = function(groupIndex) {
        $scope.topicData.snippetGroups.splice(groupIndex, 1);
    };

    $scope.deleteSnippet = function(groupIndex, snippetIndex) {
        $scope.topicData.snippetGroups[groupIndex].snippets.splice(snippetIndex, 1);
    };

    $scope.deleteAnnotation = function(groupIndex, snippetIndex, annotationIndex) {
        $scope.topicData.snippetGroups[groupIndex].snippets[snippetIndex].annotations.splice(annotationIndex, 1);
    };

    $scope.saveContentTopic = function() {
        console.log("Saving content topic");
        saveContentTopic()
        $scope.editMode = false;
    };
});

angular.module('ContentTopic.controllers').directive("ngfileinput", [function () {
    return {
        scope: {
            ngfileinput: "="
        },
        link: function (scope, element, attributes) {
            element.bind("change", function (changeEvent) {
                var reader = new FileReader();
                reader.onload = function (loadEvent) {
                    scope.$apply(function () {
                        scope.ngfileinput = btoa(loadEvent.target.result);
                    });
                }
                reader.readAsDataURL(changeEvent.target.files[0]);
            });
        }
    }
}]);