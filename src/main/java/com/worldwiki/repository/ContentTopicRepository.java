//
// ContentTopicRepository.java
// WorldWiki
//
// Created by Matthew Remmel on 7/5/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.repository;

import com.worldwiki.model.world.topic.ContentTopic;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContentTopicRepository extends MongoRepository<ContentTopic, String> {

}
