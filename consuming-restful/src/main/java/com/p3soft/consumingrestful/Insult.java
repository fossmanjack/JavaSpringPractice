package com.p3soft.consumingrestful;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Insult (String insult, String createdBy) {
    // incoming record is { number: long, language: str, insult: str, created: str/date, shown: long, createdBy: str, active: int, comment: str }    
    // all we want to use is the insult and createdBy and dump the rest, hence the annotation
}
