package MultiThreadingvjit;

import java.io.IOException;

public class CopyDataThread1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		CopyDataThread t=new CopyDataThread();
		t.start();

	}

}
