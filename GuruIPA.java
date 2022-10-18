
public class GuruIPA extends GURU_1{
    String type = "IPA";

	GuruIPA(String nama){
		super(nama);
	}

	@Override
	void display(){
		super.display();
		System.out.println("Type \t: " + this.type);
	}
}

  