package com.example.timelineservice.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TweetResponseDTO {
    String text;
    int likeCount;
    LocalDateTime tweetDate;
    Set<ReviewResponseDTO> reviews;
    Long userId;
}
