//
// World.java
// WorldWiki
//
// Created by Matthew Remmel on 7/5/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.model.world;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.worldwiki.model.world.topic.ContentTopic;
import org.springframework.data.annotation.Id;
import java.util.ArrayList;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class World {

    @Id
    protected String worldID;
    protected String worldName;
    protected ArrayList<ContentTopic> topics;

    public World(String worldName) {
        this.worldName = worldName;
    }
}
