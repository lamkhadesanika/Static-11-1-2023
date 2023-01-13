package awt;

public class TestVisit {

	public static void main(String[] args) 
	{
		Visit vis = new Visit("Yash",30.0);
		System.out.println(vis);
		
	
		System.out.println("After the visit has taken place");
		System.out.println(vis);
		String name = vis.getName();
		String price = vis.getResult();
		int duration = vis.getDuration();
		boolean done = vis.hasTakenPlace();
		System.out.println("Information on the visit:");
		System.out.println("Name: "+ name);
		System.out.println("Price: "+ price);
		String result = null;
		System.out.println("Result: "+ result);
		System.out.println("Duration: "+ duration);
		System.out.println("Done: "+ done);
		
		vis.Visit("divya Lamkhade",80);
		System.out.println("Doing again the visit should have no effects");
		System.out.println(vis);
	}
}