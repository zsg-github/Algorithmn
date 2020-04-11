package thread;


public class deadThread {
    private final Object left = new Object();
    private final Object right = new Object();

    public void leftRight() throws InterruptedException {
        // �õ�left��
        synchronized (left) {
            Thread.sleep(1000);
            // �õ�right��
            synchronized (right) {
                Thread.sleep(1000);
            }
        }
    }

    public void rightLeft() throws InterruptedException {
        // �õ�right��
        synchronized (right) {
            Thread.sleep(1000);
            // �õ�left��
            synchronized (left) {
                Thread.sleep(1000);
            }
        }
    }
}
