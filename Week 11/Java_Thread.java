class College implements Runnable {
    String name;
    Thread t;
    int time;

    College(String threadname, int time) {
        name = threadname;
        this.time = time;
        t = new Thread(this, name);
        System.out.println("thread:" + t);
        t.start();
    }

    public void run() {
        try {
            if(name=="CSE"){
                for (int i = 10; i > 0; i--) {
                    System.out.println(name);
                    Thread.sleep(time);
                }
            }
            else{
                for (int i = 2; i > 0; i--) {
                    System.out.println(name);
                    Thread.sleep(time);
                }
            }
            
        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting.");
    }
}

class multithread {
    public static void main(String args[]) {
        College t1 = new College("BMS College of engineering", 10000);
        College t2 = new College("CSE", 2000);
    }
}