public class Main {
    public static void main(String[] args){
        System.out.println("Работа класса Shape");
        Shape thing1 = new Shape();
        thing1.MakeShape("circ",100);
        thing1.CoutTheInfo();
        System.out.println("\nРабота класса Dog");
        Dog d1 = new Dog(7,"TYTY");
        d1.ConvertAge();
        System.out.println(d1.ToString());
    }
}
