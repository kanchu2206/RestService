package com.exp.restApi.service;

import org.springframework.stereotype.Service;
import org.springframework.data.repository.CrudRepository;

import com.exp.restApi.model.Friends;

@Service
public interface FriendsService extends CrudRepository<Friends, Integer> {

}
