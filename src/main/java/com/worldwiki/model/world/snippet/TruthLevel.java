//
// TruthLevel.java
// WorldWiki
//
// Created by Matthew Remmel on 7/5/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.model.world.snippet;

import com.fasterxml.jackson.annotation.JsonAutoDetect;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public enum TruthLevel {
    // Indicates that the information in the snippet is true
    Truth,

    // Indicates that the information in the snippet is only half true
    HalfTruth,

    // Indicates that the information in the snippet is false
    False
}
