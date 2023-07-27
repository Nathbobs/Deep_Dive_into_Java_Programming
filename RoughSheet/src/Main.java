public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int switchValue = 4;
        switch (switchValue){
            case 1:
                System.out.println(" Value was 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
                System.out.println(" Value is 3 ");
                break;
            case 4: case 5: case 6:
                System.out.println(" number us between 4-5. Actually it is a value of " + switchValue);
                break;
            default:
                System.out.println(" Number not found ");

        }
    }
}