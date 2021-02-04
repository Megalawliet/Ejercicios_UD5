package UD5;
//Este no va, directament.
//Estic una mica frustrada perque no me funciona el cervell com hauria de funcionar,
//apart que estic molt oxidada de lògica ara mateix.
//PD: m'agafaré el finde i m'ho miraré tot en "més cariño".
//Sé que puc perque altres vegades ho  he fet, pero per X o Y tinc el coco bloquejat.

public class Ejercicio9 {

	public static void main(String[] args) {
		boolean rest2=false;
		for (int i = 1; i <= 100; i++) {
			//System.out.println(i);
			//int Res1=i%2;
			//int Res2=i%3;
						
			if (i %2 == 0) {
				//System.out.println(Res1+" Es divisible entre 2");
				rest2=true;				
			}
			if (rest2==true) {
				System.out.println(i+ " Es divisible per 2\n");
			}
				else {
					System.out.println(i+ " Es divisible per 3\n");
				}
				rest2=false;
			//}
				//System.out.println(Res1);
				//System.out.println(Res2);
			/*if (Res1!=Res2) {
				System.out.println(Res2+ Res1+ " Es divisible entre ");	
			}*/
			
		}
	}
}