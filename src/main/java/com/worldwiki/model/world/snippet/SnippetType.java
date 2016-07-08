//
// SnippetType.java
// WorldWiki
//
// Created by Matthew Remmel on 7/5/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.model.world.snippet;

import com.fasterxml.jackson.annotation.JsonAutoDetect;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public enum SnippetType {
    // The basic text based content snippet
    TextSnippet,

    // Content pulled from a defined list
    ListSnippet,

    // Snippet that represents a date in time
    DateSnippet,

    // Snippet with image content
    ImageSnippet
}
