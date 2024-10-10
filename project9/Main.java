interface vehical{
    public void changegear(int a);
public void speedup(int a);
public void applybreaks(int a);
}
class car implements vehical{
    int gear;
    int speed;
    int breaks;
    @Override
    public void changegear(int newgear) {
        gear=new gear();
    }
    @Override
    public void speedup(int increament){
        speed=speed+increament;

    }
    @Override
    public void applybreaks(int decreament){
        speed=speed-decreament;
    }
    public void printstate(){
        System.out.println("speed"+speed"gear"+gear);
    }
}
class Main{
    public static void main(String[] args) {
        car a=new car();
        a.changegear(5);
        a.speedup(150);
        a.applybreaks(2);
        System.out.println("car present state");
        a.printstate();
    }
}
