//
// ContentTopicServices.js
// WorldWiki
//
// Created by Matthew Remmel on 7/7/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

angular.module('ContentTopic.services', []);
angular.module('ContentTopic.services').factory('ContentTopicService', function($http) {

    var ContentTopicAPI = {};

    ContentTopicAPI.getContentTopic = function(id) {
        return $http.get('localhost:8080/api/topic/' + id);
    }

    return ContentTopicAPI;
});
