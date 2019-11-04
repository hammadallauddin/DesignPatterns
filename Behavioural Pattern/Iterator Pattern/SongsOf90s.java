package com.test.hammad;

import java.util.Hashtable;
import java.util.Iterator;

public class SongsOf90s implements SongIterator {

	Hashtable<Integer, SongInfo> bestSongs;
	int hashKey = 0;

	public SongsOf90s() {
		bestSongs = new Hashtable<Integer, SongInfo>();

		addSong("Song 1", "Artist 1", 1991);
		addSong("Song 2", "Artist 2", 1993);
		addSong("Song 3", "Artist 3", 1994);
	}

	public void addSong(String songName, String bandName, int yearReleased) {
		SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
		bestSongs.put(hashKey, songInfo);
		hashKey++;
	}

	public Hashtable<Integer, SongInfo> getBestSongs() {
		return bestSongs;
	}

	@Override
	public Iterator createIterator() {
		return bestSongs.values().iterator();
	}
}
