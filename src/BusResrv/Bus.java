package BusResrv;

public class Bus {
    private int busNo;

    Bus(int busNo, boolean Ac, int capacity){
        this.busNo = busNo;
        this.Ac = Ac;
        this.capacity = capacity;
    }

    public int getBusNo() {
        return busNo;
    }

    public boolean isAc() {
        return Ac;
    }

    public void setAc(boolean ac) {
        Ac = ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private boolean Ac;
    private int capacity;
    public void displayBusInfo(){
        System.out.println("Busno: "+busNo+" Ac: "+Ac+" Capacity: "+capacity);
    }
}
