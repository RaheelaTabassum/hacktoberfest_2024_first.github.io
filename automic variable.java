class Counter extends Thread   
{   
// Counter Variable   
int count = 0;   
//the method starts the execution of a thread  
public void run()   
{   
int max = 1;   
//increments the counter variable up to specified max time  
for (int i = 0; i < max; i++)   
{   
count++;   
}   
}   
}   
public class Counter   
{   
public static void main(String args[]) throws InterruptedException   
{   
//creating an instance of the Counter class   
Counter c = new Counter();   
//creating four threads  
Thread t1 = new Thread(c, "First");   
Thread t2 = new Thread(c, "Second");   
Thread t3 = new Thread(c, "Third");   
Thread t4 = new Thread(c, "Fourth");   
//by calling the start() method, we have started the thread  
t1.start();   
t2.start();   
t3.start();   
t4.start();   
//main thread will wait for all the four threads until the execution of all threads do not complete  
t1.join();   
t2.join();  
t3.join();   
t4.join();   
//prints the final value of count variable  
System.out.println(c.count);  
}   
}  
