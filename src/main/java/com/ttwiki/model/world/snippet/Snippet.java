//
// Snippet.java
// WorldWiki
//
// Created by Matthew Remmel on 7/5/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.ttwiki.model.world.snippet;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(value = TextSnippet.class, name = "text"),
        @JsonSubTypes.Type(value = DateSnippet.class, name = "date"),
        @JsonSubTypes.Type(value = ImageSnippet.class, name = "image"),
})
public abstract class Snippet {

    // The title of the snippet that describes the context of the snippet (Name, age, ect)
    protected String title;

    // A list of annotations or further detail provided for the GM, that's not revealed to the players
    protected ArrayList<Annotation> annotations;

    // The truth level of the snippet about the accuracy of the content, that's not revealed to the players
    protected TruthLevel truthLevel;

    // The state of whether this snippet of information has been revealed to the players, and thus visible to them
    protected boolean revealed;

    // The style of the snippet, which provides the GM with context of how to present the content
    protected SnippetStyle style;

    public Snippet() {
        this.annotations = new ArrayList<Annotation>();
    }
}
