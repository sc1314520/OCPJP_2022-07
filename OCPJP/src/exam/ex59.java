package exam;

public class ex59 {

}
/*
Given:

public interface Worker {
	public void doProcess();
}

and

public class HardWorker implements Worker {
	public void doProcess() {
		System.out.println("doing things");
	}
}

and

public class Cheater implements Worker {
	public void doProcess(){}

}

and
// T 為 Worker 的本身或其子類別
public class Main<T extends Worker> extends Thread { // Line 1
	private List<T> processes=new ArrayList<>();     //line 2
	public void addProcess(HardWorker w) {			// line 3	--> 泛型必須寫 T
		processes.add(w);
	}
	
	public void run() {
		processes.forEach((p)->p.doProcess());	
	}
}

What needs to change to make these classes compile and still handle all types of Interface Worker?

A) Replace Line 1 with public class Main<T extends HardWorker> extends Thread {

B) Replace Line 3 with public void addProcess(T w) {

C) Replace Line 3 with public void addProcess(Worker w) {

D) Replace Line 2 with private List<HardWorker> processes=new ArrayList<>();





ans:B

*/