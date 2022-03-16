import java.lang.Runnable;
public class storage {

	private int x;

	public storage(int X) { x=X; }

	public int GetX() { return(x); }



	public storage(storage s) { this.x = s.GetX(); }

	}



	class Printer implements Runnable

	{

	private storage storage;



	Printer(storage s) { storage = new storage(s); }



	public void run()

	{

	System.out.println(storage.GetX());

	}



	}



	class Counter implements Runnable

	{

	private int N;



	public Counter(int n) { N=n; }

	public int GetN() { return(N); }



	public void run()

	{

	for (int iLoop=1; iLoop<=N; iLoop++)

	{

	storage storage = new storage(iLoop);

	Printer printer = new Printer(storage);

	Thread.yield();

	printer.run();

	}



	}



	}



