package org.amityregion5.terragame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.PixmapTextureData;
import java.io.FileReader;

public class Block {
	private TextureRegion[] parts;
	public String name;
	public byte id;
	
	public Block(int id) {
		
		try {
			FileReader read = new FileReader("Blocks/" + id + ".bok");
			read.close();
		} catch (Exception FileNotFound) {
			System.out.print("help");
			errorBlock();
		}
	}
	
	private void errorBlock() {
		this.id = -1;
	}
	//public Texture generateTexture() {
		//return Texture;
	//}
}
