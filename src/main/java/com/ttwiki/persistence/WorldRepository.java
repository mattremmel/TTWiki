//
// WorldRepository.java
// WorldWiki
//
// Created by Matthew Remmel on 7/10/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.ttwiki.persistence;

import com.ttwiki.model.world.World;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface WorldRepository extends MongoRepository<World, String> {

}
