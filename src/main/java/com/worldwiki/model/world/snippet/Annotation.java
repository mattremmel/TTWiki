//
// Annotation.java
// WorldWiki
//
// Created by Matthew Remmel on 7/13/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.model.world.snippet;

import com.fasterxml.jackson.annotation.JsonAutoDetect;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Annotation {
    protected boolean revealed;
    protected String content;

    public Annotation() {

    }
}
