package ch02;

class CharToCode { 
	public static void main(String[] args) { 
		char ch = 'A';	     // char ch = 65;         
		int code = (int)ch;  // ch占쏙옙 占쏙옙占쏙옙占?占쏙옙占쏙옙 int타占쏙옙占쏙옙占쏙옙 占쏙옙환占싹울옙 占쏙옙占쏙옙占싼댐옙.

		System.out.printf("%c=%d(%#X)%n", ch, code, code); 

		char hch = '占쏙옙';     // char hch = 0xAC00;
		System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
	} 
} 
