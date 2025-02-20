package JavaProgramming1.Part6.Objectsonaistandalistaspartofanobject.HeightOrder;

import JavaProgramming1.Part5.Objectsandreferences.Biggestpetshop.Pet;

public class Person {

        private String name;
        private int height;

        public Person(String name, int height) {
            this.name = name;


            this.height = height;
        }

        // other constructors and methods

        public String getName() {
            return this.name;
        }



        public int getHeight() {
            return this.height;
        }



        public void setHeight(int newHeight) {
            this.height = newHeight;
        }





        @Override
        public String toString() {
          return (this.getName() +"("+this.height+" cm )");
        }
}
