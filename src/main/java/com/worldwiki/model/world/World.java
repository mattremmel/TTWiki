//
// World.java
// WorldWiki
//
// Created by Matthew Remmel on 7/5/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.model.world;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.worldwiki.model.world.topic.ContentTopicCategory;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;


@Document(collection = "worlds")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class World {

    @Id
    protected String id;
    protected String title;
    protected ArrayList<ContentTopicCategory> topicCategories;

    public World() {
        this.topicCategories = new ArrayList<ContentTopicCategory>();
    }

    public World(String title) {
        this.title = title;
        this.topicCategories = new ArrayList<ContentTopicCategory>();
        this.topicCategories.add(new ContentTopicCategory("People"));
        this.topicCategories.add(new ContentTopicCategory("Places"));
        this.topicCategories.add(new ContentTopicCategory("Events"));
        this.topicCategories.add(new ContentTopicCategory("Things"));
        this.topicCategories.add(new ContentTopicCategory("Groups"));
        this.topicCategories.add(new ContentTopicCategory("Other"));
        this.topicCategories.add(new ContentTopicCategory("Unassigned"));
    }

    public String getID() {
        return this.id;
    }
}
