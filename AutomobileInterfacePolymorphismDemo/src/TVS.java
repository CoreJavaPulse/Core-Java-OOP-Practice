public class TVS implements Bike {
	
	public String getModel()
	{ 
		return "Tvs Apache"; 
	}
	public double getPrice()
	{ 
		return 85000;
	}
	public String getColor()
	{ 
		return "Blue"; 
	}
	public int getcc()
	{ 
		return 160; 
		}
	public String toString()
	{ 
		return getModel()+"\t"+getColor()+"\t"+getPrice()+"\t\t"+getcc(); 
	}
}
