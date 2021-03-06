package main;

public interface Tetorisu {
	int[][] blocks = {
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0},
		{0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},

		{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0},
		{0,1,1,0,0,0,1,0,0,1,0,0,0,1,1,1},
		{0,0,1,0,1,1,1,0,0,1,1,0,0,1,0,0},
		{0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0},

		{0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0},
		{0,1,1,0,1,1,1,0,0,0,1,0,0,1,0,0},
		{0,1,0,0,0,0,1,0,0,1,1,0,0,1,1,1},
		{0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},

		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,1,0,1,1,0,0,0,0,1,0,1,1,0,0},
		{0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0},
		{0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0},

		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,1,0,0,0,0,1,1,0,1,0,0,0,0,1,1},
		{0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0},
		{0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0},

		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,0},
		{0,1,1,0,1,1,1,0,1,1,0,0,1,1,1,0},
		{0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,0},

		{0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0},
		{0,1,0,0,1,1,1,1,0,1,0,0,1,1,1,1},
		{0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0},
		{0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0}
	};
	int[] block_index_x = {0,4,8,12};
	int BLOCK_NUM = 7;
	int[] block_index_y = {0,4,8,12,16,20,24};
	
	int[][] block = new int[4][4];
	int BLOCK_HEIGHT = 4;
	int BLOCK_WIDTH = 4;
	int FIELD_HEIGHT = 23;
	int FIELD_WIDTH = 16;
	int[][] stage = new int[FIELD_HEIGHT][FIELD_WIDTH];
	int[][] field = new int[FIELD_HEIGHT][FIELD_WIDTH];

	int[][] collision_field = new int[FIELD_HEIGHT][FIELD_WIDTH];
	
	int SEARCH_START_Y = 19;
	int SEARCH_START_X = 3;

		
}
