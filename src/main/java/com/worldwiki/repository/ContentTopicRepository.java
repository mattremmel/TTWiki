//
// ContentTopicRepository.java
// WorldWiki
//
// Created by Matthew Remmel on 7/5/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.repository;

import com.worldwiki.model.world.topic.ContentTopic;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ContentTopicRepository extends MongoRepository<ContentTopic, String> {

    public ContentTopic find(String id);
    public ContentTopic save(ContentTopic topic);
    public void delete(ContentTopic topic);
}
