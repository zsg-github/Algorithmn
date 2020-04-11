package thread;


public class deadThread {
    private final Object left = new Object();
    private final Object right = new Object();

    public void leftRight() throws InterruptedException {
        // 得到left锁
        synchronized (left) {
            Thread.sleep(1000);
            // 得到right锁
            synchronized (right) {
                Thread.sleep(1000);
            }
        }
    }

    public void rightLeft() throws InterruptedException {
        // 得到right锁
        synchronized (right) {
            Thread.sleep(1000);
            // 得到left锁
            synchronized (left) {
                Thread.sleep(1000);
            }
        }
    }
}
