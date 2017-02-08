package org.amityregion5.terragame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Constants {
	public static final int BLOCK_SIZE = 32; //size of a block texture in pixels
	public static final int CHUNK_SIZE = 16; //size of a chunk in blocks
	public static final int PLAYER_HEIGHT = 3; //Height of the player in blocks
	public static final int PLAYER_WIDTH = 2; //width of the player in blocks
	public static final int RENDER_RADIUS = 8; //height/width of the loaded area in chunks
	public static final Texture WORLD_ATLAS = new Texture(Gdx.files.internal("world_atlas.png")); //the texture that is the atlas which contains things for the in game world, such as block textures, player sprite, etc
	public static final Texture MISSING_TEXTURE = new Texture(Gdx.files.internal("missing.png")); // the texture that gets used for whatever cannot find its file
	public static final Block ERROR_BLOCK = new Block(-1);
	public static final Block[] BLOCK_SET = {
			//is this efficient? nah. But it is easy
		new Block(0x00), new Block(0x01), new Block(0x02), new Block(0x03), new Block(0x04), new Block(0x05), new Block(0x06), new Block(0x07), 
		new Block(0x08), new Block(0x09), new Block(0x0a), new Block(0x0b), new Block(0x0c), new Block(0x0d), new Block(0x0e), new Block(0x0f), 
		
		new Block(0x10), new Block(0x11), new Block(0x12), new Block(0x13), new Block(0x14), new Block(0x15), new Block(0x16), new Block(0x17), 
		new Block(0x18), new Block(0x19), new Block(0x1a), new Block(0x1b), new Block(0x1c), new Block(0x1d), new Block(0x1e), new Block(0x1f), 
		
		new Block(0x20), new Block(0x21), new Block(0x22), new Block(0x23), new Block(0x24), new Block(0x25), new Block(0x26), new Block(0x27), 
		new Block(0x28), new Block(0x29), new Block(0x2a), new Block(0x2b), new Block(0x2c), new Block(0x2d), new Block(0x2e), new Block(0x2f), 
		
		new Block(0x30), new Block(0x31), new Block(0x32), new Block(0x33), new Block(0x34), new Block(0x35), new Block(0x36), new Block(0x37), 
		new Block(0x38), new Block(0x39), new Block(0x3a), new Block(0x3b), new Block(0x3c), new Block(0x3d), new Block(0x3e), new Block(0x3f), 
		
		new Block(0x40), new Block(0x41), new Block(0x42), new Block(0x43), new Block(0x44), new Block(0x45), new Block(0x46), new Block(0x47), 
		new Block(0x48), new Block(0x49), new Block(0x4a), new Block(0x4b), new Block(0x4c), new Block(0x4d), new Block(0x4e), new Block(0x4f), 
		
		new Block(0x50), new Block(0x51), new Block(0x52), new Block(0x53), new Block(0x54), new Block(0x55), new Block(0x56), new Block(0x57), 
		new Block(0x58), new Block(0x59), new Block(0x5a), new Block(0x5b), new Block(0x5c), new Block(0x5d), new Block(0x5e), new Block(0x5f), 
		
		new Block(0x60), new Block(0x61), new Block(0x62), new Block(0x63), new Block(0x64), new Block(0x65), new Block(0x66), new Block(0x67), 
		new Block(0x68), new Block(0x69), new Block(0x6a), new Block(0x6b), new Block(0x6c), new Block(0x6d), new Block(0x6e), new Block(0x6f), 
		
		new Block(0x70), new Block(0x71), new Block(0x72), new Block(0x73), new Block(0x74), new Block(0x75), new Block(0x76), new Block(0x77), 
		new Block(0x78), new Block(0x79), new Block(0x7a), new Block(0x7b), new Block(0x7c), new Block(0x7d), new Block(0x7e), new Block(0x7f), 
		};
	
	
}
