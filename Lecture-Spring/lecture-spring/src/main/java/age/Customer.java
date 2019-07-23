package age;

import org.springframework.stereotype.Component;

@Component
public class Customer implements Person{
	@Override
	public void setAge(int age) {
		this age=age;
		System.out.println("나이가"+age+"로 변경되었습니다.");
		
	}

}
