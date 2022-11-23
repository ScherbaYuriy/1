
public class SpaiseStation {
    String name;
    int vmistumist;
    int age;
    String funcshn;

    public SpaiseStation(String name, int vmistumist, int age, String funcshn) {
        this.name = name;
        this.vmistumist = vmistumist;
        this.age = age;
        this.funcshn = funcshn;
    }

    void hello(){
        System.out.println("Привіт я космічна станція");
    }

    double metod(){
        return vmistumist *age;
    }
}
