//
// WorldAPIController.java
// WorldWiki
//
// Created by Matthew Remmel on 7/10/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.api;

import com.worldwiki.exception.WorldNotFoundException;
import com.worldwiki.model.world.World;
import com.worldwiki.service.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/api/world")
public class WorldAPIController {

    private final WorldService service;

    @Autowired
    WorldAPIController(WorldService service) {
        this.service = service;
    }

    // Get World
    @RequestMapping(value = "{worldID}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public World getWorld(@PathVariable String worldID) throws WorldNotFoundException {
        return service.findOne(worldID);
    }

    // Create World
    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public World createWorld(@RequestBody @Valid World world) {
        return service.create(world);
    }

    // Update World
    @RequestMapping(value = "/update", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public World updateWorld(@RequestBody @Valid World world) throws WorldNotFoundException {
        return service.updateOne(world);
    }

    // Exception Handler
    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleWorldNotFound(WorldNotFoundException ex) {
        return String.format("{\"reason\": \"No world with id: %1$s\"}", ex.getMessage());
    }

    // Create Dummy World
    @RequestMapping(value = "/dummy", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public World createDummyWorld() {
        World w = new World();
        return service.create(w);
    }
}
