package homework;

// NOTES : Question to big so I didn't put here.
public class Program_18_Wall {

    double width=9;
    double height=10;


    public Program_18_Wall(){
    }

    public Program_18_Wall(double width, double height){
        if(width > 0 && height <= 0){
            this.width = width;
            height = 0;
        } else if (width <= 0 && height > 0) {
            width = 0;
            this.height = height;
        } else if (width <= 0 && height <= 0) {
            width = 0;
            height = 0;
        }else {
            this.width = width;
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        if(height <= 0) {
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    public void setWidth(double width) {
        if(width <= 0){
            this.width = 0;
        }else {
            this.width = width;
        }
    }

    public double getArea(){
        double width = getWidth();
        double height = getHeight();

        double area = width * height;
        return area;
    }

    public static void main(String[] args) {
        Program_18_Wall wall = new Program_18_Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
