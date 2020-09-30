import java.security.PublicKey;

public class Dog {
    int age, humanage;
    String name;
    Dog(int age, String name){
        this.age=age;
        this.name=name;
    }
    public void ConvertAge(){
        humanage = age*7;
    }
    public String ToString(){
        return("Кличка собаки: " + name + ";\nВозраст собаки: "+ age+ ";\nВозраст в чел годах: "+humanage+";\n");
    }
}
