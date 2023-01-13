package awt;

public class Visit {

	  private String name;
	  private double price;
	  private String result; // we represent a visit that has not taken place with
	                        // result equal to null, and one that has taken place
	                        // with result different from null
	  private int duration;

	  public Visit(String n, double p) {
	    name = n;
	    price = p;
	    result = null;
	    duration = -1;
	  }

	  public String getName() {
	    return name;
	  }

	  public double getPrice() {
	    return price;
	  }

	  public String getResult() {
	    return result;
	  }

	  public int getDuration() {
	    return duration;
	  }

	  public boolean hasTakenPlace() {
	    return result != null;
	  }

	  public void visit(String res, int dur) {
	    if (result == null) {
	      result = res;
	      duration = dur;
	    }
	  }

	  public String toString() {
	    return "name: " + name +
	      ", price: " + price +
	      ", taken place: " + (hasTakenPlace()? "with duration " + duration + " - Result: " + result : "false");
	  }

	public void Visit(String string, int i) {
		// TODO Auto-generated method stub
		
	}
}

