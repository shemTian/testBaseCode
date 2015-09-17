package test;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import test.ext.ChildrenClass;
import test.ext.ParentClass;
public class Test {
	public static void main(String[] args) throws Exception {
//		byte[] data = ReadWriteFile.readFile("1.txt");
//		String dataString =Base64.entryBase64(data);
//		ReadWriteFile.writeFile("2.txt", dataString.getBytes());
//		byte[] enData = ReadWriteFile.readFile("2.txt");
//		byte[] deData  = Base64.detryBase64(new String(enData));
//		System.out.println(new String(deData));
		/*System.out.println("commodityMeasureUnitName".indexOf("commodityMeasureUnit"));
		System.out.println(Integer.parseInt("1"));
		"10,".split(",");
		String str1="";
		System.out.println("2".equals(2));*/
		/*TestLong tset =  new TestLong();
		tset.setId(get());*/
		/*String a = "tsq"; 
		String b = "tsq";
		String c = new String("tsq");
		String d = new String("tsq");
		String e = c.substring(0, c.length());
		System.out.println(a==b); //true
		System.out.println(a==c); //false
		System.out.println(d==c); //false
		System.out.println(e==c); //true
		System.out.println(e==d); //false
		System.out.println(0%1000); //0
*//*		Random r = new Random();
		System.out.println(r.nextInt(88));
		
		List<String> orderKeys = new ArrayList<String>();
		orderKeys.add("1");
		orderKeys.add("2");
		orderKeys.add("3");
		orderKeys.add("4");
		orderKeys.add("5");
		List<String> orderKeys2 = new ArrayList<String>();
		orderKeys2.add("2");
		orderKeys2.add("5");
		HashSet<Long> h = new HashSet(orderKeys);  
		//h.removeAll(orderKeys2);
		System.out.println("orderkeys "+orderKeys);
		System.out.println(orderKeys.toString().substring(1,orderKeys.toString().length()-1));
		orderKeys.removeAll(orderKeys2);
		System.out.println("removed:"+orderKeys);
		System.out.println(orderKeys.size()%2);
		System.out.println(orderKeys.size()/0.88);*/
		String time = "Wed Mar 04 00:00:00 CST 2015";
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
		try {
			System.out.println(sdf.parse(time));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(4%10000l);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		
		Date settTimeStart = sdf2.parse("2014-2-26");
		Date settTimeEnd = sdf2.parse("2014-3-25");
		Calendar calendar = Calendar.getInstance();
		int currentYear = calendar.get(Calendar.YEAR);
		calendar.setTime(settTimeStart);
		int startMonth = calendar.get(Calendar.MONTH);
		calendar.setTime(settTimeEnd);
		int endMonth = calendar.get(Calendar.MONTH);
		if(startMonth>endMonth){
			calendar.setTime(settTimeStart);
			calendar.set(Calendar.YEAR, currentYear-1);
			settTimeStart = calendar.getTime();
			calendar.setTime(settTimeEnd);
			calendar.set(Calendar.YEAR, currentYear);
			settTimeEnd = calendar.getTime();
		}else{
			calendar.setTime(settTimeStart);
			calendar.set(Calendar.YEAR, currentYear);
			settTimeStart = calendar.getTime();
			calendar.setTime(settTimeEnd);
			calendar.set(Calendar.YEAR, currentYear);
			settTimeEnd = calendar.getTime();
		}
		
		/*System.out.println("satrt Date--"+settTimeStart);
		System.out.println("end Date--"+settTimeEnd);
		CDoor d = new CDoor();
		d.doOpen();
		d.open();
		Object oo = (Object)"abc";
		
		Integer i01 = 59;
		int i02 = 59;
		Integer i03 =Integer.valueOf(59);
		Integer i04 = new Integer(59);
		System.out.println(i01==i02);
		System.out.println(i01==i03);
		System.out.println(i03==i04);
		
		List l = new ArrayList();
		l.add("1234");
		l.add("abc");
		l.add("123");
		l.add("ax4");
		l.add("ax4");
		String s2 = "232";
		Set s = new HashSet(l);
		List l2 = new ArrayList(s);
		System.out.println(l2);*/
		/*System.out.println("coreNum:"+Runtime.getRuntime().availableProcessors());
		Integer ins= new Integer(66021);
		int i = ins;
		System.out.println(ins/10000);
		System.out.println(i/10000);
		
		NumberFormat nf = NumberFormat.getPercentInstance();
		nf.setMaximumFractionDigits(2);
		System.out.println(nf.format(0.20262d)); //20.26%
		
		String str= "";
		System.out.println(str.length());
		
		
		System.out.println("".equals(null));
		//抽象类不能new
		//ParentClass pt = new ParentClass();
		ParentClass ct = new ChildrenClass();
		ct.getSome();
		
		
		System.out.println("test hashcode");
		Map map = new HashMap();
		map.put("pageNo", 1);
		System.out.println(map.hashCode());
		Map map2 = new HashMap();
		map2.put("pageNo", 1);
		System.out.println(map2.hashCode());
		System.out.println(map.equals(map2));
		
		TestLong cd = new TestLong();
		cd.setId(99999l);
		System.out.println(cd.hashCode());
		
		TestLong cd2 = new TestLong();
		cd2.setId(99999l);
		System.out.println(cd2.hashCode());
		
		
		Map map1 = new HashMap();
		map1.put("id", "1");
		map1.put("id2", "3");
		System.out.println(map1.toString());
		System.out.println(map1.hashCode());
		Map map3 = new HashMap();
		map3.put("id", "3");
		map3.put("id2", "1");
		System.out.println(map3.toString());
		System.out.println(map3.hashCode());
		Object[] o = new Object[2];
		o[0]= 2323;
		o[1] = 23231l;
		System.out.println(o[0].toString());
		System.out.println(o[1].toString());*/
		
		
		System.out.println("\\");
		
		
		  Date date2 = new Date(2015-8-18);
		  System.out.println(2015-8-18);
	}
	
	public static Long get(){
		return (Long)3l;
	}
}
