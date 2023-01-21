public class App {
    public static void main(String[] args) throws Exception {
        //ORIGINAL
        Rectangle prototypeRectangle = new Rectangle(12, 24);
        System.out.println("Original: ");
        prototypeRectangle.print();

        //CLON
        Rectangle cloneRectangle = prototypeRectangle.clone();
        System.out.println("Clon: ");
        cloneRectangle.print();
        


        Rectangle [] clones =new Rectangle[10];
        for (int i =0; i<10; i++){
            clones[i] = prototypeRectangle.clone();
        }
    }
}
