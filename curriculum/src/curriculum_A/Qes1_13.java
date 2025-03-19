package curriculum_A;

public class Qes1_13 {
	
	public static void main(String[] args) {
		//1
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		char c;
		String str;
		boolean bool;
		
		//2
		b = 0;
		s = 0;
		i = 0;
		l = 0L;
		f = 0.0f;
		d = 0.0d;
		c = '\u0000';
		str = null;
		bool = false;
		
		//3
		b = 10;
		s = 100;
		i = 1000;
		l = 10000;
		f = 9.5f;
		d = 10.5d;
		c = 'a';
		str = "ハロー";
		bool = true;
		
		//4
		System.out.println(b + s + i + l);
		System.out.println(b + b);
		System.out.println(c + str + bool);
		System.out.println(b + s + i + l + f + d);
		System.out.println(b * s * i * l);
		System.out.println(d / s);
		System.out.println(b - s);
		
		//5
		String num ="20";
		String num1 = "23";
		System.out.println("ハローJAVA" + (num + num1));
		
		//6
		String name = "山田太郎";
		byte age  = 18;
		double height = 170.5d;
		float weight = 62.2f;
		String food = "寿司";
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		
		//7
		double bmi = weight / ((height / 100) * (height / 100));
		System.out.println("BMIは" + bmi + "です");
		
		//8
		name = "鈴木一郎";
		age = 24;
		height = 168.5d;
		weight = 64.2f;
		food = "オムライス";
		double bmi2 = weight / ((height / 100) * (height / 100));
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + bmi2 + "です");
		
		//9
		age += 24;
		height += 168.5d;
		weight += 64.2f;
		bmi2 /= 2;
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.println("BMIは" + bmi2 + "です");
		
		//10
		age = 24;
		boolean result = age >= 25;
		System.out.println(result);
		
		//11
		height = 168.5d;
		weight = 64.2f;
		String strage = String.valueOf(age);
		String strheight = String.valueOf(height);
		String strweight = String.valueOf(weight);
		System.out.println(strage + strheight + strweight);
		
		//12
		int intage = Integer.parseInt(strage);
		double doubleheight = Double.parseDouble(strheight);
		System.out.println(intage);
		System.out.println(doubleheight);
		
		//13
		boolean result2 = (height >= 160.0d) || (age == 25);
		System.out.println(result2);
		
	}
}