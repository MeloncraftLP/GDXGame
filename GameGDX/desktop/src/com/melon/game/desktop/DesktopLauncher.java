package com.melon.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.melon.game.Main;

public class DesktopLauncher
{

	public static void main (String[] args)
	{

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 1350;
		config.height = 1000;
		new LwjglApplication(new Main(), config);

	}

}
