//
// WorldRepository.java
// WorldWiki
//
// Created by Matthew Remmel on 7/10/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.persistence;

import com.worldwiki.model.world.World;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface WorldRepository extends MongoRepository<World, String> {

}
