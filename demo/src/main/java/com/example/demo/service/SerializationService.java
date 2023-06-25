package com.example.demo.service;

import com.example.demo.Model.JsonPropertyUser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationService {
    private ObjectMapper objectMapper;

    public SerializationService() {
        this.objectMapper = new ObjectMapper();
    }

    public String serialize(JsonPropertyUser user) {
        try {
            // Convert the object to JSON string using ObjectMapper
            String json = objectMapper.writeValueAsString(user);

            return json;

            // The below commented code also does the same operation but we aren't using Object Mapper.

            // String firstName = user.getFirstName();
            // String lastName = user.getLastName();
            // String currentAge = user.getCurrentAge();

            // StringBuilder jsonBuilder = new StringBuilder();
            // jsonBuilder.append("{");

            // if (firstName != null) {
            //     jsonBuilder.append("\"first_name\":\"").append(firstName).append("\",");
            // }

            // if (lastName != null) {
            //     jsonBuilder.append("\"last_name\":\"").append(lastName).append("\",");
            // }

            // if (currentAge != null) {
            //     jsonBuilder.append("\"current_age\":\"").append(currentAge).append("\",");
            // }

            // // Remove the trailing comma if any
            // if (jsonBuilder.charAt(jsonBuilder.length() - 1) == ',') {
            //     jsonBuilder.deleteCharAt(jsonBuilder.length() - 1);
            // }

            // jsonBuilder.append("}");

            // return jsonBuilder.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

