package ch6;
class Tv {
	//멤버 변수
	String color;
	boolean power;
	int channel;
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
		
	}
	void channelDown() {
		--channel;
	}
}
public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Tv t;   //Tv인스턴스를 참조하기 위한 변수 t를 선언
      t = new Tv();  //Tv 인스턴스를 생성한다
      t.channel=7;
      t.channelDown();
      System.out.println(t.channel);
      
      
	}

}
