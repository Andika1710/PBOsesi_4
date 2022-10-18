
public class GuruFiska extends GURU_1{
    String type = "Fiska";

	GuruFiska(String nama){
		super(nama);
	}

	@Override
	void display(){
		super.display();
		System.out.println("Type \t: " + this.type);
	}

    void showoff() {
        System.out.println("Saya GuruFiska!!");
    }

   
}
