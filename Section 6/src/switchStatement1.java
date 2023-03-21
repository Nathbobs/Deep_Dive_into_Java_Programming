public class switchStatement1 {
    public static void main(String[] args) {
        /*When using the switch statement, it's often done this way;
         switch(Value){
            case x:
                "code for value = x"
                break;
            case y:
                "code for value = y
                break;
            default:
            "code for value not equal to x or y"
            }
            */
        int switchValue = 5;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }
            //(this is an enhanced switch statement method. Less traditional)
        int switchValues = 5;
        switch(switchValues){
            case 1-> System.out.println("Value was 1");

            case 2->System.out.println("Value was 2");
            case 3, 4, 5-> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValues);

            }
            default -> System.out.println("Was not 1, 2, 3, 4 or 5");
        }
    }
}
