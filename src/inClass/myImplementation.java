package inClass;

public class myImplementation implements Runnable{

    @Override
    public void run() {
        RunningThreadCount();
    }

    public void RunningThreadCount(){
        for(int i = 0; i < 3; i++){
            System.out.println(Thread.currentThread().getName() + "->" + i);
        }
    }
    
}
