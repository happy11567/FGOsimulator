public class Cards{
	private int hp;
	private int cardAttack;
	private int servantAttack;
	private String name;
	private String type;
	private int order;
	private double damageMod = 1;
	
	
	public Cards(String myName){
		name = myName;
	}

	public void setType(String myType){
		type = myType;
	}
	
	public String getType(){
		return type; 
	}	
	
	public void setOrder(int myOrder){
		order = myOrder;
	}
	
	public int getOrder(){
		return order; 
	}	
	
	public void setServantAttack(int myServantAttack){
		servantAttack = myServantAttack;
	}
	
	public int getServantAttack(){
		return servantAttack; 
	}	
	
	public void setDamageMod(double myServantAttack){
		damageMod = damageMod + myServantAttack;
	}
	
	public double getDamageMod(){
		return damageMod; 
	}	
	
	public void resetDamageMod(){
		damageMod = 1;
	}
	
	public void setCardAttack(){
		double cardMulti;
		double orderMulti;

		if(type.equals("a")){
			cardMulti = 1; 
			orderMulti = 0.2;
		}	
		else if(type.equals("b")){
			cardMulti = 1.5;
			orderMulti = 0.3;
		}
		else if(type.equals("q")){
			cardMulti = 0.8;
			orderMulti = 0.16;
		}
		else{
			cardMulti = 0;
			orderMulti = 0;
		}
		cardAttack = (int) (servantAttack	* (cardMulti + orderMulti*order) * 0.23 * damageMod);

	}

	public int getCardAttack(){
		return cardAttack;
	}
	
	
	
	public void printCardName(){
	
		System.out.println(" "+name + "("+ type + ")");
	
	}

	public void printCardDamage(){
	
		System.out.println(" "+name + "("+ type + ") dealt " +cardAttack + " damage");
		System.out.println("order is: " + order + "\n\n\n");
	}
	
	
	
	
	
	
	
	
	
}












