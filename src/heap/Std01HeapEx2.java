package heap;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Std01HeapEx2 {
	public static void main(String[] args) throws Exception {
		byte[] d = new byte[1024 * 1024 * 100];
		List<byte[]> byteBuffer = new ArrayList<byte[]>();
		Runtime rt = Runtime.getRuntime();
		while(true) {
			d = new byte[1024 * 1024 * 100];
			byteBuffer.add(new byte[1024 * 1024 * 100]);
			long total = rt.totalMemory();
			long free = rt.freeMemory();
			long used = total - free;
			System.out.println(new Date() + "tot=" + g(total) + "\nfree=" + g(free) + "\nused=" + g(used));
			Thread.sleep(1000);
		}
	}
	
//	private static void add(List<byte []> bf, ) {
//		
//	}
	
	private static String g(long m) {
		double d = m/1024.0/1024.0;
		return String.format("%5.2fm", d);
	}
}
