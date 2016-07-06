//
// SnippetGroup.java
// WorldWiki
//
// Created by Matthew Remmel on 7/5/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.model.world.snippet;

import java.util.ArrayList;


public class SnippetGroup {

    // The title header for the snippet group
    private String title;

    // The collection of snippets in this group
    private ArrayList<Snippet> snippets;

    public SnippetGroup(String title) {
        this.title = title;
        this.snippets = new ArrayList<Snippet>();
    }

    public void addSnippet(Snippet snippet) {
        this.snippets.add(snippet);
    }
}
