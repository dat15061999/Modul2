package Car2;

import Car1.Car;

public  class Hybridcar2 implements Car2,Engine,Cho {
    @Override
    public void charge() {
        System.out.println("hello");
    }

    @Override
    public void getStar() {
        System.out.println("Starting hybrid car");
    }

    @Override
    public void getStop() {
        System.out.println("Stopping hybrid car");
    }

    public static void main(String[] args) {
        Hybridcar2 user = new Hybridcar2() {
            @Override
            public void charge() {
                super.charge();
            }

            @Override
            public void getStar() {
                super.getStar();
            }

            @Override
            public void getStop() {
                super.getStop();
            }
        };
    }

    @Override
    public void getCho() {

    }
}

