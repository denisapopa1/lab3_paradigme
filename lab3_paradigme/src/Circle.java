public class Circle extends Form{

    private float radius;
    public Circle(){

        radius=5;
    }
    public Circle(float r,String color){
        super(color);
        radius=r;
    }

    @Override
    public float getArea() {
        return radius*radius;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
