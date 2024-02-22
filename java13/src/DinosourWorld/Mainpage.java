package DinosourWorld;

import java.util.Scanner;

/**
 * 사장및 매니저가 죽은 공룡 삭제 태어난 공룡 추가 아니면 없던 
 * 공룡 친구를 데려오기 직원도 해고 및 고용 특별 이벤트가 일어나는
 * 요일or날짜기간 생성 하고 발생 직원들 출근 시간및 퇴근시간 주말과 평일 시간 조정
 */
public class Mainpage {

	public static void main(String[] args) {
//		Dinosour_parent_class dd = new Dinosour_parent_class(null, null, 0, 0, 0)
		Scanner sc = new Scanner(System.in);
        
        System.out.println("생성할 공룡의 수를 입력하세요:");
        int num = sc.nextInt();
        sc.nextLine(); // 줄바꿈 문자를 소비

        DinoMain[] dinosaurs = new DinoMain[num];

        for (int i = 0; i < num; i++) {
            System.out.println("공룡의 종류를 입력하세요 (walking, flying, aquatic):");
            String kind = sc.nextLine();

            System.out.println("공룡의 이름을 입력하세요:");
            String name = sc.nextLine();

            System.out.println("공룡의 나이를 입력하세요:");
            int age = sc.nextInt();

            System.out.println("공룡의 키를 입력하세요:");
            int height = sc.nextInt();
            
            System.out.println("공룡의 몸무게를 입력하세요:");
            int weight = sc.nextInt();
            sc.nextLine(); // 줄바꿈 문자를 소비

            switch (kind.toLowerCase()) {
                case "walking":
                    dinosaurs[i] = new LandDinosaur("name" , "육상공룡", 2,2,2);
                    break;
                case "flying":
                    dinosaurs[i] = new FlyingDinosaur("name", "육식", 2, 2,3 );
                    break;
                case "aquatic":
                    dinosaurs[i] = new AquaticDinosaur("name", "육식", 1, 3,10);
                    break;
                default:
                    System.out.println("잘못된 종류가 입력되었습니다. 다시 시도해주세요.");
                    i--; // 잘못된 입력이 있을 경우 다시 입력받기 위해 인덱스를 감소
                    break;
            }
        }

        // 생성된 공룡 객체들을 출력
        for (DinoMain dinosaur : dinosaurs) {//수명: " + dinosaur.lifespan + ", 서식지: " + dinosaur.habitat
            System.out.println("이름: " + dinosaur.name + ", 타입: " + dinosaur.type + ", 나이: " + dinosaur.age+" 키:"+dinosaur.height + " 몸무게:" + dinosaur.weight + "이다" );
        }
    }
}
