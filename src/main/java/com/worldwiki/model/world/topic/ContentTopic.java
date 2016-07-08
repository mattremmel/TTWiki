//
// ContentTopic.java
// WorldWiki
//
// Created by Matthew Remmel on 7/5/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.model.world.topic;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.worldwiki.model.world.snippet.SnippetGroup;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;


@Document(collection = "topics")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ContentTopic {

    @Id
    protected String topicID;
    protected ContentTopicType topicType;
    protected ArrayList<SnippetGroup> snippetGroups;
    // TODO: Hold links to other content

    public ContentTopic() {
        this.snippetGroups = new ArrayList<SnippetGroup>();
    }

    public String getID() {
        return topicID;
    }
}
