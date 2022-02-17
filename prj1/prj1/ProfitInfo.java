package prj1;
import java.util.*;
import java.io.*;

public class ProfitInfo {
    //attributes
    private int maxProfit;
    private Vector<BaseballCard> maxSet;
    private double time;
    private int inputLength;
    
    public ProfitInfo(int mp, Vector<BaseballCard> ms, int inputLength) {
	this.maxProfit = mp;
	this.maxSet = ms;
	this.time = 0.0;
	this.inputLength = inputLength;
    }

    public void setTime(double t) {
	this.time = t;
    }

    public int getInputLength() {
	return this.inputLength;
    }
    
    public double getTime() {
	return this.time;
    }

    public int getMaxProfit() {
	return this.maxProfit;
    }
    
    public Vector<BaseballCard> getMaxSet() {
	return this.maxSet;
    }

    public String writeInfo() {
	String wi = "";
	wi += this.inputLength + " " + this.maxProfit + " " + this.maxSet.size() + " " + this.time;
	for(int i = 0; i < maxSet.size(); i++) {
	    wi += "\n";
	    wi += maxSet.get(i).toString();
	}
	return wi;
    }
    
    public String toString() {
	String maxSetString = this.maxSet.toString();
	return "Input Set Length: " + this.inputLength + " | Max Profit: " + this.maxProfit + " | Max Set: " + maxSetString + " | Time of execution: " + this.time + "seconds";
    }
}
