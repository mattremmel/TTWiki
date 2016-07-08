//
// ListSnippet.java
// WorldWiki
//
// Created by Matthew Remmel on 7/5/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.model.world.snippet;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.util.ArrayList;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ListSnippet extends Snippet {

    // The list text based content of this snippet
    protected ArrayList<String> content;

    // The source where the options for the list are defined
    protected String source;

    public ListSnippet() {
        this.content = new ArrayList<String>();
    }

    public ListSnippet(String source, String title) {
        this.source = source;
        this.title = title;
        this.content = new ArrayList<String>();
        this.annotations = new ArrayList<String>();
        this.truthLevel = TruthLevel.Truth;
        this.revealed = false;
        this.style = SnippetStyle.Normal;
    }
}
