public class LabCode {
    public static void main(String args[]){
        System.out.println("lab03, 100 Point Version\n");
        int start=10000123;
        int hours=3600000;
        int minutes=60000;
        int seconds=1000;
        System.out.println("Starting milli-seconds: "+ start);
        System.out.println("Hours:  "+start/hours);
        System.out.println("Minutes:   "+start%hours/minutes);
        System.out.println("Seconds:    "+start%hours%minutes/seconds);
        System.out.println("Milli-seconds:  "+start%hours%minutes%seconds);



    }
}
