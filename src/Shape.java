public class Shape {
    String form;
    float size= 0;
    public void MakeShape(String form, float size){
        this.form=form;
        this.size=size;
    }
    public void CoutTheInfo(){
        switch (form){
            case "circ": System.out.println("я круг");
                break;
            case "rect": System.out.println("я треугольник");
                break;
            case "square": System.out.println("я квадрат");
                break;
        }
        System.out.println(" и я такого размера= " + size);
    }
}
