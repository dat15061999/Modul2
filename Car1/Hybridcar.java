package Car1;

public  class Hybridcar implements Car {
    @Override
    public void start() {
        System.out.println("Starting Hybrid Car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Hybrid Car");
    }

    public static void main(String[] args) {
        Hybridcar newcar = new Hybridcar();
        newcar.start();
        newcar.stop();
    }
}
