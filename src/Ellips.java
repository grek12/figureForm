import java.awt.*;

class  Ellips extends Circle{
private int r2;
    public Ellips(int ax, int ay, int ar,int ar2) {
        super(ax, ay, ar);
        r2=ar2;
    }
    public void show(){

    }
    @Override
    public void  paint (Graphics g) {
        g.setColor(Color.white);
        g.drawOval(getX(), getY(), getR(), r2);
    }
}