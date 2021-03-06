package by.epam_trining.lukyanau.task2.entity;

public class TabletPC implements ElectricDevice {
    public enum ColorType {
        BLUE,
        BLACK,
        WHITE,
        GREEN;
    }

    private int batteryCapacity;
    private int displayInch;
    private int romMemory;
    private int flashMemoryCapacity;
    private ColorType color;

    public TabletPC(Object... parameters) {
        this.batteryCapacity = (int) parameters[0];
        this.displayInch = (int) parameters[1];
        this.romMemory = (int) parameters[2];
        this.flashMemoryCapacity = (int) parameters[3];
        this.color = (ColorType) parameters[4];
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayInch() {
        return displayInch;
    }

    public void setDisplayInch(int displayInch) {
        this.displayInch = displayInch;
    }

    public int getRomMemory() {
        return romMemory;
    }

    public void setRomMemory(int romMemory) {
        this.romMemory = romMemory;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public ColorType getColor() {
        return color;
    }

    public void setColor(ColorType color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TabletPC tabletPC = (TabletPC) o;

        if (batteryCapacity != tabletPC.batteryCapacity) return false;
        if (displayInch != tabletPC.displayInch) return false;
        if (romMemory != tabletPC.romMemory) return false;
        if (flashMemoryCapacity != tabletPC.flashMemoryCapacity) return false;
        return color == tabletPC.color;
    }

    @Override
    public int hashCode() {
        int result = batteryCapacity;
        result = 31 * result + displayInch;
        result = 31 * result + romMemory;
        result = 31 * result + flashMemoryCapacity;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TabletPC:" +
                "\nbatteryCapacity=" + batteryCapacity +
                "\ndisplayInch=" + displayInch +
                "\nromMemory=" + romMemory +
                "\nflashMemoryCapacity=" + flashMemoryCapacity +
                "\ncolor=" + color;
    }

    @Override
    public void start() {
        System.out.println("TabletPC start working");
    }

    @Override
    public void tierDown() {
        System.out.println("TabletPC stop working");
    }
}
