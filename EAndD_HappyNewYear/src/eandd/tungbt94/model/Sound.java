package eandd.tungbt94.model;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineEvent.Type;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sound implements LineListener {

	private Clip clip;
	private Boolean isDone = false;

	public Sound(String soundName) {
		URL url = getClass().getResource("/Music/" + soundName);
		try {
			AudioInputStream soundInput = AudioSystem.getAudioInputStream(url);
			clip = AudioSystem.getClip();
			clip.open(soundInput);
			clip.addLineListener(this);
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}

	}

	public void play() {
		new Thread() {
			@Override
			public void run() {
				super.run();
				if (clip != null) {
					isDone = true;
					clip.start();
					while (isDone) {
						try {
							sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}.start();
	}

	public Sound loop(int count) {
		if (clip != null) {
			clip.loop(count);
		}
		return this;
	}

	@Override
	public void update(LineEvent event) {
		if (event.getType() == Type.STOP || event.getType() == Type.CLOSE) {
			isDone = false;
		}
	}

}
