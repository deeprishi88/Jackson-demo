package com.example.demo.service;

import com.example.demo.Model.JsonPropertyUser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserializationService {
    private ObjectMapper objectMapper;

    public DeserializationService() {
        // Initialize the ObjectMapper for JSON deserialization
        this.objectMapper = new ObjectMapper();
    }


    /**
     * Deserialize a JSON string to a JsonPropertyUser object.
     *
     * @param json the JSON string to deserialize
     * @return the deserialized JsonPropertyUser object
     */

    public JsonPropertyUser deserialize(String json) {
        try {
            return objectMapper.readValue(json, JsonPropertyUser.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // The below code  also does the same operation

    // public JsonPropertyUser deserialize(String json) {
    //     try {
    //         // Read the JSON string and create a JsonNode tree
    //         JsonNode rootNode = objectMapper.readTree(json);

    //         // Extract the values of each attribute from the JsonNode tree
    //         String firstName = getNodeValue(rootNode, "first_name");
    //         String lastName = getNodeValue(rootNode, "last_name");
    //         String currentAge = getNodeValue(rootNode, "current_age");

    //         // Create a new JsonPropertyUser object and set its attributes
    //         JsonPropertyUser user = new JsonPropertyUser();
    //         user.setFirstName(firstName);
    //         user.setLastName(lastName);
    //         user.setCurrentAge(currentAge);

    //         return user;
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //         return null;
    //     }
    // }

    // /**
    //  * Get the value of a field from a JsonNode.
    //  *
    //  * @param node      the JsonNode containing the field
    //  * @param fieldName the name of the field to retrieve
    //  * @return the value of the field as a string, or null if not found
    //  */
    // private String getNodeValue(JsonNode node, String fieldName) {
    //     // Get the JsonNode corresponding to the field
    //     JsonNode fieldNode = node.get(fieldName);
    //     // Return the field value as a string, or null if not found
    //     return (fieldNode != null) ? fieldNode.asText() : null;
    // }
}

