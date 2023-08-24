
public class Main {

    public static void main(String[] args) {
        int rand_num = (int)(Math.random() * 15) + 6;
        Animal[] animals = new Animal[rand_num];

        int i;
        for(i = 0; i < animals.length; ++i) {
            int rand_animal = (int)(Math.random() * 5);
            switch (rand_animal) {
                case 0:
                    Cat cat = new Cat();
                    animals[i] = cat;
                    break;
                case 1:
                    Dog dog = new Dog();
                    animals[i] = dog;
                    break;
                case 2:
                    Tiger tiger = new Tiger();
                    animals[i] = tiger;
                    break;
                case 3:
                    Fish fish = new Fish();
                    animals[i] = fish;
                    break;
                case 4:
                    Shark shark = new Shark();
                    animals[i] = shark;
            }

            int rand_dist = (int)(Math.random() * 1000.0) + 1;
            animals[i].run(rand_dist);
            rand_dist = (int)(Math.random() * 1000.0) + 1;
            animals[i].swim(rand_dist);
            System.out.println();
        }

        i = Cat.count + Dog.count + Tiger.count + Fish.count + Shark.count;
        System.out.println("[ Всего животных " + i + " из них:\t]");
        System.out.println("[\tКошек: " + Cat.count + "\t\t\t\t]");
        System.out.println("[\tСобак: " + Dog.count + "\t\t\t\t]");
        System.out.println("[\tТигров: " + Tiger.count + "\t\t\t\t]");
        System.out.println("[\tРыб: " + Fish.count + "\t\t\t\t\t]");
        System.out.println("[\tАкул: " + Shark.count + "\t\t\t\t\t]");
    }
}