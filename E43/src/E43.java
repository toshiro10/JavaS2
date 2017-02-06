
public class E43 {
	/**
	 * @param numToFind (compris entre 1 et 12)
	 * @return le nombre de lancés
	 * @throws Exception si le nombre à trouver est n'est compris entre 1 et 12
	 */
	public static int nbSimulatedRolling(int numToFind) throws Exception{
		if  (numToFind>12 || numToFind<2){
			IllegalArgumentException e = new IllegalArgumentException();
			throw e;
		}
		int nbTimes =0; //Nombre de lancés
		int dice1=0, dice2=0; // valeur de chaque dé

		while(dice1+dice2 !=numToFind){ 
			dice1 = 1 + (int)(Math.random() * 5); // attribut une valeur entre 1 et 6 au dé 
			dice2 = 1 + (int)(Math.random() * 5);
			nbTimes++; 
		}
		return nbTimes; 
	}
	public static void main(String[] args) throws Exception {
		int SnakeEye = nbSimulatedRolling(2);
		System.out.println("Number of times to get a Snake yes :" + SnakeEye);
	}
}