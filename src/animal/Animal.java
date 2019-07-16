package animal;

public class Animal {



    public Animal(int height, String color, String name) {
        this.height = height;
        this.color = color;
        this.name = name;
    }

        private int height;
        private String color;
        private String name;


    public static void main(String[] args) {
     //   Animal animal1 = new Animal(23,"black","Jonny");
     //   Animal animal2 = new Animal(12,"yellow", "Tobby");

        System.out.println(new Animal(23,"black","Tobby"));
        System.out.println(new Animal(11,"yellow","Jonny"));

    }



}
