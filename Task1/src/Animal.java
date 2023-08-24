public class Animal {
    public String name;
    public int run_dist;
    public int swim_dist;

    public int getRun_dist() {
        return run_dist;
    }

    public int getSwim_dist() {
        return swim_dist;
    }

    public void setRun_dist(int run_dist) {
        this.run_dist = run_dist;
    }

    public void setSwim_dist(int swim_dist) {
        this.swim_dist = swim_dist;
    }

    public void run(int dist){
        if(run_dist == 0){
            System.out.println(name + " не умеет бегать");
        }
        else if(dist<= run_dist){
            System.out.println(name + " пробежал " + dist + " метров");
        }
        else{
            System.out.println(name + " пробежал " + run_dist + " метров и устал");
        }
    }

    public void swim(int dist){
        if(swim_dist == 0){
            System.out.println(name + " не умеет плавать");
        }
        else if(dist<= swim_dist){
            System.out.println(name + " проплыл " + dist + " метров");
        }
        else{
            System.out.println(name + " проплыл " + swim_dist + " метров и устал");
        }
    }
}
