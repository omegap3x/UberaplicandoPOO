package co.domain;

import java.util.ArrayList;

public class Route {
	
	private int id;
    ArrayList<Double> start;
    ArrayList<Double> end;
    
    
    
	public Route(int id, ArrayList<Double> start, ArrayList<Double> end) {
		super();
		this.id = id;
		this.start = start;
		this.end = end;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Double> getStart() {
		return start;
	}
	public void setStart(ArrayList<Double> start) {
		this.start = start;
	}
	public ArrayList<Double> getEnd() {
		return end;
	}
	public void setEnd(ArrayList<Double> end) {
		this.end = end;
	}
    
    

}
