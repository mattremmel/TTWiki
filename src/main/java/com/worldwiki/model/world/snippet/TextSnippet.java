//
// TextSnippet.java
// WorldWiki
//
// Created by Matthew Remmel on 7/5/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.model.world.snippet;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.ArrayList;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class TextSnippet extends Snippet {

    // The text based content of this snippet
    protected String content;

    public TextSnippet() {
        this.annotations = new ArrayList<Annotation>();
    }

    public TextSnippet(String title) {
        this.title = title;
        this.content = "";
        this.annotations = new ArrayList<Annotation>();
        this.truthLevel = TruthLevel.Truth;
        this.revealed = false;
        this.style = SnippetStyle.Normal;
    }
}
