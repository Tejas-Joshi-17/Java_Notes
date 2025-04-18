package inner.classes.member.inner.classes.after;

public class Car {

    private String model;
    private boolean isEngineOn;

    public Car(String model) {
        this.model = model;
        this.isEngineOn = false;
    }

    class Engine {

        public void start() {
            if(!isEngineOn) {
                isEngineOn = true;
                System.out.println(model + " Engine Started");
            }else {
                System.out.println(model + " Engine Stopped");
            }
        }

        public void stop() {
            if(isEngineOn) {
                isEngineOn = false;
                System.out.println(model + " Engine Stopped");
            }else {
                isEngineOn = true;
                System.out.println(model + " Engine Started");
            }
        }

    }

}
