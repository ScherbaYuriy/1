
public class Main {
    public static void main(String[] args) {
        Astronavt astronavt =new Astronavt("Yura",19,70);
        Roket roket =new Roket("Apolon",70,1000,3);
        SpaiseStation spaiseStation=new SpaiseStation("Hala",10,8,"Гідропоні дослідження ");

        astronavt.hello();
        System.out.println(astronavt.sum(1,2));

        roket.hello();
        System.out.println(roket.bul(100));

        spaiseStation.hello();
        System.out.println(spaiseStation.metod());
    }
}