package Key_2;
public interface Person {
    class User implements Person {
        public static void live() {
            System.out.println("I usually just live.");
        }
    }
    class Loser implements Person {
        public static void doNothing() {
            System.out.println("I usually do nothing.");
        }
    }
    class Coder implements Person {
        public static void writeCode() {
            System.out.println("I usually write code.");
        }
    }
    class Proger implements Person {
        public static void enjoy() {
            System.out.println("It's a wonderful life!");
        }
    }
}
