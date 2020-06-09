package kr.ac.yeongnam.day16;

class Sync{
	
	public synchronized void a() {
		for(int i = 0; i<10; i++) {
			System.out.println('a');
		}
	}
	
	public synchronized void b() {
		synchronized(this){
			for (int i = 0; i < 10; i++) {
				System.out.println("b");
			}
		}
	}
	public synchronized void c() {
		for(int i = 0; i<10; i++) {
			System.out.println("c");
		}
		
	}
}

class SyncThread extends Thread{
	
	private Sync sync;
	private int type;
	
	public SyncThread(Sync syc, int type) {
		super();
		this.sync = sync;
		this.type = type;
		
	}
	
	public SyncThread(Sync sync) {
		super();
		this.sync = sync;
		
	}
}

public class SyncMain {
	public static void main(String[] args) {
		Sync sync = new Sync();
		SyncThread sy = new SyncThread(sync);
		SyncThread sy2 = new SyncThread(sync, 2);
		SyncThread sy3 = new SyncThread(sync, 3);

		sy.start();
		sy2.start();
		sy3.start();
		
		
	}

}
