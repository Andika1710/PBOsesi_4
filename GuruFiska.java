
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
