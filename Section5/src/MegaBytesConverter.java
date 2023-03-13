public class MegaBytesConverter {
    public static void main(String[] args) {

    }
        public static void printMegaBytesAndKiloBytes(int kiloBytes){
            int KB = kiloBytes;
            int MB = KB/1024;
            int Rem_KB = KB%1024;

            if (kiloBytes < 0){
                System.out.println("Invalid Value");
            }
            else{

                System.out.println(KB + " KB = "+ MB + " MB and " + Rem_KB + " KB");
            }

        }
}
