package org.amityregion5.terragame;

import java.io.File;
import java.util.Scanner;

import com.badlogic.gdx.Gdx;

public class Chunk{
	public Block[][] blocks;
	
	public Chunk(int x, int y, String world) {
		loadChunk(x + "_" + y, world);
	}
	
	public Chunk(String chunk, String world) {
		loadChunk(chunk, world);
	}
	
	private void loadChunk (String coords, String world) {
		try {
			blocks = new Block[Constants.CHUNK_SIZE][Constants.CHUNK_SIZE];
			
			Scanner s = new Scanner(Gdx.files.internal("worlds/" + world + "/" + coords + ".cnk").readString()); {
				for (int i = 0; i < blocks.length; i++) {
					for (int j = 0; j < blocks[i].length; j++) {
						String str = s.next();
						str = str.trim();
						//System.out.print(str + " ");
						//String[] nums = str.split(" ");
						//for (int k = 0; k < nums.length; k++)
						blocks[i][j] = Constants.BLOCK_SET[Integer.parseInt(str)];
					}
					//System.out.print("\n");
				}
			}s.close();
		}catch (Exception e) {
			//String s;
			e.printStackTrace(System.out);
			System.out.println("Error with file: " + "worlds/" + world + "/" + coords + ".cnk");
			setEmpty();
		}
	}
	
	private void setEmpty () {
		for (int i = 0; i < blocks.length; i++)
			for (int j = 0; j < blocks[i].length; j++)
				blocks[i][j] = Constants.ERROR_BLOCK;
	}
	
	public String toString() {
		String s = "";
		for (Block[] blockrow: blocks) {
			for (Block block : blockrow)
				s += block.id + " ";
			s += "\n";
		}
		return s;
	}
}
