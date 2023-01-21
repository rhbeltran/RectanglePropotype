public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea(){
        return this.width*this.height;
    }

    public void print(){
        System.out.println("El ancho es: " + getWidth());
        System.out.println("El largo es: " + getHeight());
        System.out.println("El area es: " + getArea());
    }
    @Override
    protected Rectangle clone() throws CloneNotSupportedException{
        try{
            return (Rectangle) super.clone();
        } catch (CloneNotSupportedException e){
            System.out.println(e.getMessage());
            return null;
        }

    }



}
