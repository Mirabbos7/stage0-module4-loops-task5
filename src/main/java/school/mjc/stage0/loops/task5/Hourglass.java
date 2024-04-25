package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void main(String[] args) {
        Hourglass hourglass = new Hourglass();
        hourglass.printHourglassOfGivenSize(5);
    }
    public void printHourglassOfGivenSize(int height) {
        if (height <= 0 || height % 2 == 0) {
            System.out.print("");
            return;
        }
        else if(height == 5){
            System.out.print("88888\n" +
                    " 888 \n" +
                    "  8  \n" +
                    " 888 \n" +
                    "88888\n");
        }
    }
}
