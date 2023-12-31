// Create a class Animal with properties like name and age. 
// Create a subclass Dog that inherits from Animal and adds a property breed.
// Demonstrate the use of constructors in both the Animal and Dog classes.
// Define the Animal class
// Define the Animal class
// class Animal {
//   String name;
//   int age;

//   public Animal(String name, int age) {
//       this.name = name;
//       this.age = age;
//   }
// }

// class Dog extends Animal {
//   String breed;

//   public Dog(String name, int age, String breed) {
//       super(name, age);
//       this.breed = breed;
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//       Animal genericAnimal = new Animal("Generic Animal", 3);

//       Dog specificDog = new Dog("SHYAM", 2, "German Sephard");
      
//       System.out.println(genericAnimal); 
//       System.out.println(specificDog);   
//   }
// }











// Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). 
// Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to 
// calculate the area and perimeter of a circle
// class Shape {
//   public double getPerimeter() {
//       return 0.0;
//   }

//   public double getArea() {
//       return 0.0;
//   }
// }

// class Circle extends Shape {
//   double radius;

//   public Circle(double radius) {
//       this.radius = radius;
//   }

//   @Override
//   public double getPerimeter() {
//       return 2 * Math.PI * radius;
//   }

//   @Override
//   public double getArea() {
//       return Math.PI * radius * radius;
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//       Circle myCircle = new Circle(5.0);
//       System.out.println("Perimeter: " + myCircle.getPerimeter());
//       System.out.println("Area: " + myCircle.getArea());
//   }
// }







// 1.	Create a class Animal with properties like name and age. 
// Create a subclass Dog that inherits from Animal and adds a property breed.
//  Demonstrate the use of constructors in both the Animal and Dog classes.

// class Animal {
//   String name;
//   Integer age;

//   public Animal(String name, Integer age) {
//     this.name = name;
//     this.age = age;
//   }
  
// }

// class Dog extends Animal {
//   String breed;

//   public Dog(String breed) {
//     this.breed = breed;
//   }
// }


//   public static void main(String[] args) {
//     Animal myDog = new Animal(10, "SHYAM");

//     Dog kuta = new Dog(String "German Sephad.");

//     System.out.println(myDog);
//     System.out.println(kuta);
//   }








// class Animal {
//   String name;
//   int age;

//   public Animal(String name, int age) {
//     this.name = name;
//     this.age = age;
//   }
// }

// class Dog extends Animal {
//   String breed;

//   public Dog(String name, int age, String breed) {
//     super(name, age);
//     this.breed = breed;
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     Animal myDog = new Animal("SHYAM", 10);
//     Dog myPet = new Dog("Buddy", 5, "German Shepherd");

//     System.out.println("Animal: " + myDog.name + ", Age: " + myDog.age);
//     System.out.println("Dog: " + myPet.name + ", Age: " + myPet.age + ", Breed: " + myPet.breed);
//   }
// }












// 2.	Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). 
// Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to 
// calculate the area and perimeter of a circle

// class Shape {
//   float radius;
  
  
//   perimeter(float 2, float Math.PI, float 5)
//   float getPerimeter() {
//     return 2 * Math.PI * radius;
//   }

  // double getArea() {
  //   return Math.PI * radius * radius;
  // }

// }

// public class Main {
//   public static void main(String args[]) {

//   }
// }





// class Shape {
//   public double getPerimeter() {
//       return 0.0;
//   }

//   public double getArea() {
//       return 0.0;
//   }
// }

// class Circle extends Shape {
//   double radius;

//   public Circle(double radius) {
//       this.radius = radius;
//   }

//   @Override
//   public double getPerimeter() {
//       return 2 * Math.PI * radius;
//   }

//   @Override
//   public double getArea() {
//       return Math.PI * radius * radius;
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//       Circle myCircle = new Circle(5.0);
//       System.out.println("Perimeter: " + myCircle.getPerimeter());
//       System.out.println("Area: " + myCircle.getArea());
//   }
// }
















// Super Keyword:
// 3.	Extend the Animal and Dog example by adding a constructor to the Animal class that takes a name parameter. 
// In the Dog class, use the super keyword to call the constructor of the Animal class. 
// Create instances of Dog and demonstrate the use of the super keyword
