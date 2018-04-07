/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi_threaded_programming.runner_objects;

/**
 *
 * @author Asel
 */
public class Runner implements Runnable {
    private Thread thread;
    private String thread_name;

    public Runner(String name) {
        this.thread_name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {

                System.out.println(thread_name + " is Running " + i);
                Thread.sleep(100);

            }
        } catch (InterruptedException ex) {
            System.out.println("Error when running the thread : " + thread_name +" ERROR : " + ex.getMessage());
        }

        System.out.println(thread_name + " running compleated ...");
    }

    public void start() {
        if(null == thread){
            thread = new Thread(this,thread_name);
            thread.start();
        }
        System.out.println( thread_name + " is Started ...");
    }

}
