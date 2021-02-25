package com.tts.Tweeter.service;

import com.tts.Tweeter.model.Tweet;
import com.tts.Tweeter.model.TweetDisplay;
import com.tts.Tweeter.model.User;

import java.util.List;
import java.util.Optional;

public interface TweetService {

    List<TweetDisplay> findAll();
    List<TweetDisplay> findAllByUser(User user);
    List<TweetDisplay> findAllByUsers(List<User> users);
    void save(Tweet tweet);
    Optional<Tweet> findById(Long id);
    List<TweetDisplay> findAllWithTag(String tag);
    void handleTags(Tweet tweet);
    List<TweetDisplay> formatTweets(List<Tweet> tweets);
    void addTagLinks(List<Tweet> tweets);
    void shortenLinks(List<Tweet> tweets);
    List<TweetDisplay> formatTimestamps(List<Tweet> tweets);

    // optional method, does not need to be implemented
    // mostly here for testing

}