//
// WorldService.java
// WorldWiki
//
// Created by Matthew Remmel on 7/10/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.service;

import com.worldwiki.exception.WorldNotFoundException;
import com.worldwiki.model.world.World;
import com.worldwiki.persistence.WorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WorldService {

    private final WorldRepository repository;

    @Autowired
    public WorldService(WorldRepository repository) {
        this.repository = repository;
    }

    public World create(World world) {
        World saved = repository.save(world);
        return saved;
    }

    public World deleteOne(String id) throws WorldNotFoundException {
        World deleted = findOne(id);
        if (deleted != null) {
            repository.delete(id);
        }

        return deleted;
    }

    public World findOne(String id) throws WorldNotFoundException {
        World found = repository.findOne(id);
        if (found != null) {
            return found;
        }
        else {
            throw new WorldNotFoundException(id);
        }
    }

    public World updateOne(World world) throws WorldNotFoundException {
        World old = findOne(world.getID());
        if (old != null) {
            World updated = repository.save(world);
            return updated;
        }
        else {
            return old;
        }
    }
}
