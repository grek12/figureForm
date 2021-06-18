import java.awt.*;

class  Square extends Figure{
private int A;
    public Square(int ax, int ay,int aA) {
        super(ax, ay);
        A=aA;
    }

    public void setA(int aA) {
        A = aA;
    }

    public int getA() {
        return A;
    }


    @Override
    void show() {

    }


    @Override
    public void  paint (Graphics g) {
        g.setColor(Color.white);
        g.drawRect(getX(),getY(),getA(),getA());
    }
}