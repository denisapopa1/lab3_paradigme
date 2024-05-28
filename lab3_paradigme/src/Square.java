public class Square extends Form{
    float side;
    public Square(){
        side=2;
    }
    public Square(float s,String color){
        super(color);
        side=s;
    }
    @Override
    public float getArea() {
        return side*side;
    }

    //@Override
    /*public String toString() {
       return  super.toString();
    }*/
}
