/*
 * 
 *  A D PATEL INSTITUTE OF TECHNOLOGY
 *  DEPARTMENT OF INFORMATION TECHNOLOGY
 *  PROGRAMMING WITH JAVA
 *  EXECUTOR FRAMEWORK
 * 
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{
    private int number;
    public Task(int number){
        this.number = number;
    }
    public void run(){
        System.out.println("Task "+number+" Started");
        for(int i=number; i<number+9; i++){
            System.out.println("Thread :"+Thread.currentThread().getName()+" I "+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Task "+number+" Ended");
    }
}

class ExecutorDemo{
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));
        executorService.execute(new Task(5));
        executorService.execute(new Task(6));
        executorService.execute(new Task(7));

        executorService.shutdown();
    }
}