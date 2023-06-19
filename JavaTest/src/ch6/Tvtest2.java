package ch6;
class Tv2{
	String color;
	boolean power;
	int channel;
	void power() {
		power =!power;
		
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
		
	}
}
public class Tvtest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Tv t1 = new Tv();
       Tv t2 = new Tv();
       System.out.println(t1.channel);
       System.out.println(t2.channel);
       t1.channel= 7;
       t2.channel =6;
       System.out.println(t1.channel);
       System.out.println(t2.channel);
	}

}
