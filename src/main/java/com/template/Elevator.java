package com.template;

public class Elevator {
int minFloor;
int maxFloor;
int maxCapacity;
int currentFloor;
int currentPassangers;

    public Elevator(int minFloor, int maxFloor, int maxCapacity) {
        // Initialize elevator with minFloor, maxFloor and maxCapacity
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.maxCapacity = maxCapacity;
        this.currentFloor = minFloor;
        this.currentPassangers = 0;
    }

    public void moveToFloor(int floor) {
        // Move elevator to the floor if it is within the minFloor and maxFloor
        if (floor > minFloor && floor < maxFloor) {
            this.currentFloor = floor;
        }
    }

    public void addPassenger(){
        // Add a passenger to the elevator if the elevator is not full
        if (this.currentPassangers < this.maxCapacity){
            this.currentPassangers++;
        }
    }

    public void removePassenger(){
        // Remove a passenger from the elevator if the elevator is not empty
        if (this.currentPassangers > 0){
            this.currentPassangers--;
        }
    }

    public int getCurrentFloor(){
        // Return the current floor of the elevator
        return this.currentFloor;
    }

    public int getPassengerCount(){
        // Return the number of passengers in the elevator
        return this.currentPassangers;
    }
}

