package com.company.tweetservice.repository;

import com.company.tweetservice.entity.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
    @Query("select t from Tweet t where t.userId=:userId")
    Optional<Tweet> findByUserId(@Param("userId") Long userId);

    @Query("select t from Tweet t where t.id=:tweetId")
    Optional<Tweet> getTweetByTweetId(Long tweetId);
}

