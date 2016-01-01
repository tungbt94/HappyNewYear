package eandd.tungbt94.control;

import eandd.tungbt94.model.Sound;

public class SoundControl {
	private Sound music;

	public SoundControl(Sound music) {
		this.music = music;
	}

	public Sound getMusic() {
		return music;
	}

	public void setMusic(Sound music) {
		this.music = music;
	}
}
