public class Main {

        public static void main (String[]args)
        {
            Cat[] cats = {
                    new Cat(5, "Jack"),
                    new Cat(7, "Michael"),
                    new Cat(10, "John")
            };

            Plate plate = new Plate(20);

            for (Cat cat : cats) {
                cat.eat(plate);
            }

            plate.increaseFood(50);

            for (Cat cat : cats) {
                cat.eat(plate);
            }
        }
    }
