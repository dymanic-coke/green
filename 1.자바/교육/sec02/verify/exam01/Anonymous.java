package sec02.verify.exam01;

public class Anonymous {
	
	Worker field = new Worker() {
		
	@Override
	public void start() {
		System.out.println("일하고 있습니다.");
			}
		};
	
	void method1() {
		Worker localVar = new Worker() {
			@Override
			public void start() {
				System.out.println("놀고 있습니다.");
			}
		};
	localVar.start();
	}
	
	void method2(Worker worker ) {
		worker.start();
	}
}
