package com.tsq.security;
/**
 * 字母
 * @author tsq
 *
 */
public enum Letters {
	uppercase_a(65,'A'),
	uppercase_b(66,'B'),
	uppercase_c(67,'C'),
	uppercase_d(68,'D'),
	uppercase_e(69,'E'),
	uppercase_f(70,'F'),
	uppercase_g(71,'G'),
	uppercase_h(72,'H'),
	uppercase_i(73,'I'),
	uppercase_j(74,'J'),
	uppercase_k(75,'K'),
	uppercase_l(76,'L'),
	uppercase_m(77,'M'),
	uppercase_n(78,'N'),
	uppercase_o(79,'O'),
	uppercase_p(80,'P'),
	uppercase_q(81,'Q'),
	uppercase_r(82,'R'),
	uppercase_s(83,'S'),
	uppercase_t(84,'T'),
	uppercase_u(85,'U'),
	uppercase_v(86,'V'),
	uppercase_w(87,'W'),
	uppercase_x(88,'X'),
	uppercase_y(89,'Y'),
	uppercase_z(90,'Z'),
	lowercase_a(97,'a'),
	lowercase_b(98,'b'),
	lowercase_c(99,'c'),
	lowercase_d(100,'d'),
	lowercase_e(101,'e'),
	lowercase_f(102,'f'),
	lowercase_g(103,'g'),
	lowercase_h(104,'h'),
	lowercase_i(105,'i'),
	lowercase_j(106,'j'),
	lowercase_k(107,'k'),
	lowercase_l(108,'l'),
	lowercase_m(109,'m'),
	lowercase_n(110,'n'),
	lowercase_o(111,'o'),
	lowercase_p(112,'p'),
	lowercase_q(113,'q'),
	lowercase_r(114,'r'),
	lowercase_s(115,'s'),
	lowercase_t(116,'t'),
	lowercase_u(117,'u'),
	lowercase_v(118,'v'),
	lowercase_w(119,'w'),
	lowercase_x(120,'x'),
	lowercase_y(121,'y'),
	lowercase_z(122,'z');
	
	private int asciiCode;
	private char charStr;
	
	Letters(int asciiCode,char charStr){
		this.asciiCode = asciiCode;
		this.charStr = charStr;
	}
	public int getAsciiCode() {
		return asciiCode;
	}
	/**
	 * 根据ascii码值返回字符
	 * @param index
	 * @return ascii值在此枚举中,返回对应值;否则返回 0 
	 * @author tsq
	 */
	public static char getCharStr(int index) {
		for(Letters letter : Letters.values()){
            if(index==letter.asciiCode){
            	return letter.charStr;
            }
        }
		return 0;
	}

	/**
	 * 判断传入的值 是否在此枚举中
	 * @param equalIndex
	 * @return 存在返回true,不存在返回false
	 * @author tsq
	 */
	public static boolean checkIn(int equalIndex){
		for(Letters letter : Letters.values()){
            if(equalIndex==letter.asciiCode){
            	return true;
            }
        }
		return false;
	}
}
