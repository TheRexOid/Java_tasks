public class Dog extends Animal{
    static int count = 0;
    Dog(){
        name = "Dog";
        run_dist = 500;
        swim_dist = 10;
        count++;
    }
}
