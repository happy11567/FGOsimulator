public class Enemy{
	private int hp;
	private int atk;
	private String name;
	
	
	
	public Enemy(String name){
		this.name = name;
	}

	public String getEnemyName(){
		return name;
	}
	
	
	public void setEnemyAtk(int atk){
		this.atk = atk;
	}
	
	public int getEnemyAtk(){
		return atk;
	} 
	
	public void setEnemyHp(int hp){
		this.hp = hp;
	}
	
	public int getEnemyHp(){
		return hp;
	} 
	
	public void dealDamage(int damage){
		hp = hp-damage;
		
	}
	
	
	
	
}	