package com.test.hammad;

public class MainClass {

	public static void main(String[] args) {
		SongsOf70s songsOf70s = new SongsOf70s();
		SongsOf80s songsOf80s = new SongsOf80s();
		SongsOf90s songsOf90s = new SongsOf90s();

		DiscJokey discJokey = new DiscJokey(songsOf70s, songsOf80s, songsOf90s);
		discJokey.showTheSongs();
	}
}
