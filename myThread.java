/**
 * Thread : A thread works as a subprocess.
 * An application/process will have at least one thread.
 * Threads of an application are independent to each other.
 * Multithreading mean executing two or more tasks concurrently within a single program.
 * Example 1 : MS-word -> thread1 : spelling check
 *                        thread2 : autosave
 *                        thread3 : writing
 *                        thread4 : number of lines and so on.
 * Example 2 : Any-website : thread1 : pop-ups
 *                           thread2 : video
 *                           thread3 : audio
 *                           thread4 : auto-fill
 * 
 * There are two method to create thread.
 * (1)By extending thread class : Here we can use all method like sleep(),start(),stop() and so on.
 * (2)By implementing runnable interface : while creating thread by implementing runnable interface we can not use sleep(),statrt(),stop() and so on.
 * we can only implement run method becuase runnable interface does not support those method.
 * 
 * 
 * */
 import java.lang.*;
 class myThread1 extends Thread {
 	public void run(){
 		try{
 			for(int i = 1; i <= 5; i++){
                Thread.sleep(1000);
 				System.out.println("Extending thread-1....["+i+"]");
 			}
 		}catch(Exception e){
 			System.out.println(e);
 		}
 	}
 }

 class myThread2 extends Thread {
 	public void run(){
 		try{
 			for(int i = 1; i <= 5; i++){
                Thread.sleep(4000);
 				System.out.println("Extending thread-2....["+i+"]");
 			}
 		}catch(Exception e){
 			System.out.println(e);
 		}
 	}
 }

 class myThread3 implements Runnable{
    public void run(){
        try{
            for(int i = 1; i <= 5; i++){
                Thread.sleep(3000);
                System.out.println("Implementing thread-3....["+i+"]");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
 }

 class myThread4 implements Runnable{
    public void run(){
        try{
            for(int i = 1; i <= 5; i++){
                Thread.sleep(2000);
                System.out.println("Implementing thread-4....["+i+"]");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
 }

 public class myThread{
 	public static void main(String[] args) {
 		myThread1 mth1 = new myThread1();
 		myThread2 mth2 = new myThread2();
 		mth1.start();
 		mth2.start();

        myThread3 mth3 = new myThread3();
        myThread4 mth4 = new myThread4();
        Thread th1 = new Thread(mth3);
        Thread th2 = new Thread(mth4);
        th1.start();
        th2.start();
 	}
 }
