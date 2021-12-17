package controller;

import animals.Animal;
import employee.Gender;
import enclosure.Enclosure;
import zoo.Zoo;

public class Controller {
	private Zoo zoo;
	private Enclosure enclosureSelect;
	private Animal animalSelect;
	
	public void createZoo(String name,int enclosureCapacity,String workerName,int ageWorker,Gender genderWorker) {
		this.zoo= new Zoo(name,enclosureCapacity,workerName,ageWorker,genderWorker);
	}
	
	public Enclosure getEnclosureSelect() {
		return enclosureSelect;
	}
	public void setEnclosureSelect(Enclosure enclosureSelect) {
		this.enclosureSelect = enclosureSelect;
	}
	public Animal getAnimalSelect() {
		return animalSelect;
	}
	public void setAnimalSelect(Animal animalSelect) {
		this.animalSelect = animalSelect;
	}
	public Zoo getZoo() {
		return zoo;
	}
	public void setZoo(Zoo zoo) {
		this.zoo = zoo;
	}
	
	
}