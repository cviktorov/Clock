package com.Clock;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;



public class AnimatedClock extends StillClock {
	private Timer timer;

	public AnimatedClock() {
		super();
		timer = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setCurrentTime();
				repaint();
			}
		});
		timer.start();
	}

	public Timer getTimer() {
		return timer;
	}

	public void setTimer(Timer timer) {
		this.timer = timer;
	}
	
	
	
	
}
