package obj;

public class base {
	String symbol;
	int posx;
	int posy;
	boolean stop;
	boolean push;
	boolean eat;
	
	public base(int x,int y) {
		posx = x;
		posy = y;
		symbol = " ";
		stop = false;
		push = false;
		eat = false;
	}
	public base(int x,int y,String sym,boolean isStop,boolean isPush,boolean isEat) {
		posx = x;
		posy = y;
		symbol = sym;
		stop = isStop;
		push = isPush;
		eat = isEat;
	}
	public int getX() {
		return posx;
	}
	public int getY() {
		return posy;
	}
	public boolean isStop() {
		return stop;
	}
	public boolean isPush() {
		return push;
	}
	public boolean isEat() {
		return eat;
	}
	public String draw() {
		return symbol;
	}
}
