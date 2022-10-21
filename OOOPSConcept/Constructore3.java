package OOOPSConcept;
class emp{
	String name;
	int id;
emp(String name,int id){
	this.name=name;
	this.id=id;
}
}
public class Constructore3 {
	public static void main(String[] args) {
		emp e= new emp("mani", 3);
		System.out.println("emp name:" + e.name + " and emp id:" + e.id);
	}

}
