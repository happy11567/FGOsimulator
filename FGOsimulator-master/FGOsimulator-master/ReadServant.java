import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.Scanner;

public class ReadServant{
	public static Cards[] commandCards = new Cards[15];
	public static Servant[] arrayOfServant = new Servant[6];
	public static Enemy Gilles = createGilles();
	public static int a; // your first selected servant
	public static int b; //second
	public static int c; //third
	public static int x;
	public static int y;
	public static int z;
	public static void main(String[] paramArrayOfString) throws java.io.IOException, java.io.FileNotFoundException

	{
		
		
		findServant();
		selectServants();
		setCommandCardType();
		createGilles();
		printGilles();
		
		
		for(int i = 0; i<3; i++){
		shouffle();
		getOrder1();
		checkBusterLead();
		calculateDamage();
		gillesAttack();
		getOrder2();
		checkBusterLead();
		calculateDamage();
		gillesAttack();
		getOrder3();
		checkBusterLead();
		calculateDamage();
		gillesAttack();
		}
	
	}	
	public static void findServant()throws java.io.IOException, java.io.FileNotFoundException{
		BufferedReader localBufferedReader = new BufferedReader(new java.io.FileReader("blacksdocrime.txt"));
		
		for (int i = 0; i < arrayOfServant.length; i++) {
		  arrayOfServant[i] = new Servant(localBufferedReader.readLine());
		  arrayOfServant[i].setCards1(localBufferedReader.readLine());
		  arrayOfServant[i].setCards2(localBufferedReader.readLine());
		  arrayOfServant[i].setCards3(localBufferedReader.readLine());
		  arrayOfServant[i].setCards4(localBufferedReader.readLine());
		  arrayOfServant[i].setCards5(localBufferedReader.readLine());
		  arrayOfServant[i].setAtk(Integer.parseInt(localBufferedReader.readLine()));
		  arrayOfServant[i].setHp(Integer.parseInt(localBufferedReader.readLine()));
		  arrayOfServant[i].setMyClass(Integer.parseInt(localBufferedReader.readLine()));
		  arrayOfServant[i].setID(Integer.parseInt(localBufferedReader.readLine()));
		  arrayOfServant[i].printServant();
		}
		
	}	
	public static void setCommandCardType(){
		for (int i=0; i<5; i++){
			commandCards[i] = new Cards(arrayOfServant[a].getName());
			commandCards[i].setServantAttack(arrayOfServant[a].getAtk());
		}	
		for (int i=5; i<10; i++){
			commandCards[i] = new Cards(arrayOfServant[b].getName());
			commandCards[i].setServantAttack(arrayOfServant[b].getAtk());
		}	
		for (int i=10; i<15; i++){
			commandCards[i] = new Cards(arrayOfServant[c].getName());
			commandCards[i].setServantAttack(arrayOfServant[c].getAtk());
		}	
		commandCards[1].setType(arrayOfServant[a].getCards2());
		commandCards[2].setType(arrayOfServant[a].getCards3());
		commandCards[3].setType(arrayOfServant[a].getCards4());
		commandCards[4].setType(arrayOfServant[a].getCards5());
		commandCards[5].setType(arrayOfServant[b].getCards1());
		commandCards[6] .setType(arrayOfServant[b].getCards2());
		commandCards[7].setType(arrayOfServant[b].getCards3());
		commandCards[8] .setType(arrayOfServant[b].getCards4());
		commandCards[9].setType(arrayOfServant[b].getCards5());
		commandCards[10].setType(arrayOfServant[c].getCards1());
		commandCards[11] .setType(arrayOfServant[c].getCards2());
		commandCards[12].setType(arrayOfServant[c].getCards3());
		commandCards[13] .setType(arrayOfServant[c].getCards4());
		commandCards[14].setType(arrayOfServant[c].getCards5());
		commandCards[0] .setType(arrayOfServant[a].getCards1());
    }	
	public static void shouffle(){
		for (int i=0; i<15; i++){
			Cards temp = commandCards[i];
			int position = (int)(15*Math.random());
			commandCards[i] = commandCards[position];
			commandCards[position] = temp;
		}	
	}	
	public static void getOrder1(){
		Scanner localScanner1 = new Scanner(System.in);
		for (int i=0; i<5; i++){
			System.out.print("ID:" + i);
			commandCards[i].printCardName();
		}
		
		do{System.out.println("Select which cards to use");
		x = localScanner1.nextInt();
		y = localScanner1.nextInt();
		z = localScanner1.nextInt();
	
		}while((x==y || y==z || x==z)||x>4||y>4||z>4);
		commandCards[x].setOrder(1);
		commandCards[y].setOrder(2);
		commandCards[z].setOrder(3);
	}
	public static void getOrder2(){
		Scanner localScanner1 = new Scanner(System.in);
		for (int i=5; i<10; i++){
			System.out.print("ID:" + i);
			commandCards[i].printCardName();
		}
		
		do{System.out.println("Select which cards to use");
		x = localScanner1.nextInt();
		y = localScanner1.nextInt();
		z = localScanner1.nextInt();
	
		}while((x==y || y==z || x==z)||x>9||y>9||z>9||x<5||y<5||z<5);
		commandCards[x].setOrder(1);
		commandCards[y].setOrder(2);
		commandCards[z].setOrder(3);
	}
	public static void getOrder3(){
		Scanner localScanner1 = new Scanner(System.in);
		for (int i=10; i<15; i++){
			System.out.print("ID:" + i);
			commandCards[i].printCardName();
		}
		
		do{System.out.println("Select which cards to use");
		x = localScanner1.nextInt();
		y = localScanner1.nextInt();
		z = localScanner1.nextInt();
	
		}while((x==y || y==z || x==z)||x>14||y>14||z>14||x<10||y<10||z<10);
		commandCards[x].setOrder(1);
		commandCards[y].setOrder(2);
		commandCards[z].setOrder(3);
		
	}
	public static void selectServants(){
		Scanner localScanner1 = new Scanner(System.in);
		System.out.println("Enter the ID of the first servant.");
		a=localScanner1.nextInt()-1;
		System.out.println("Your first servant is: " + arrayOfServant[(a)].getName() + "\n\n");
		
		System.out.println("Enter the ID of the second servant.");
		b=localScanner1.nextInt()-1;
		System.out.println("Your second servant is: " + arrayOfServant[(b)].getName() + "\n\n");
		
		System.out.println("Enter the ID of the third servant.");
		c=localScanner1.nextInt()-1;
		System.out.println("Your third servant is: " + arrayOfServant[(c )].getName() + "\n\n");
		
		
	}
	public static void checkBusterLead() {
		if(commandCards[x].getType().equals("b")){
			commandCards[x].setDamageMod(0.5);
			commandCards[y].setDamageMod(0.5);
			commandCards[z].setDamageMod(0.5);
		}
	}
	public static void calculateDamage(){
		commandCards[x].setCardAttack();
		Gilles.dealDamage(commandCards[x].getCardAttack());
		commandCards[y].setCardAttack();
		Gilles.dealDamage(commandCards[y].getCardAttack());
		commandCards[z].setCardAttack();
		Gilles.dealDamage(commandCards[z].getCardAttack());
		commandCards[x].printCardDamage();
		commandCards[y].printCardDamage();
		commandCards[z].printCardDamage();
		for(int i=0; i<15; i++) {
			commandCards[i].resetDamageMod();
		}
		System.out.println("Gilles has " + Gilles.getEnemyHp() + " hp remaining.\n\n");
	}
	public static Enemy createGilles(){
		Enemy Gilles = new Enemy("Gilles");
		Gilles.setEnemyAtk(2000);
		Gilles.setEnemyHp(2000000);
		return Gilles;
	}
	public static void printGilles(){
		System.out.println("Your enemy is: " + Gilles.getEnemyName());
		System.out.println( Gilles.getEnemyName() + " has " + Gilles.getEnemyHp() + " hp remaining.");
	}
	public static void gillesAttack(){
		for (int i = 0; i<3; i++){
			int temp = (int)(Math.random()*3);
			if (temp == 0)
				arrayOfServant[a].takeDamage(Gilles.getEnemyAtk());
			else if (temp == 1)	
				arrayOfServant[b].takeDamage(Gilles.getEnemyAtk());
			else if (temp == 2)
				arrayOfServant[c].takeDamage(Gilles.getEnemyAtk());
			else
				System.out.println("NIGGER NIGGER NIGGER");
		}
	}
	public static void gillesTakeDamage(int ouchie){
		Gilles.dealDamage(ouchie);
	}
}
  
