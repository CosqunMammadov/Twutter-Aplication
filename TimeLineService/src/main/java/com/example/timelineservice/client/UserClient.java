package com.example.timelineservice.client;

import com.example.timelineservice.model.dto.response.UserResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Set;

@FeignClient(name = "userClient", value = "localhost:8081/twutter")
public interface UserClient {

    @RequestMapping(method = RequestMethod.POST, value = "/users/get-users-by-id")
    Set<UserResponseDTO> getUsersById(@RequestBody Set<Long> usersId);
}
