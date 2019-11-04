package com.test.hammad;

import java.util.Arrays;
import java.util.Iterator;

public class SongsOf80s implements SongIterator {

	SongInfo[] bestSongs;
	int arrValue = 0;

	public SongsOf80s() {
		bestSongs = new SongInfo[3];
		addSong("Song 1", "Artist 1", 1981);
		addSong("Song 2", "Artist 2", 1983);
		addSong("Song 3", "Artist 3", 1984);
	}

	public void addSong(String songName, String bandName, int yearReleased) {
		SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
		bestSongs[arrValue] = songInfo;
		arrValue++;
	}

//  Not good Code
//	public SongInfo[] getBestSongs() {
//		return bestSongs;
//	}

	@Override
	public Iterator createIterator() {
		return Arrays.asList(bestSongs).iterator();
	}
}
