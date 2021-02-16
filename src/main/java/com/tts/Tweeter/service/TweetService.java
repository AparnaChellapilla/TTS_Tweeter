package com.tts.Tweeter.service;

import com.tts.Tweeter.model.Tweet;
import com.tts.Tweeter.model.User;

import java.util.List;
import java.util.Optional;

public interface TweetService {

    List<Tweet> findAll();

    List<Tweet> findAllByUser(User user);

    List<Tweet> findAllByUsers(List<User> users);

    void save(Tweet tweet);

    // optional method, does not need to be implemented
    // mostly here for testing
    Optional<Tweet> findById(Long id);
}