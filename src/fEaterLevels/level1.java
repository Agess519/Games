package fEaterLevels;
import obj.*;

public class level1 {
	public static player Startlevel1(base[][] map) {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				map[i][j] = new base(i,j);
			}
		}
		for(int j=0;j<10;j++) {
			map[0][j] = new wall(0,j);
			map[9][j] = new wall(0,j);
		}
		for(int i=0;i<10;i++) {
			map[i][0] = new wall(i,0);
			map[i][9] = new wall(i,9);
		}
		player you = new player(5,5);
		map[5][5] = you;
		map[5][7] = new F(5,7);
		
		return you;
	}
}
