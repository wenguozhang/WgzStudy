package blockingMap;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class test {
	public static void main(String[] args){
		HashBlockingMap<String> blockingMap = new HashBlockingMap<>();
		ScheduledExecutorService se = Executors.newScheduledThreadPool(5);
		//putֵ
		final Runnable puter = new Runnable() {
			public void run() { 
				for (int i=0; i<10; i++){
					try {
						blockingMap.put(i, "a"+i);
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
				}
			}
		};
		se.execute(puter);
		
		//ȡֵ1
		final Runnable taker1 = new Runnable() {
			public void run() { 
				for (int i=8; i>5; i--){
					try {
						String aa = blockingMap.take(i);
						System.out.println(aa);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
				}
			}
		};
		se.execute(taker1);
		
		//ȡֵ2
		final Runnable taker2 = new Runnable() {
			public void run() { 
				try {
					String aa = blockingMap.poll(2, 5000);
					System.out.println(aa);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
			}
		};
		se.execute(taker2);
		
		//ȡֵ3
		final Runnable taker3 = new Runnable() {
			public void run() { 
				for (int i=4; i>2; i--){
					try {
						String aa = blockingMap.take(i);
						System.out.println(aa);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
				}
			}
		};
		se.execute(taker3);
		try {
			Thread.sleep(10000);
			System.out.println(blockingMap.getSize());
			se.shutdown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
