
public class Main {
    public static void main(String[] args) {
		Guru_1 Guru1 = new GuruIPS("Asep");
		Guru_1 Guru2 = new GuruIPA("deni");
		Guru1.display();
		Guru2.display();

		// Polymorphic
		Guru_1 Guru3 = new GuruFiska("jon");
		Guru3.display();

		GuruFiska Guru4 = new GuruFiska("Mahmud");
		Guru4.display();
		Guru4.showoff();
		

		// Array list
		Guru_1[] kumpulanGuru = new Guru[4];
		kumpulanGuru[0] = Guru1;
		kumpulanGuru[1] = Guru2;
		kumpulanGuru[2] = Guru3;
		kumpulanGuru[3] = Guru4; 

		kumpulanGuru[0].display();
		kumpulanGuru[1].display();
		kumpulanGuru[2].display();

		
		Guru4.showoff();

		// aplikasi
		Guru1.mengguruibersama(Guru2);
		Guru1.mengguruibersama(Guru3);
		Guru1.mengguruibersama(Guru4);
                

	}
}
