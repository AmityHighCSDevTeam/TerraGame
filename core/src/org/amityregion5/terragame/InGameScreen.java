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
	private Texture worldAtlas;
	private TextureRegion[] blocks;
	private TextureRegion player;
	private SpriteBatch batch = new SpriteBatch();
	private final int BLOCK_SIZE = 32;
	private final int PLAYER_WIDTH = 2;
	private final int PLAYER_HEIGHT = 3;
	
	public InGameScreen() {
		Thread gameLoopThread = new Thread(new GameLoop(), "Game Loop Thread"); 
		gameLoopThread.setDaemon(true);
		gameLoopThread.start();
	}
	
	@Override
	public void show() {
		Block b = new Block(0);
		cam = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getWidth());
		//bringing in textures for blocks
		worldAtlas = new Texture("world_atlas.png");
		blocks = new TextureRegion[128];
		for (int i = 0; i < blocks.length; i++) 
			blocks[i] = new TextureRegion(worldAtlas, BLOCK_SIZE * i, 0, BLOCK_SIZE, BLOCK_SIZE);
											// X-coord in atlas, Y in atlas, width in blocks, height in blocks
		player = new TextureRegion(worldAtlas, BLOCK_SIZE * 0, BLOCK_SIZE * 1, BLOCK_SIZE * PLAYER_WIDTH, BLOCK_SIZE * PLAYER_HEIGHT);
		
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
