package inner.classes.member.inner.classes.after;

public class Test {
    public static void main(String[] args) {

        Car car = new Car("Tata Safari");
        Car.Engine engine = car.new Engine();

        engine.start();         // Tata Safari Engine Started
        engine.stop();          // Tata Safari Engine Stopped

    }
}
