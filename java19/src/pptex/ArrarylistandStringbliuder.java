package pptex;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

final class Farm {
	private final String name;
	private final int numAnimals;
	private final List<String> animals;

	private Farm(final String name, final int numAnimals, final List<String> animals) {
		this.name = name;
		this.numAnimals = numAnimals;
		this.animals = new ArrayList<>(animals);

	}

	public static Farm CreateNewFarm(String name, int numAnimals, List<String> animals) {
		return new Farm(name, numAnimals, animals);
	}//정적 팩토리 메소드로 정적 팩토리 메소드는 필요에 따라 기존에 생성된 객체를 반환할 수도 있습니다. 
//	이런 특성 덕분에 객체 생성 비용을 줄이거나, 인스턴스의 수를 제한할 수 있습니다.

	public String getName() {
		return name;
	}

	public int getNumAnimals() {
		return numAnimals;
	}

	public List<String> getAnimals() {
		return animals;
	}

	@Override
	public String toString() {
		return "Farm [name=" + name + ", numAnimals=" + numAnimals + ","
				+ " animals=" + animals + "]";
	}
}

public class ArrarylistandStringbliuder {

	public static void main(String[] args) {
//		List<String>animals = Arrays.asList("Cow", "Pig", "Chicken" , "Cattle");
		List<String>animals = new ArrayList<>();
		animals.add("Cow");
		animals.add("Pig");
		Farm farm = Farm.CreateNewFarm("Happpy Farm", 3, animals);
//				System.out.println(farm);
		System.out.println("name:"+farm.getName());
		System.out.println("number:"+farm.getNumAnimals());
		System.out.println("animals:"+farm.getAnimals());
	}
}
