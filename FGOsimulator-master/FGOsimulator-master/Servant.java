import java.io.PrintStream;

public class Servant { 
  private int hp;
  private int atk;
  private String name;
  private int myClass;
  private String cards1;
  private String cards2;
  private String cards3;
  private String cards4;
  private String cards5;
  private int ID;
  
  public Servant(String paramString) { name = paramString; }
  
  public String getCards1()
  {
    return cards1;
  }
  
  public void setCards1(String paramString) {
    cards1 = paramString;
  }
  
  public String getCards2() {
    return cards2;
  }
  
  public void setCards2(String paramString) {
    cards2 = paramString;
  }
  
  public String getCards3() {
    return cards3;
  }
  
  public void setCards3(String paramString) {
    cards3 = paramString;
  }
  
  public String getCards4() {
    return cards4;
  }
  
  public void setCards4(String paramString) {
    cards4 = paramString;
  }
  
  public String getCards5() {
    return cards5;
  }
  
  public void setCards5(String paramString) {
    cards5 = paramString;
  }
  
  
  public int getHp() {
    return hp;
  }
  
  public void setHp(int paramInt) {
    hp = paramInt;
  }
  
  public int getAtk() {
    return atk;
  }
  
  public void setAtk(int paramInt) {
    atk = paramInt;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String paramString) {
    name = paramString;
  }
  
  public int getMyClass() {
    return myClass;
  }
  
  public void setMyClass(int paramInt) {
    myClass = paramInt;
  }
  
  public int getID() {
    return ID;
  }
  
  public void setID(int paramInt) {
    ID = paramInt;
  }
  
  public void printServant()
  {
    System.out.println("name: " + name);
    System.out.println("Attack: " + atk);
    System.out.println("Hp: " + hp);
    System.out.println("Card1: " + cards1);
    System.out.println("Card2: " + cards2);
    System.out.println("Card3: " + cards3);
    System.out.println("Card4: " + cards4);
    System.out.println("Card5: " + cards5);
    System.out.println("ID: " + ID);
    if (myClass == 1) { System.out.println("Class: SEEIIBAHHHH\n");
    } else if (myClass == 2) { System.out.println("Class: Archer\n");
    } else if (myClass == 3) { System.out.println("Class: Lancer\n");
    } else if (myClass == 4) { System.out.println("Class: Caster\n");
    } else if (myClass == 5) { System.out.println("Class: Rider\n");
    } else if (myClass == 6) { System.out.println("Class: Assassin\n");
    } else if (myClass == 7) { System.out.println("Class: Berserker\n");
    } else if (myClass == 8) { System.out.println("Class: Shielder\n");
    } else if (myClass == 9) { System.out.println("Class: Ruler\n");
    } else if (myClass == 10) System.out.println("Class: Avenger\n"); 
	else {
      System.out.println("Class Dun fucked up");
    }
  }

  public void takeDamage(int damage){
	  hp = hp - damage;
       System.out.println("Gilles attacked!");
	  System.out.println(name + " took " + damage + " damage.");
	  System.out.println(name + " has " + hp + " hp remaining.\n\n\n");
	
  }
  
  
  
  
  
  
  
  
  
  
  
  
}