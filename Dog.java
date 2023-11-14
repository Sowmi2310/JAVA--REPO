class Animal
{
	void soundAnimal()
	{
		System.out.println("Animals and Animals sound");
	}
}
class Dog extends Animal
{
	void sound1()
	{
		soundAnimal();
		System.out.println("dogs sound is barking");
	}

	public static void main(String arr[])
	{
		Dog d=new Dog();
		d.sound1();
	}	
	
}	