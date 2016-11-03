//
// SnippetStyle.java
// WorldWiki
//
// Created by Matthew Remmel on 7/5/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.ttwiki.model.world.snippet;

import com.fasterxml.jackson.annotation.JsonAutoDetect;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public enum SnippetStyle {
    // The default style for a snippet
    Normal,

    // Styling that indicates that the content should be read aloud to the players
    ReadAloud,

    // Styling that indicates that the content is a message or handout for the players
    Message,

    // Styling that indicates that the content is meant to add flavor and background
    Flavor,
}
