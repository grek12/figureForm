import java.awt.*;

abstract class Figure {
   private int x,y;
   public Figure(int ax, int ay){
       x=ax;
       y=ay;
   }
    public  void setXY(int ax,int ay){
       this.x= ax;
       this.y = ay;
   }
     public int getX() {
         return x;
     }

     public int getY() {
         return y;
     }

       abstract void show();
   abstract  void paint(Graphics g);

   final void MoveTo(int ax, int ay){
       show();
       x=getX()+ax;
       y=getY()+ay;
       show();
   }

 }



