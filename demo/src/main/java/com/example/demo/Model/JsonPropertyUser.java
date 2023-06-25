package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonPropertyUser {
    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("current_age")
    private String currentAge;

    // Constructors, getters, and setters

    public JsonPropertyUser() {
    }

    public JsonPropertyUser(String firstName, String lastName, String currentAge) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentAge = currentAge;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCurrentAge() {
        return currentAge;
    }

    public void setCurrentAge(String currentAge) {
        this.currentAge = currentAge;
    }
}
