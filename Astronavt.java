
public class Astronavt{
    String name;
    int age;
    double weight;

    public Astronavt(String name, int age, double weight) { //конструктор
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void hello(){
        System.out.println("Привіт я астронавт");
    }

    double sum(int a,int b){
        return a+b;
    }

}
