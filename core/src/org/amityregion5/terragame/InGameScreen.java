package org.amityregion5.terragame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.GdxRuntimeException;

public class InGameScreen implements Screen{

	private OrthographicCamera cam;
	private TextureRegion player;
	private SpriteBatch batch = new SpriteBatch();
	public World world;
	
	public InGameScreen() {
		Thread gameLoopThread = new Thread(new GameLoop(), "Game Loop Thread"); 
		gameLoopThread.setDaemon(true);
		gameLoopThread.start();
	}
	
	@Override
	public void show() {
		cam = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getWidth());
		
		
			
								// X-coord in atlas, Y in atlas, width in blocks, height in blocks
		player = new TextureRegion(Constants.WORLD_ATLAS, Constants.BLOCK_SIZE * 0, Constants.BLOCK_SIZE * 1, Constants.BLOCK_SIZE * Constants.PLAYER_WIDTH, Constants.BLOCK_SIZE * Constants.PLAYER_HEIGHT);
		world = new World("test");
		world.moveLoaded(-10, 5);
		System.out.print(world.loaded[8][8].toString());
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		
		batch.begin(); {
			
		
		} batch.end();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
