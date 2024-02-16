package newobj;

public class enums {
	//선언 한 친구가 아니면 실행안된다
	public static void main(String[] args) {
//water stillwa= new water(); 에러가 뜨는 버전
		 Water skillWater = Water.skill;//소문자로 클래스 첫부분이름을 만들면 오류가 뜬다
	        System.out.println(skillWater == Water.skill);
	        System.out.println(skillWater.equals(Water.skill));
	        
	        switch (skillWater){
			case skill: 
				System.out.println("skill WAAATER");
				break;
				
//			case skillWater:
			}
			
	        Water sparkWater = Water.valueOf("SPARKLING");
	        System.out.println(sparkWater);
	        
	        for (Water water: Water.values() ) {
	        	System.out.println("Ordinal: " +water.ordinal()+ " is "+water.name() );
	        	
//	        valueOf(String) 메서드: enum 상수의 이름이 주어지면, enum 인스턴스를 반환한다.
//	        	 values() 메서드: 모든 enum 상수를 반환한다.
//	        	 ordinal() 메서드: enum 상수 순서 값을 반환한다.  최초의 enum 상수에게 순서값 0이 주어진다.
	        }
			}
	}


