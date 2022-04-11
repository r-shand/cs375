package prj3;
import java.io.*;
import java.util.*;

public class Item {
	private int weight;
	private int profit;
	private double profitPerWeight;
	
	public Item(int weight, int profit) {
		this.weight = weight;
		this.profit = profit;
		this.profitPerWeight = (double)profit / weight;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public int getProfit() {
		return this.profit;
	}
	
	public double getProfitPerWeight() {
		return this.profitPerWeight;
	}
}
