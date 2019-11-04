package com.test.hammad;

public class SongInfo {
	String songName;
	String bandName;
	int yearReleased;

	public SongInfo(String songName, String bandName, int yearReleased) {
		super();
		this.songName = songName;
		this.bandName = bandName;
		this.yearReleased = yearReleased;
	}

	public String getSongName() {
		return songName;
	}

	public String getBandName() {
		return bandName;
	}

	public int getYearReleased() {
		return yearReleased;
	}

}
