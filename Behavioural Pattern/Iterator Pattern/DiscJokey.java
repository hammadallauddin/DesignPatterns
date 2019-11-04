package com.test.hammad;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class DiscJokey {

//	SongsOf70s songsOf70s;
//	SongsOf80s songsOf80s;
//	SongsOf90s songsOf90s;

	SongIterator iter70sSongs;
	SongIterator iter80sSongs;
	SongIterator iter90sSongs;

	public DiscJokey(SongsOf70s songsOf70s, SongsOf80s songsOf80s, SongsOf90s songsOf90s) {
		super();

//		this.songsOf70s = songsOf70s;
//		this.songsOf80s = songsOf80s;
//		this.songsOf90s = songsOf90s;

		iter70sSongs = songsOf70s;
		iter80sSongs = songsOf80s;
		iter90sSongs = songsOf90s;
	}

//  BAD CODE	
//	public void showTheSongs() {
//
//		ArrayList<SongInfo> al70sSongs = (ArrayList<SongInfo>) songsOf70s.getBestSongs();
//		System.out.print("Songs of 70s\n");
//		for (int i = 0; i < al70sSongs.size(); i++) {
//			SongInfo songInfo = (SongInfo) al70sSongs.get(i);
//			System.out.println(songInfo.getSongName());
//			System.out.println(songInfo.getBandName());
//			System.out.println(songInfo.getYearReleased());
//		}
//
//		SongInfo[] al80sSongs = songsOf80s.getBestSongs();
//		System.out.print("Songs of 80s\n");
//		for (int i = 0; i < al80sSongs.length; i++) {
//			SongInfo songInfo = (SongInfo) al80sSongs[i];
//			System.out.println(songInfo.getSongName());
//			System.out.println(songInfo.getBandName());
//			System.out.println(songInfo.getYearReleased());
//		}
//
//		Hashtable<Integer, SongInfo> al90sSongs = songsOf90s.getBestSongs();
//		System.out.print("Songs of 80s\n");
//		for (int i = 0; i < al90sSongs.size(); i++) {
//			SongInfo songInfo = (SongInfo) al90sSongs.get(i);
//			System.out.println(songInfo.getSongName());
//			System.out.println(songInfo.getBandName());
//			System.out.println(songInfo.getYearReleased());
//		}
//	}

	public void showTheSongs() {

		Iterator songsOf70s = iter70sSongs.createIterator();
		Iterator songsOf80s = iter80sSongs.createIterator();
		Iterator songsOf90s = iter90sSongs.createIterator();

		System.out.print("Songs of 70s\n");
		printTheSongs(songsOf70s);

		System.out.print("Songs of 80s\n");
		printTheSongs(songsOf80s);

		System.out.print("Songs of 90s\n");
		printTheSongs(songsOf90s);
	}

	public void printTheSongs(Iterator songIterator) {
		SongInfo songInfo = (SongInfo) songIterator.next();
		System.out.println(songInfo.getSongName());
		System.out.println(songInfo.getBandName());
		System.out.println(songInfo.getYearReleased());
	}

}
