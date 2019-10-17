import java.awt.*;
class t18 extends Frame implements Runnable
{
 Thread t1,t2;
  t18()
  {
    t1=new Thread(this);
    t2=new Thread(this);
    t1.start();
    t2.start();
   }
  public t18(String title)
   {
     super(title);
     }
  public void run()
   {
     try{
     t18 o1=new t18("my frame-1");
     t18 o2=new t18("my frame-2");
     o1.setSize(500,500);
     o2.setSize(500,500);
      for(int i=0;i<5;i++){
                            o1.setVisible(true);
                            t1.sleep(2000);
                            o1.setVisible(false);
                            o2.setVisible(true);
                            t2.sleep(2000);
                            o2.setVisible(false);
                           }                    
     }
      catch(Exception e) 
       {}
     }
 }
class thread8
{
 public static void main(String args[])
  {
    t18 a1=new t18();
   }
 }
     