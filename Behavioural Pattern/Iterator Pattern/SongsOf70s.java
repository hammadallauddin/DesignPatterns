package com.test.hammad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongsOf70s implements SongIterator {

	List<SongInfo> bestSongs;

	public SongsOf70s() {
		bestSongs = new ArrayList<SongInfo>();

		addSong("Song 1", "Artist 1", 1971);
		addSong("Song 2", "Artist 2", 1973);
		addSong("Song 3", "Artist 3", 1974);
	}

	public void addSong(String songName, String bandName, int yearReleased) {
		SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
		bestSongs.add(songInfo);
	}

	// Not a good code
	/*
	 * public List<SongInfo> getBestSongs() { return bestSongs; }
	 */

	@Override
	public Iterator createIterator() {
		return bestSongs.iterator();
	}
}
