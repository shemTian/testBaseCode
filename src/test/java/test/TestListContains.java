package test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestListContains {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		List saleNoticeStatuslist = new ArrayList();
//		saleNoticeStatuslist.add("10");
//		saleNoticeStatuslist.add("30");
//		System.out.println(saleNoticeStatuslist.contains("10"));
		BigDecimal b1 = new BigDecimal("-96056.12");
		BigDecimal b2 = new BigDecimal("165000");
		System.out.println(b2.compareTo(b1));
		System.out.println("y".equals(null));
	}

}
