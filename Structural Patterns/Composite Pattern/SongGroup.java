package com.test.hammad;

import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {

	ArrayList<SongComponent> songComponents = new ArrayList<>();

	String groupName;
	String groupDescription;

	public SongGroup(String groupName, String groupDescription) {
		super();
		this.groupName = groupName;
		this.groupDescription = groupDescription;
	}

	public String getGroupName() {
		return groupName;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	public void add(SongComponent songComponent) {
		songComponents.add(songComponent);
	}

	public void remove(SongComponent songComponent) {
		songComponents.remove(songComponent);
	}

	public SongComponent getComponent(int componentIndex) {
		return (SongComponent) songComponents.get(componentIndex);
	}

	public void displaySongInfo() {
		System.out.println("\n" + getGroupName() + " " + getGroupDescription());

		Iterator songIterator = songComponents.iterator();

		while (songIterator.hasNext()) {
			SongComponent songComponent = (SongComponent) songIterator.next();
			songComponent.displaySongInfo();
		}
	}
}
