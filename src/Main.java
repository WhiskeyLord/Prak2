public class Main {
    public static void main(String[] args){
        System.out.println("Работа класса Shape");
        Shape thing1 = new Shape();
        thing1.MakeShape("circ",100);
        thing1.CoutTheInfo();
        System.out.println("\nРабота класса Dog\n");
        Dog[] dd = new Dog[3];
        dd[0] = new Dog(7,"TYTY");
        dd[1] = new Dog(2,"Dog");
        dd[2] = new Dog(4,"Jack");
        for (int i=0;i<3;i++){
            dd[i].ConvertAge();
            System.out.println( dd[i].ToString());
        }
    }
}
