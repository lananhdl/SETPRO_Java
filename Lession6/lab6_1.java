package Lession6;

public class lab6_1 {
    public static void main(String[] args) {
        String time = "2hrs and 5 minutes";
        String[] timeSplit = time.split(" and ");
        System.out.println("Given input 2hrs and 5 minutes");
        String hrs = timeSplit[0].replace("hrs", "").replaceAll(" ","");
        String minutes = timeSplit[1].replace("minutes","").replaceAll(" ","");
        int valueHrs = Integer.parseInt(hrs);
        int valueMinutes = Integer.parseInt(minutes);
        int totalMinutes = (valueHrs*60) + valueMinutes;
        System.out.println("Total minutes of input time: ");
        System.out.println(totalMinutes);

    }
    }
