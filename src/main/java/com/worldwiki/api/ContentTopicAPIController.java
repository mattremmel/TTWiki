//
// ContentTopicController.java
// WorldWiki
//
// Created by Matthew Remmel on 7/5/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.api;

import com.worldwiki.exception.ContentTopicNotFoundException;
import com.worldwiki.model.world.topic.ContentTopic;
import com.worldwiki.service.ContentTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@RestController
@RequestMapping("api/topic")
public class ContentTopicAPIController {

    private final ContentTopicService service;

    @Autowired
    ContentTopicAPIController(ContentTopicService service) {
        this.service = service;
    }

    // Get Content Topic
    @RequestMapping(value = "{topicID}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ContentTopic getContentTopic(@PathVariable String topicID) throws ContentTopicNotFoundException {
        return service.findOne(topicID);
    }

    // Create Content Topic
    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ContentTopic createContentTopic(@RequestBody @Valid ContentTopic topic) {
        return service.create(topic);
    }

    // Update Content Topic
    @RequestMapping(value = "/update", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ContentTopic updateContentTopic(@RequestBody @Valid ContentTopic topic) throws ContentTopicNotFoundException {
        return service.updateOne(topic);
    }

    // Exception Handler
    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleContentTopicNotFound(ContentTopicNotFoundException ex) {
        return String.format("{\"reason\": \"No content topic with id: %1$s\"}", ex.getMessage());
    }
}
