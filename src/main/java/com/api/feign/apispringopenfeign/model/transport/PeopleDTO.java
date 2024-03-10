package com.api.feign.apispringopenfeign.model.transport;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PeopleDTO(String name, String height, String mass, @JsonProperty("hair_color") String hairColor) {
}
