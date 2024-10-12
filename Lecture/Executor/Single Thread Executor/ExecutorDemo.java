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

class Task1 extends Thread{
    public void run(){
        System.out.println("Task 1 Started");
        for(int i=0; i<10; i++){
            System.out.println("Thread :"+Thread.currentThread().getName()+" I "+i);
        }
        System.out.println("Task 1 Ended");
    }
}
class Task2 implements Runnable{
    public void run(){
        System.out.println("Task 2 Started");
        for(int i=10; i<20; i++){
            System.out.println("Thread :"+Thread.currentThread().getName()+" I "+i);
        }
        System.out.println("Task 2 Ended");
    }
}

class ExecutorDemo{
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));
        System.out.println("Task 3 Started");
        for(int i=30; i<40; i++){
            System.out.println("Thread :"+Thread.currentThread().getName()+" I "+i);
        }
        System.out.println("Task 3 Started");
        executorService.shutdown();
    }
}