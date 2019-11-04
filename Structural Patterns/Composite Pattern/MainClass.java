package com.test.hammad;

public class MainClass {

	public static void main(String[] args) {

		SongComponent industrialMusic = new SongGroup("Industrail", "It is Industrail music");
		SongComponent heavyMetalMusic = new SongGroup("HeavyMetal", "It is HeavyMetal music");
		SongComponent dubstep = new SongGroup("Dubstep", "It is Dubstep music");

		SongComponent everySong = new SongGroup("Song List", "Every Song Available");

		everySong.add(industrialMusic);
		everySong.add(heavyMetalMusic);
		everySong.add(dubstep);

		industrialMusic.add(new Song("Song 1", "Artist1", "1912"));
		industrialMusic.add(new Song("Song 2", "Artist2", "1913"));

		heavyMetalMusic.add(new Song("Song 3", "Artist3", "1922"));
		heavyMetalMusic.add(new Song("Song 4", "Artist4", "1923"));

		dubstep.add(new Song("Song 5", "Artist5", "1942"));
		dubstep.add(new Song("Song 6", "Artist6", "1943"));

		DiscJokey discJokey = new DiscJokey(everySong);
		discJokey.getSongList();
	}
}
