public class LabCode {
    public static void main(String args[]){
        System.out.println("lab03, 100 Point Version\n");
        int start=10000123;
        int hours=start/3600000;
        int milliseconds=start%3600000;
        int minutes=milliseconds/60000;
        int milliseconds2=milliseconds%60000;
        int seconds=milliseconds2/1000;
        int millisecondsfinal=milliseconds2%1000;
        System.out.println("Starting milli-seconds: "+start);
        System.out.println("Hours:                  "+hours);
        System.out.println("Minutes:                "+minutes);
        System.out.println("Seconds:                "+seconds);
        System.out.println("Milli-seconds:          "+millisecondsfinal);



    }
}
