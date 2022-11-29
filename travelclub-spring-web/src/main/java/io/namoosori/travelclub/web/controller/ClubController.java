package io.namoosori.travelclub.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.namoosori.travelclub.web.aggregate.club.TravelClub;
import io.namoosori.travelclub.web.service.ClubService;
import io.namoosori.travelclub.web.service.sdo.TravelClubCdo;

@RestController
public class ClubController {
    
    private ClubService clubService;

    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }
 
    @PostMapping("/club")
    public String register(@RequestBody TravelClubCdo travelClubCdo) {
        return clubService.registerClub(travelClubCdo);
    }

    @GetMapping("/club/all")
    public List<TravelClub> findAll() {
        return clubService.findAll();
    }

    @GetMapping("/club/{clubId}")
    public TravelClub find(@PathVariable String clubId) {
        return clubService.findClubById(clubId);
    }

}
