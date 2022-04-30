package com.knf.sibin.dto;

import java.util.List;

public class Raffle {

	private String candidates;
	private List<String> winners;

	public String getCandidates() {
		return candidates;
	}

	public void setCandidates(String candidates) {
		this.candidates = candidates;
	}

	public List<String> getWinners() {
		return winners;
	}

	public void setWinners(List<String> winners) {
		this.winners = winners;
	}

}
