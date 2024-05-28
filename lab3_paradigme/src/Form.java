public class Form {
    public String color;
    private static int counter=0;
    public Form(){

        color = "white";
    }
    public Form(String c){

        color=c;
        counter=counter+1;
    }
    public float getArea(){

        return 0;
    }
    public String toString(){

        return "this form has the color "+color;
    }
    public String getColor(){
        return color;
    }
    public static int getCounter(){
        return counter;
    }



}
