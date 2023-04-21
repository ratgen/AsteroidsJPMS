package dk.sdu.mmmi.cbse.main;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;

public class Main extends GameApplication {

	@Override
	protected void initSettings(GameSettings settings) {
		settings.setWidth(800);
		settings.setHeight(600);
		settings.setTitle("Basic Game App");
	}

	public static void main(String[] args) {
		launch(args);
	}

}
