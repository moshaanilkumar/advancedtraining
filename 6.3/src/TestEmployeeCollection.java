import java.util.Vector;
public class TestEmployeeCollection {
	public static void main(String[] args) {
		Vector<employe> v = addInput();
		display(v);
		}

	private static Vector<employe> addInput() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void display(Vector<employe> v) {
		// TODO Auto-generated method stub
		
	}

	public static Vector<employe> main1(String[] args) {
		employe e1=new employe (101,"bhavani", "Mallethula");
		employe e2=new employe (102,"srlekha", "kakani");
		employe e3=new employe (103,"akanksha", "pasikanti");
		Vector<employe> v=new Vector<employe>();
		v.add(e1);
		v.add(e2);
		v.add(e3);
		return v;
	}
	public static void main11(String[] args) {
		for(employe e:v)
		{
			System.out.println(e.getEmpid()+"\t"+e.getEname()+"\t"+e.getAddress());
		}
	}
}