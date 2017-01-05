package org.amityregion5.terragame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.GdxRuntimeException;

public class InGameScreen implements Screen{

	private OrthographicCamera cam;
	private Texture[] blocks = new Texture[128];
	private int blockSize = 16;
	private Texture player;
	private SpriteBatch batch = new SpriteBatch();
	
	@Override
	public void show() {
		cam = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getWidth());
		//bringing in textures for blocks
		for (int i = 0; i < 128; i++) {
			try {
				blocks[i] = new Texture(Gdx.files.internal("blocks/" + i + ".png"));
			} catch (Exception GdxRuntimeException) {
				blocks[i] = new Texture(Gdx.files.internal("missing.png"));
			}
		}
		
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin(); {
			int w = Gdx.graphics.getWidth() / blockSize;
			for (int i = 0; i < 128; i++) {
				batch.draw(blocks[i], (i % w) * blockSize, (i / w) * blockSize, blockSize, blockSize);
			}
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
