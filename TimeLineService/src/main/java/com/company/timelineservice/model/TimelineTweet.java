package com.company.timelineservice.model;

import com.company.timelineservice.model.dto.response.TweetResponseDTO;
import com.company.timelineservice.model.dto.response.UserResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TimelineTweet {
    UserResponseDTO userResponseDTO;
    Set<TweetResponseDTO> tweets;
}
