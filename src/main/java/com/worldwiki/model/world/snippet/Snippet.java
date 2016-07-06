//
// Snippet.java
// WorldWiki
//
// Created by Matthew Remmel on 7/5/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.model.world.snippet;

import java.util.ArrayList;


public abstract class Snippet {

    // The snippet type that defines what kind of content it contains
    protected SnippetType type;

    // The title of the snippet that describes the context of the snippet (Name, age, ect)
    protected String title;

    // A list of annotations or further detail provided for the GM, that's not revealed to the players
    protected ArrayList<String> annotations;

    // The truth level of the snippet about the accuracy of the content, that's not revealed to the players
    protected TruthLevel truthLevel;

    // The state of whether this snippet of information has been revealed to the players, and thus visible to them
    protected boolean revealed;

    // The style of the snippet, which provides the GM with context of how to present the content
    protected SnippetStyle style;
}
