package multithreading;

import functionalProgramming.Student;

class Thread1 extends Thread{
    public void run(){
        for(int i = 0; i<50; i++){
            System.out.print("Hello ");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class Thread2 implements Runnable{
    public void run(){
        for(int i = 0; i<50; i++){
            String tname=Thread.currentThread().getName();
            System.out.println("Namaste " + tname);

        }
    }
}

class StudentThread implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i<50; i++){
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName());
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}

public class Threads {
    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
//        t1.start();

        Thread2 t2 = new Thread2();

        Thread thread1 = new Thread(t2);
        thread1.setName("Ram");
        thread1.setPriority(10);
//        thread1.start();

        Thread thread2 = new Thread(t2);
        thread2.setName("Shaym");
        thread2.setPriority(5);
//        thread2.start();

        Thread student = new Thread(new StudentThread());
        student.setName("student");
        student.start();
        Thread intern = new Thread(new StudentThread());
        intern.setName("Intern");
        try {
            student.join();
            intern.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
