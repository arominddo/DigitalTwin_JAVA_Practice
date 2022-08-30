package jungsuk_ch06.primitive_param_ex;

//class Data1 { int x; }

class ReferenceReturnEx {
	public static void main(String[] args) 
	{
		Data d = new Data();
		d.x = 10;

		Data d2 = copy(d); 
		System.out.println("d.x ="+d.x);
		d.x = 20;
		System.out.println("d.x ="+d.x);
		System.out.println("d2.x="+d2.x);
		System.out.println("d.x ="+d.x);
	}

	static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;
		tmp.x = 30;

		return tmp;
	}
}
