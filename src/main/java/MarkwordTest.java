import org.openjdk.jol.info.ClassLayout;

import javax.swing.*;

public class MarkwordTest {


    public static void main(String[] args) {
        final Object o=new Object();

        System.out.println(ClassLayout.parseInstance(o).toPrintable());
        for (int i=0;i<100;i++) {

            new Thread(new Runnable() {
                @Override
                public void run() {
                    test11(o);

                }
            }, ""+i).start();
        }



    }


    public static void test11(Object o)  {
        synchronized (o){
            System.out.println(Thread.currentThread().getName()+"---"+ClassLayout.parseInstance(o).toPrintable());
        }
    }
}
