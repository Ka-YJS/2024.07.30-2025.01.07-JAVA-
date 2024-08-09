package ex01_interface;

public class ColorPoint extends Point {
	
	String color;
	
	public ColorPoint(int y,int x, String color) {
		super(x,y);
		this.color = color;
		
	}
    public void setXY(int x, int y) {
        move(x,y);
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        
        return color+"색의 ("+getx()+","+gety()+")의 점";
    }


}
