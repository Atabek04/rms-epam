package models;

public class Table {
    private int tableId;
    private int capacity;
    private boolean isOccupied;

    public Table(int tableId, int capacity) {
        this.tableId = tableId;
        this.capacity = capacity;
        this.isOccupied = false;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public int getTableId() {
        return tableId;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void occupyTable() {
        isOccupied = true;
    }

    public void vacateTable() {
        isOccupied = false;
    }
}
