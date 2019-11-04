package com.test.hammad;

public class Song extends SongComponent {

	String songName;
	String bandName;
	String yearOfRelease;

	public Song(String songName, String bandName, String year) {
		super();
		this.songName = songName;
		this.bandName = bandName;
		this.yearOfRelease = year;
	}

	public String getSongName() {
		return songName;
	}

	public String getBandName() {
		return bandName;
	}

	public String getReleaseYear() {
		return yearOfRelease;
	}

	public void displaySongInfo() {
		System.out.println(getSongName() + " was recorded by " + getBandName() + " in " + getReleaseYear());
	}

}
