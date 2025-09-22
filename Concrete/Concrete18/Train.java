package com.Concrete.Concrete18;

class Train {
private String trainName;
private int capacity;

public Train(String trainName, int capacity) {
    this.trainName = trainName;
    this.capacity = capacity;
}

public void details() {
    System.out.println("Train Name: " + trainName);
    System.out.println("Capacity: " + capacity + " passengers");
}
}
