package scanner_num;

class RunnableDemo implements Runnable{
	private Thread t;
	private String threadName;
	 RunnableDemo(String name) {
		 threadName=name;
		 System.out.println("creating "+threadName);
		 
		// TODO 自动生成的构造函数存根
	}
	 public void run() {
		 System.out.println("running "+threadName);
		 try {
			for(int i=4;i>0;i--) {
				System.out.println("thread "+threadName);
				Thread.sleep(3600);
			}
			
		} catch (InterruptedException e) {
			System.out.println("thread "+threadName+"Interrupted");
			// TODO: handle exception
		}
		 System.out.println("thread "+threadName+" exiting");
	 }
	 public void start() {
		 System.out.println("RunnableDemo.start()"+ threadName);
		 if(t==null) {
			 t= new Thread(this ,threadName);
					 t.start();
		 }
	 }
}
public class mult_thread {
	public static void main (String[] args) {
		RunnableDemo r1=new RunnableDemo("thread-1");
		r1.start();
		RunnableDemo r2=new RunnableDemo("thread-2");
		r2.start();
	}
}
