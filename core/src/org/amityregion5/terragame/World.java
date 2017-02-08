package org.amityregion5.terragame;

import java.util.Scanner;

import com.badlogic.gdx.Gdx;


public class World {
	public int[] size = new int[2];
	public Chunk[][] loaded;
	//private Location center; // the chunk that loading is centered around
	public Location playerLocation;
	public String name;
	public World(String name) {
		try {
			Scanner s = new Scanner(Gdx.files.internal("worlds/" + name + "/world.wrd").readString()); {
				size[0] = Integer.parseInt(s.next());
				size[1] = Integer.parseInt(s.next());
				playerLocation = new Location(Integer.parseInt(s.next()), Integer.parseInt(s.next()), Integer.parseInt(s.next()), Integer.parseInt(s.next()));
			}s.close();
			this.name = name;
			loadChunks(playerLocation);
		} catch (Exception e) {
			e.printStackTrace(System.out);
			System.out.print("Error with file: worlds/" + name + "/world.wrd");
		}
	}
	
	/*location is the location which the load should be centered around
	 * radius is the radius of chunks to load around the given location.
	 * Thge area to be loaded will be rectangular, because this programmer is lazy
	 */
	public void loadChunks(Location location) {
		loaded = new Chunk[Constants.RENDER_RADIUS * 2 + 1][Constants.RENDER_RADIUS * 2 + 1];
		for (int i = 0; i < loaded.length; i++) {
			for (int j = 0; j < loaded[i].length; j++) {
				loaded[i][j] = new Chunk(i + location.chunkX - Constants.RENDER_RADIUS, j + location.chunkY - Constants.RENDER_RADIUS, name);
			}
		}
	}
	
	/*
	 * This method will move the loaded chunks by the given values. 
	 * x positive is further right
	 * y positive is further up
	 * I'm gonna assume if you are reading this code you can extrapolate the rest
	 * should be less computationally taxing than loadChunks, but will shit if loaded is not already filled with chunks
	 */
	public void moveLoaded(int xMove, int yMove) {
		final int Render_Diameter = Constants.RENDER_RADIUS * 2 + 1;
		int i, j;
		if (xMove < 0) i = loaded.length;
		else i = 0;
		
		while (i < Render_Diameter && i > 0) {
			if (yMove < 0) j = loaded.length;
			else j = 0;
			
			while (j < Render_Diameter && j > 0) {
				try {
					loaded[i][j] = loaded[i + xMove][j + yMove];
				}catch (Exception e) {
					loaded[i][j] = new Chunk(playerLocation.chunkX - Constants.RENDER_RADIUS + i + xMove, playerLocation.chunkY - Constants.RENDER_RADIUS + j + yMove, name);
				}
				j += yMove;
			}
			i += xMove;
		}
	}
}
