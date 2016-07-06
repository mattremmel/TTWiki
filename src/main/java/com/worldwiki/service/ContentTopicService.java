//
// ContentTopicService.java
// WorldWiki
//
// Created by Matthew Remmel on 7/5/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.service;

import com.worldwiki.exception.ContentTopicNotFoundException;
import com.worldwiki.model.world.topic.ContentTopic;
import com.worldwiki.repository.ContentTopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContentTopicService {

    private final ContentTopicRepository repository;

    @Autowired
    public ContentTopicService(ContentTopicRepository repository) {
        this.repository = repository;
    }

    public ContentTopic create(ContentTopic topic) {
        ContentTopic saved = repository.save(topic);
        return saved;
    }

    public ContentTopic deleteOne(String id) throws ContentTopicNotFoundException {
        ContentTopic deleted = findOne(id);
        if (deleted != null) {
            repository.delete(id);
        }

        return deleted;
    }

    public ContentTopic findOne(String id) throws ContentTopicNotFoundException {
        ContentTopic found = repository.findOne(id);
        if (found != null) {
            return found;
        }
        else {
            throw new ContentTopicNotFoundException(id);
        }
    }

    public ContentTopic updateOne(ContentTopic topic) throws ContentTopicNotFoundException {
        ContentTopic old = findOne(topic.getID());
        if (old != null) {
            ContentTopic updated = repository.save(topic);
            return updated;
        }
        else {
            return old;
        }
    }
}