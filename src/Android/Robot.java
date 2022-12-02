package Android;

import java.util.Scanner;

public class Robot {
		protected  String nom;
		protected int Nv=10;
		public Robot(String nom) {
			this.nom=nom;
			this.Nv=10;
			System.out.println("Robot "+this.nom);
		}
//		public Robot(String nom, int a) {
//			this.nom=nom;
//			this.Nv=a;
//		}
		/*public Robot() {
			this.nom="";
			this.Nv=10;
		}*/
		
		public void setNv(int n) {
			this.Nv=n;
		}
		
		public int getNv() {
			return Nv;
		}
		
		public String getnom() {
			return nom;
		}
		
		public void fire (Robot b) {
			
				b.setNv(b.getNv()-2);
				System.out.println("Robot "+b.getnom()+" a ete attaquer par "+this.getnom());
			}
		
			/*Scanner se =new Scanner(System.in);
			b.Nv=10;
			this.Nv=10;
			do {
				
			System.out.println(" Appuye sur '0' pour que le  "+this.nom+" tire sur le Robot "+b.nom);
			int l= se.nextInt();
			System.out.print("le Robot "+b.nom+" a ete touche par" + this.nom+ "\n");
			System.out.println("  Appuye sur '1' pour que le  "+b.nom+" tire sur le Robot "+this.nom);
			int r=se.nextInt();
			System.out.print("le Robot "+this.nom+" a ete touche par " + b.nom);
			r= se.nextInt();
			while(l!=0 || r!=1) {
				System.out.println("erreur arrete d'etre idiot");
				l=se.nextInt();
				r=se.nextInt();
			}
			b.Nv-=2;
			this.Nv-=2;
			}while(b.Nv>0||this.Nv>0);
			System.out.print(" putain  "+b.nom+" EST MORT");
			System.out.print(" enfin je t'ai eu  Robot"+this.nom+"  TU EST MORT");
		
			
		}*/
//		public void touch(Robot J) {
//			System.out.println("est touche par "+ J.nom );
//		}
		public void affiche () {
			//System.out.println("robot " +this.nom);
		}
		
		public boolean dead() {
			if(this.getNv()>0) {
				return true;
			}else {
				return false;
			}
			}
		/*public void dead() {
			if(this.Nv<=0) {
				System.out.println("le rebot " +this.nom +" est mort");
			}else {
				System.out.println("le rebot " +this.nom +" n'est pas mort il lui reste encore des vie");
			}
		}*/
		
	}


