import java.awt.*;

class  Rect extends Square{
private int B;
    public Rect(int ax, int ay, int aA,int aB) {
        super(ax, ay, aA);
        B=aB;
    }

    public void setB(int aB) {
        B = aB;
    }

    public int getB() {
        return B;
    }

    public void show(){

    }
    public void  paint (Graphics g) {
        g.setColor(Color.white);
        g.drawRect(getX(),getY(),getA(),getB());



    }
}