package com.example.demo.Controller;

import com.example.demo.Model.JsonPropertyUser;
import com.example.demo.service.DeserializationService;
import com.example.demo.service.SerializationService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private SerializationService serializationService;
    private DeserializationService deserializationService;

    public UserController(SerializationService serializationService, DeserializationService deserializationService) {
        this.serializationService = serializationService;
        this.deserializationService = deserializationService;
    }

    @PostMapping("/serialize")
    public String serializeUser(@RequestBody JsonPropertyUser user) throws JsonProcessingException {
        return serializationService.serialize(user);
    }

    @PostMapping("/deserialize")
    public JsonPropertyUser deserializeUser(@RequestBody String json) throws JsonProcessingException {
        return deserializationService.deserialize(json);
    }
}
