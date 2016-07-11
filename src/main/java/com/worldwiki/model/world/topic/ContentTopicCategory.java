//
// ContentTopicCategory.java
// WorldWiki
//
// Created by Matthew Remmel on 7/10/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.model.world.topic;

import java.util.ArrayList;


public class ContentTopicCategory {

    protected String title;
    protected ArrayList<ContentTopicReference> topicReferences;

    public ContentTopicCategory() {
        this.topicReferences = new ArrayList<ContentTopicReference>();
    }

    public ContentTopicCategory(String title) {
        this.title = title;
        this.topicReferences = new ArrayList<ContentTopicReference>();
    }
}
