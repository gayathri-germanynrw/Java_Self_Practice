package day12_practice_tasks;

public class Rectangle {
    private int width;
    private int length;

    public int getWidth(){
        return width;
    }
    public int getLength(){
        return length;
    }

    public void setLength(int length){
        if(length<=0){
            System.err.println("Length can not be 0 or Negative\t"+length);
            System.exit(1);
        }
        this.length=length;

    }
    public void setWidth(int width){
        if(width<=0){
            System.err.println("Width can not be 0 or Negative\t"+width);
            System.exit(1);
        }
        this.width=width;
    }
    public int calcArea(int length,int width){
        return length*width;
    }

    public int calcPerimeter(int length,int width){
        return 2*(length+width);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", Area of rectangle is\t"+calcArea(length,width)+
                ", Perimeter of rectangle is\t"+calcPerimeter(length,width)+
                '}';
    }
}
