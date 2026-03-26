package edu.teamrocket.golfstrokes;

public class Hole {

    private byte number;
    private byte par;

    public Hole(byte number, byte par) {
        this.number = number;
        this.par = par;
    }

    public byte getNumber() {
        return number;
    }

    public byte getPar() {
        return par;
    }
}
