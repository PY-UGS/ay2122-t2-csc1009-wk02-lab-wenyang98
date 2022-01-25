public class Week02qns3 {
    public static void main(String[] args) {
        long totalMiliseconds = System.currentTimeMillis();
        long totalseconds = totalMiliseconds/1000;
        long currentseconds = totalseconds % 60;
        long totalMinutes = totalseconds/60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes/60;
        long currentHours = totalHours % 24;
        System.out.println("Current time is " + currentHours + ":" + currentMinutes + ":" + currentseconds + " GMT");
    }
}
