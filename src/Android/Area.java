package Android;

public class Area {
	public  void fight(Robot d, Robot c){
		do {
			if(d.getNv()>0) {d.fire(c);}
			if(c.dead()==true) {
				c.fire(d);
				}
		}while(d.dead()==true && c.dead()==true);
		if(d.getNv()==0) {
			System.out.println("le Robot "+ d.getnom()+ "est mort");
		}
		if(c.getNv()==0) {
			System.out.println("le Robot "+ c.getnom()+ " est mort");
		} 
//			do{
//				if(d.Nv>0) {
//				d.fire(c);
//				}
//				if(c.Nv>0) {
//					c.fire(d);
//					}
//			}while(d.Nv>0 && c.Nv>0);
//			
//			if(d.Nv==0) {
//				System.out.println("robot "+ d.nom+" est mort");
//			}
//			if(c.Nv==0) {
//				System.out.println("robot "+ c.nom+" est mort");
//			}
//			
		
		}
}
