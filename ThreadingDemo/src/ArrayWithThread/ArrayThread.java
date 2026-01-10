package ArrayWithThread;

public class ArrayThread implements Runnable {

    private int[] arr;
    private ArrayApplication app;

    public ArrayThread(ArrayApplication app, int[] arr) {
        this.app = app;
        this.arr = arr;
        Thread t = new Thread(this);
		t.start();
    }

    @Override
    public void run() {
        app.display(arr);
        
    }
}
