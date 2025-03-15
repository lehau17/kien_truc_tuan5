package observer;

class ConcreteObserver implements Observer {
    public void update(String message) {
        System.out.println("Received update: " + message);
    }
}
