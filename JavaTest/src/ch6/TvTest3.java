package ch6;
class Tv3{
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
public class TvTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Tv t1 = new Tv();
      Tv t2 = new Tv();
      System.out.println(t1.channel );
      System.out.println(t2.channel);
      t2 =t1;
      t1.channel=7;
      System.out.println(t1.channel);
      System.out.println(t2.channel);
      
	}

}
