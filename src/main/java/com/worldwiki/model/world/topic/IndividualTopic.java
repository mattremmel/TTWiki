//
// IndividualTopic.java
// WorldWiki
//
// Created by Matthew Remmel on 7/5/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.model.world.topic;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.worldwiki.model.world.snippet.*;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class IndividualTopic extends ContentTopic {
    
    public IndividualTopic() {

        // Set topic type
        this.type = ContentTopicType.Individual;

        // Name
        SnippetGroup name = new SnippetGroup("Name");
        name.addSnippet(new TextSnippet("Name"));
        name.addSnippet(new TextSnippet("Prefix"));
        name.addSnippet(new TextSnippet("Suffix"));
        this.snippetGroups.add(name);

        // Overview
        SnippetGroup overview = new SnippetGroup("Overview");
        overview.addSnippet(new ListSnippet("races", "Race"));
        overview.addSnippet(new ListSnippet("gender", "Gender"));
        overview.addSnippet(new ListSnippet("age", "Age"));
        overview.addSnippet(new ListSnippet("class", "Class"));
        overview.addSnippet(new ListSnippet("role", "Role"));
        overview.addSnippet(new ListSnippet("condition", "Condition"));
        overview.addSnippet(new ImageSnippet("Portrait"));
        overview.addSnippet(new TextSnippet("Summary"));
        this.snippetGroups.add(overview);

        // Profile
        SnippetGroup profile = new SnippetGroup("Profile");
        profile.addSnippet(new ListSnippet("appearance-traits", "Appearance Traits"));
        profile.addSnippet(new ListSnippet("social-traits", "Social Traits"));
        profile.addSnippet(new TextSnippet("Stat Block"));
        profile.addSnippet(new TextSnippet("Reputation"));
        profile.addSnippet(new TextSnippet("Physical Description"));
        profile.addSnippet(new TextSnippet("Defining Quote"));
        this.snippetGroups.add(profile);

        // Story
        SnippetGroup story = new SnippetGroup("Story");
        story.addSnippet(new TextSnippet("Quest Ties"));
        story.addSnippet(new TextSnippet("Rumors"));
        story.addSnippet(new TextSnippet("Falsehoods"));
        story.addSnippet(new TextSnippet("Public Story"));
        story.addSnippet(new TextSnippet("Real Truths"));
        story.addSnippet(new DateSnippet("Important Date"));
        story.addSnippet(new TextSnippet("Common Misconceptions"));
        this.snippetGroups.add(story);

        // Motivation and Philosophy
        SnippetGroup motivationAndPhilosophy = new SnippetGroup("Motivation and Philosophy");
        motivationAndPhilosophy.addSnippet(new ListSnippet("mental-traits", "Mental Traits"));
        motivationAndPhilosophy.addSnippet(new TextSnippet("Attitude"));
        motivationAndPhilosophy.addSnippet(new TextSnippet("Reactions"));
        motivationAndPhilosophy.addSnippet(new TextSnippet("Beliefs"));
        motivationAndPhilosophy.addSnippet(new TextSnippet("Ideology's"));
        motivationAndPhilosophy.addSnippet(new TextSnippet("Faith"));
        motivationAndPhilosophy.addSnippet(new TextSnippet("Aspirations"));
        motivationAndPhilosophy.addSnippet(new TextSnippet("Goals"));
        this.snippetGroups.add(motivationAndPhilosophy);

        // Professional Life
        SnippetGroup professionalLife = new SnippetGroup("Professional Life");
        professionalLife.addSnippet(new ListSnippet("expertise", "Expertise"));
        professionalLife.addSnippet(new TextSnippet("Friends"));
        professionalLife.addSnippet(new TextSnippet("Allies"));
        professionalLife.addSnippet(new TextSnippet("Rivals"));
        professionalLife.addSnippet(new TextSnippet("Enemies"));
        professionalLife.addSnippet(new TextSnippet("Superiors"));
        professionalLife.addSnippet(new TextSnippet("Peers"));
        professionalLife.addSnippet(new TextSnippet("Subordinates"));
        professionalLife.addSnippet(new TextSnippet("Mentors"));
        professionalLife.addSnippet(new TextSnippet("Associates"));
        this.snippetGroups.add(professionalLife);

        // Other Endeavors
        SnippetGroup otherEndeavors = new SnippetGroup("Other Endeavors");
        otherEndeavors.addSnippet(new TextSnippet("Affiliations"));
        otherEndeavors.addSnippet(new TextSnippet("Organizations"));
        otherEndeavors.addSnippet(new TextSnippet("Friends"));
        otherEndeavors.addSnippet(new TextSnippet("Allies"));
        otherEndeavors.addSnippet(new TextSnippet("Rivals"));
        otherEndeavors.addSnippet(new TextSnippet("Enemies"));
        otherEndeavors.addSnippet(new TextSnippet("Influences"));
        this.snippetGroups.add(otherEndeavors);

        // Possessions
        SnippetGroup possessions = new SnippetGroup("Possessions");
        possessions.addSnippet(new TextSnippet("Carried Items"));
        possessions.addSnippet(new TextSnippet("Clothes"));
        possessions.addSnippet(new TextSnippet("Weapons"));
        possessions.addSnippet(new TextSnippet("Protective Gear"));
        possessions.addSnippet(new TextSnippet("Money"));
        possessions.addSnippet(new TextSnippet("Valuables"));
        this.snippetGroups.add(possessions);

        // Resources
        SnippetGroup resources = new SnippetGroup("Resources");
        resources.addSnippet(new ListSnippet("status-traits", "Status Traits"));
        resources.addSnippet(new TextSnippet("Wealth"));
        resources.addSnippet(new TextSnippet("Valuables"));
        resources.addSnippet(new TextSnippet("Supplies"));
        resources.addSnippet(new TextSnippet("Animals"));
        resources.addSnippet(new TextSnippet("Vehicles"));
        resources.addSnippet(new TextSnippet("Land"));
        resources.addSnippet(new TextSnippet("Structures"));
        resources.addSnippet(new TextSnippet("Property"));
        resources.addSnippet(new TextSnippet("Territory"));
        this.snippetGroups.add(resources);

        // Abilities
        SnippetGroup abilities = new SnippetGroup("Abilities");
        abilities.addSnippet(new ListSnippet("physical-traits", "Physical Traits"));
        abilities.addSnippet(new TextSnippet("Powers"));
        abilities.addSnippet(new TextSnippet("Talents"));
        abilities.addSnippet(new TextSnippet("Skills"));
        abilities.addSnippet(new TextSnippet("Extraordinary Qualities"));
        this.snippetGroups.add(abilities);

        // Methods
        SnippetGroup methods = new SnippetGroup("Methods");
        methods.addSnippet(new ListSnippet("personality-traits", "Personality Traits"));
        methods.addSnippet(new TextSnippet("Combat"));
        methods.addSnippet(new TextSnippet("Subterfuge"));
        methods.addSnippet(new TextSnippet("Diplomacy"));
        methods.addSnippet(new TextSnippet("Role"));
        methods.addSnippet(new TextSnippet("Training"));
        methods.addSnippet(new TextSnippet("Capabilities"));
        methods.addSnippet(new TextSnippet("Tactics"));
        methods.addSnippet(new TextSnippet("Style"));
        this.snippetGroups.add(methods);

        // Background
        SnippetGroup background = new SnippetGroup("Background");
        background.addSnippet(new DateSnippet("Birth Date"));
        background.addSnippet(new DateSnippet("Marriage"));
        background.addSnippet(new DateSnippet("Death Date"));
        background.addSnippet(new TextSnippet("Historical Details"));
        background.addSnippet(new TextSnippet("Obscure Trivia"));
        this.snippetGroups.add(background);

        // Additional Details
        SnippetGroup additionalDetails = new SnippetGroup("Additional Details");
        additionalDetails.addSnippet(new TextSnippet("Further Notes"));
        additionalDetails.addSnippet(new TextSnippet("Details"));
        additionalDetails.addSnippet(new TextSnippet("Tidbits"));
        this.snippetGroups.add(additionalDetails);
    }
}
