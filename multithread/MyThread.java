package multithread;

class MyThread extends Thread  {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        int i = 1;
        while (true) {
            System.out.println(i + "World");
            i++;
        }
    }
}
