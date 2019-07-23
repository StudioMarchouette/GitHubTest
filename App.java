class App {
    public static void main(String args[]) {
        System.out.println("App.main");
    }


    public void doStuff(){
        System.out.println("Do stuff called by feature Y or feature Z ");
        
    }

    private static void featureZ(){
        doStuff();
    }

    public static void doStuff(){
        System.out.println("Do stuff with featureY");
        
    }

    private static void  featureY(){
        doStuff();

    }

}
