package com.tsq.security;
/**
 * 特殊符号
 * @author tsq
 *
 */
public enum Symbols {
	
	exclamation_mark(33,'!'),
	doubleQuotation_marks(34,'"'),
	pound_sign(35,'#'),
	dollar_mark(36,'$'),
	percent_sign(37,'%'),
	and_mark(38,'&'),
	quotation_mark(39,'\''),
	left_brackets(40,'('),
	right_brackets(41,')'),
	asterisk_mark(42,'*'),
	plus_sigh(43,'+'),
	comma_mark(44,','),
	subtrahend_sign(45,'-'),
	full_stop(46,'.'),
	slash_sign(47,'/'),
	colon_mark(58,':'),
	semicolon_mark(59,';'),
	less_sign(60,'<'),
	equal_sign(61,'='),
	more_sign(62,'>'),
	question_mark(63,'?'),
	at_mark(64,'@'),
	leftSquare_bracket(91,'['),
	backSlash_mark(92,'\\'),
	rightSquare_bracket(93,']'),
	caret_mark(94,'^'),
	underline_mark(95,'_'),
	backQuotation_mark(96,'`'),
	left_brace(123,'{'),
	connector_mark(124,'|'),
	right_brace(125,'}'),
	tilde_mark(126,'~');
	
	private int asciiCode;
	private char charStr;
	
	Symbols(int asciiCode,char charStr){
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
		for(Symbols symbol : Symbols.values()){
            if(index==symbol.asciiCode){
            	return symbol.charStr;
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
		for(Symbols symbol : Symbols.values()){
            if(equalIndex==symbol.asciiCode){
            	return true;
            }
        }
		return false;
	}
}
