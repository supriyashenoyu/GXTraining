package com.threads;

class Name {
	synchronized void Name() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Running thresd ::" + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Exception Caught");
			}
		}
	}
}

	public class Sync {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Name obj = new Name();
			Thread t1 = new Thread() {
				public void run() {
					obj.Name();
				}
			};
			Thread t2 = new Thread() {
				public void run() {
					obj.Name();
				}
			};
			t1.start();
			t2.start();

		}

	}

