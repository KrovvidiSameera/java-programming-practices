class ThreadDemo extends Thread {

    public void run() {
        System.out.println("Thread is running");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public static void main(String[] args) {

        ThreadDemo t1 = new ThreadDemo();

        // Set thread name
        t1.setName("MyThread");

        // Set thread priority
        t1.setPriority(Thread.MAX_PRIORITY);

        // Display thread details
        System.out.println("Thread Name     : " + t1.getName());
        System.out.println("Thread Priority : " + t1.getPriority());
        System.out.println("Thread Alive    : " + t1.isAlive());

        // Start thread
        t1.start();

        System.out.println("Current Thread  : "
                + Thread.currentThread().getName());

        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Thread Alive    : " + t1.isAlive());
    }
}
