import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		//컨테이너를 생성해 레퍼런스에 저장
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml"); 
		
		//컨테이너의 객체를 가져와 사용해보기 ctx안에 getBean으로 "id"의 TransportaionWalk class 객체를 가져온다. 
		TransportationWalk transportationWalk = ctx.getBean("tWalk",TransportationWalk.class);
		transportationWalk.move();
		
		//컨테이너는 사용하고 나서 제거를 해준다.
		ctx.close(); 
		
	}

}
