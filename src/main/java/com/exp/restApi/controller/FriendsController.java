package com.exp.restApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exp.restApi.model.Friends;
import com.exp.restApi.service.FriendsService;

@RestController
public class FriendsController {
	@Autowired
	private FriendsService friendsService;

	@PostMapping("/api/friends")
	Friends create(@RequestBody Friends friends) {
		return friendsService.save(friends);
	}

	@GetMapping("/api/friends")
	Iterable<Friends> read() {
		System.out.print("Rest callled...................");
		return friendsService.findAll();
	}

	@PutMapping("/api/friends")
	Friends update(@RequestBody Friends friends) {
		return friendsService.save(friends);
	}

	@DeleteMapping("/api/friends/{id}")
	void delete(@PathVariable Integer id) {
		friendsService.deleteById(id);
	}

}
