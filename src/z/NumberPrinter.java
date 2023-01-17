package z;

import java.util.Random;
import java.util.concurrent.Callable;

public class NumberPrinter implements Callable {

    private int num;

    public NumberPrinter(int num) {
        this.num = num;
    }

    @Override
    public Object call() throws Exception {
        return new Random().nextInt();
    }


//    @Override
//    public void run() {
//        System.out.println(num + " "+Thread.currentThread().getName());
//    }
}
