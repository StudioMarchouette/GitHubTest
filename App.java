class App {
    public static void main(String args[]) {
        System.out.println("App.main");
    }

    public static void doStuff(){
        System.out.println("Do stuff with featureY");
        
    }

    private static void  featureY(){
        doStuff();

    }

}
