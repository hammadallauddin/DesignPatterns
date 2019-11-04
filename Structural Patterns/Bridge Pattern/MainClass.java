package com.test.hammad;

public class MainClass {

	public static void main(String[] args) {

		Remote pauseTvRemote = new TvRemotePause(new TvDevice(1, 200));
		Remote muteTvRemote = new TvRemoteMute(new TvDevice(1, 200));

		pauseTvRemote.buttonFivePressed();
		pauseTvRemote.buttonSixPressed();
		pauseTvRemote.buttonNinePressed();
		pauseTvRemote.deviceFeeback();

		System.out.println();

		muteTvRemote.buttonFivePressed();
		muteTvRemote.buttonSixPressed();
		muteTvRemote.buttonNinePressed();
		muteTvRemote.deviceFeeback();

		System.out.println();

		Remote pauseDvdRemote = new TvRemotePause(new TvDevice(1, 200));
		Remote muteDvdRemote = new TvRemoteMute(new TvDevice(1, 200));

		pauseDvdRemote.buttonFivePressed();
		pauseDvdRemote.buttonSixPressed();
		pauseDvdRemote.buttonNinePressed();
		pauseDvdRemote.deviceFeeback();

		System.out.println();

		muteDvdRemote.buttonFivePressed();
		muteDvdRemote.buttonSixPressed();
		muteDvdRemote.buttonNinePressed();
		muteDvdRemote.deviceFeeback();
	}
}
