class App {
    public static void main(String args[]) {
        System.out.println("App.main");
    }


    public static void doStuff(){
        System.out.println("Do stuff called by feature Y or feature Z ");
        
    }

    private static void featureZ(){
        doStuff();
    }


    private static void  featureY(){
        doStuff();

    }

}
