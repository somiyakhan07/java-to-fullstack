// Design a Machine Management System.
// Every Computer is a Machine. 
// Store the common details of a machine in the parent class and add computer-specific information in the child class. 
// Display all the information using a Computer object.

class Machine {
    private boolean switchOnOff;
    private boolean work;

    Machine(boolean switchOnOff, boolean work) {
        this.switchOnOff = switchOnOff;
        this.work = work;
    }

    public boolean getSwitch() {
        return switchOnOff;
    }

    public void setSwitch(boolean switchOnOff) {
        this.switchOnOff = switchOnOff;
    }

    public boolean getWork() {
        return work;
    }

    public void setWork(boolean work) {
        this.work = work;
    }
}

class Computer extends Machine {
    private String hardware;
    private String software;
    private boolean internet;
    private String browser;
    private boolean functions;

    Computer(String hardware, String software, boolean internet, String browser, boolean functions) {
        super(true, true);
        this.hardware = hardware;
        this.software = software;
        this.internet = internet;
        this.browser = browser;
        this.functions = functions;
    }

    public String getHardware() {
        return hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public boolean getInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public boolean getFunctions() {
        return functions;
    }

    public void setFunctions(boolean functions) {
        this.functions = functions;
    }
}

public class MachineManagementSystem {
    public static void main(String[] args) {
        Computer c1 = new Computer("Lenovo", "Windows", true, "Internet Browser", true);
        System.out.println("Switch: " + c1.getSwitch());
        System.out.println("Is machine working: " + c1.getWork());
        System.out.println("Computer Hardware: " + c1.getHardware());
        System.out.println("Computer Software: " + c1.getSoftware());
        System.out.println("Computer is connected to internet: " + c1.getInternet());
        System.out.println("Computer Browser: " + c1.getBrowser());
        System.out.println("Computer has functions: " + c1.getFunctions());
        System.out.println();
        c1.setInternet(false);
        System.out.println("Computer is connected to internet: " + c1.getInternet());
        System.out.println();
        c1.setSwitch(false);
        System.out.println("Switch: " + c1.getSwitch());
        System.out.println();
        c1.setWork(false);
        System.out.println("Does machine work: " + c1.getWork());
    }

}
