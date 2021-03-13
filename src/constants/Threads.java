package constants;

public class Threads {

    private boolean running = false;

    private Thread thread;

    public void start(Thread thread){
        thread = new Thread();
        thread.start();
        running = true;
    }

    public void stop(){
        try {
            thread.join();
            running = false;
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
