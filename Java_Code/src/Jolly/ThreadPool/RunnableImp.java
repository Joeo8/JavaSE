package Jolly.ThreadPool;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Date: 2021/2/18
 * Time: 14:10
 * Description: No Description
 */
public class RunnableImp  implements  Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
