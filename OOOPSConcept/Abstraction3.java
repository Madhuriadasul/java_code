package OOOPSConcept;
interface Study{
	public void dispStudy();
}

class StudyImp implements Study{
	@Override
	public void dispStudy() {
		System.out.println("Study Hard");
	}
}
public class Abstraction3 {
public static void main(String[] args) {
	Study sm= new StudyImp();
	sm.dispStudy();
	
	
	
	// Tight coupling 
	
	StudyImp sp= new StudyImp();
	sp.dispStudy();
}
}
