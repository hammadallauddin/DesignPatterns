package com.test.hammad;

public class DiscJokey {

	SongComponent songComponent;

	public DiscJokey(SongComponent songComponent) {
		this.songComponent = songComponent;
	}

	public void getSongList() {
		songComponent.displaySongInfo();
	}

}
