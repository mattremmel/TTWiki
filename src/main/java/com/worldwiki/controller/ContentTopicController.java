//
// ContentTopicController.java
// WorldWiki
//
// Created by Matthew Remmel on 7/5/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.controller;

import com.worldwiki.exception.ContentTopicNotFoundException;
import com.worldwiki.model.world.topic.ContentTopic;
import com.worldwiki.service.ContentTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@RestController
@RequestMapping("api/content")
public class ContentTopicController {

    private final ContentTopicService service;

    @Autowired
    ContentTopicController(ContentTopicService service) {
        this.service = service;
    }

    // Get Content Topic
    @RequestMapping(value = "{topicID}", method = RequestMethod.GET, produces = "application/json")
    public ContentTopic getContentTopic(@PathVariable String topicID) throws ContentTopicNotFoundException {
        return service.find(topicID);
    }

    // Create Content Topic
    @RequestMapping(value = "/", method = RequestMethod.POST, produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public ContentTopic createContentTopic(@RequestBody @Valid ContentTopic topic) {
        return service.create(topic);
    }

    // Update Content Topic
    @RequestMapping(value = "/", method = RequestMethod.POST, produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public ContentTopic updateContentTopic(@RequestBody @Valid ContentTopic topic) throws ContentTopicNotFoundException {
        return service.update(topic);
    }

    // Exception Handler
    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleContentTopicNotFound(ContentTopicNotFoundException ex) {
        return String.format("No content topic with id: %1$s", ex.getMessage());
    }
}
