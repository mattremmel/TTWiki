//
// ImageSnippet.java
// WorldWiki
//
// Created by Matthew Remmel on 7/5/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.ttwiki.model.world.snippet;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.util.ArrayList;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ImageSnippet extends Snippet {

    // This is the image data
    protected byte[] data;

    public ImageSnippet() {
        this.annotations = new ArrayList<Annotation>();
    }

    public ImageSnippet(String title) {
        this.title = title;
        this.annotations = new ArrayList<Annotation>();
        this.truthLevel = TruthLevel.Truth;
        this.revealed = false;
        this.style = SnippetStyle.Normal;
    }
}
