import java.awt.*;

class  Circle extends Figure{
//136cnh
     private int r;


    public Circle(int ax, int ay,int ar) {
         super(ax, ay);
         r=ar;
     }

    public void setR(int ar) {
        this.r = ar;
    }

    public int getR() {
        return r;
    }


    @Override
    void show() {


    }

    public void  paint (Graphics g) {

        g.setColor(Color.white);
        g.drawOval(getX(), getY(), getR(), getR());



    }

}