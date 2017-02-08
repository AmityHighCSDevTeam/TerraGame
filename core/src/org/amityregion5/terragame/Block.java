package org.amityregion5.terragame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.PixmapTextureData;

import java.io.File;
import java.util.Scanner;

public class Block {
	private TextureRegion texture;
	public String name;
	public byte id;
	public boolean passable;
	
	
	public Block(int id) {
		if (id == -1) setError(); else
		try {
			Scanner s = new Scanner(Gdx.files.internal("Blocks/" + "block" + id + ".bok").readString()); {
				texture = new TextureRegion(Constants.WORLD_ATLAS, id * Constants.BLOCK_SIZE, 0, Constants.BLOCK_SIZE, Constants.BLOCK_SIZE);
				name = s.nextLine();
				if(Integer.parseInt(s.nextLine()) == 1) 
					passable = true;
				else 
					passable = false;
				this.id = (byte) id;
			} s.close();
		} catch (Exception e) {
			//e.printStackTrace(System.out);
			System.out.println("Error with file: " + "Blocks/" + "block" + id + ".bok");
			setError();
		}
	}
	
	private void setError() {
		this.id = -1;
		texture = new TextureRegion(Constants.MISSING_TEXTURE);
		passable = false;
		name = "ERROR";
	}
}
