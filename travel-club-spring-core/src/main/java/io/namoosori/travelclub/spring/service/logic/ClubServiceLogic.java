package io.namoosori.travelclub.spring.service.logic;

import java.util.List;

import io.namoosori.travelclub.spring.aggregate.club.TravelClub;
import io.namoosori.travelclub.spring.service.ClubService;
import io.namoosori.travelclub.spring.service.sdo.TravelClubCdo;
import io.namoosori.travelclub.spring.shared.NameValueList;
import io.namoosori.travelclub.spring.store.ClubStore;
import io.namoosori.travelclub.spring.store.mapstore.ClubMapStore;

public class ClubServiceLogic implements ClubService{

	private ClubStore clubStore;

	public ClubServiceLogic() {
		this.clubStore = new ClubMapStore();
	}

	@Override
	public String registerClub(TravelClubCdo club) {
		clubStore.create();
		return null;
	}

	@Override
	public TravelClub findClubById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TravelClub> findClubsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modify(String clubId, NameValueList nameValues) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String clubId) {
		// TODO Auto-generated method stub
		
	}
	
}
