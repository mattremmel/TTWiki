//
// ImageSnippet.java
// WorldWiki
//
// Created by Matthew Remmel on 7/5/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.model.world.snippet;

import com.fasterxml.jackson.annotation.JsonAutoDetect;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ImageSnippet extends Snippet {

    public ImageSnippet(String title) {
        this.type = SnippetType.ImageSnippet;
        this.title = title;
    }
}
