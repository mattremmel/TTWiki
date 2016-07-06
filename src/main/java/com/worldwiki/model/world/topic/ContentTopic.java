//
// ContentTopic.java
// WorldWiki
//
// Created by Matthew Remmel on 7/5/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.model.world.topic;

import com.worldwiki.model.world.snippet.SnippetGroup;
import java.util.ArrayList;


public class ContentTopic {

    protected String topicID;
    protected ContentTopicType topicType;
    protected ArrayList<SnippetGroup> snippetGroups;
    // TODO: Hold links to other content

    public ContentTopic() {
        // TODO: Setup topicID
    }
}
