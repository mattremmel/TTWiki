//
// TextSnippet.java
// WorldWiki
//
// Created by Matthew Remmel on 7/5/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.model.world.snippet;

import java.util.ArrayList;


public class TextSnippet extends Snippet {

    // The text based content of this snippet
    protected String content;

    public TextSnippet(String title) {
        this.type = SnippetType.TextSnippet;
        this.title = title;
        this.content = "";
        this.annotations = new ArrayList<String>();
        this.truthLevel = TruthLevel.Truth;
        this.revealed = false;
        this.style = SnippetStyle.Normal;
    }
}
