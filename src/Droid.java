public class Droid {

    String name;
    int batteryLevel;

    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    public String toString(){
        //priting the object instance codey will now print this string over the place in memory it is stored
        return "Hello, I'm the droid: "+ name;
    }

    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;
    }

    public int energyReport(){
        return batteryLevel;
    }

    public void energyTransfer( Droid droidTwo){
        int droidTwoBattery = droidTwo.energyReport();
        droidTwo.batteryLevel = batteryLevel;
        batteryLevel = droidTwoBattery;
    }

    public static void main(String[] args){
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("dancing");
        codey.performTask("gaming");
        codey.performTask("cooking");
        System.out.println(codey.batteryLevel);
        Droid jeff = new Droid("jeff");
        codey.energyTransfer(jeff);
        System.out.println("Codey battery level is: " + codey.batteryLevel);
        System.out.println("Jeff battery level is: "+ jeff.batteryLevel);
    }
}
