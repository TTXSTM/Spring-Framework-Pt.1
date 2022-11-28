package space.mairi.springcourse;

public class RapMusic implements Music{
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "The Real Slim Shady";
    }
}
