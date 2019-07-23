class App {
    public static void main(String args[]) {
        System.out.println("App.main");
    }

    public void doStuff(){
        System.out.println("Do stuff called by feature Z");
        
    }

    private static void featureZ(){
        System.out.println("Do stuff");
    }
}
