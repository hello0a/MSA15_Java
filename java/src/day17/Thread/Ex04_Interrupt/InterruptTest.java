package day17.Thread.Ex04_Interrupt;

public class InterruptTest extends Thread{

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(3000);
				System.out.println(i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("스레드 끝");
	}
	public static void main(String[] args) throws InterruptedException {
		InterruptTest test = new InterruptTest();
		
		test.start();
		Thread.sleep(3000);
		// 인터럽트
		/*
		 * 농구
		 * 인터셉트 : 같은 팀에게 공을 패스하는 과정에서 상대팀이 뺏는 것
		 * 같은 팀 A(Runnable), B(Runnable) / 다른 팀 C(sleep 재우는 중인 NotRunnable)
		 * run 실행 시 A가 받을 준비가 된 B에게 전달하려는 것을 C가 뺏을 수 있도록 깨워서 Runnable 상태로 만드는 것
		 * A 입장에서는 중단되버리는 NotRunnable 이 되버려서 서로 상반되는 상태가 됨.
		 * 
		 * 즉, Not Runnable 인 상태의 스레드를 Runnable 상태가 되도록 요청하는 것
		 * * Runnable(메서드 run) 상태 : 작업 중지 요청 (즉각 중단X)
		 * * NotRunnable 상태 : Runnabled 상태로 변경
		 */
		test.interrupt();
	}
	
	
}
