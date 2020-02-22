package Lamda_vjit;
interface MethodReferenceInterface
{
	MethodReferenceEx display(String a,String b);
}
public class MethodReferenceEx {

	String f,l;

	public MethodReferenceEx(String f, String l) {
		//super();
		this.f = f;
		this.l = l;
		System.out.println(f+" "+l);
	}

	public String getF() {
		return f;
	}

	public void setF(String f) {
		this.f = f;
	}

	public String getL() {
		return l;
	}

	public void setL(String l) {
		this.l = l;
	}
	
}
