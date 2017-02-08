package org.amityregion5.terragame;



public class Location {
	public int chunkX;
	public int chunkY;
	public float fineX;
	public float fineY;
	
	/*
	 * Creates a new Location using the first 4 elements of the given array. 
	 * If the array length is < 4, the Location will be set to 0, 0, 0, 0
	 */
	public Location(int[] i) {
		if (i.length >= 4) {
			setLocation(i[0], i[1], i[2], i[3]);
		}else {
			setLocation(0, 0, 0, 0);
		}
	}
	/*
	 * Makes new location with chunk as the chunk coordinates and fine as the fine coordinates
	 * Both are [x,y]
	 */
	public Location(int[] chunk, float[] fine) {
		
	}
	
	/*
	 * makes new Location with the four numbers
	 * first 2 are chunk
	 * second 2 are fine
	 */
	public Location(int a, int b, float c, float d) {
		setLocation(a, b, c, d);
	}
	
	
	private void setLocation(int chunkx, int chunky, float finex, float finey) {
		chunkX = chunkx;
		chunkY = chunky;
		fineX = finex;
		fineY = finey;
	}
	
	public int[] getChunkLocation() {
		int[] nums = {chunkX, chunkY};
		return nums;
	}
	
	public float[] getFineLocation() {
		float[] nums = {fineX, fineY};
		return nums;
	}
}
