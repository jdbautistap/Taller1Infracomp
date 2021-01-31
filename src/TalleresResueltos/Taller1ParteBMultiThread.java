package TalleresResueltos;

public class Taller1ParteBMultiThread extends Thread
{

	private static int contador=0;

	public void run() {
		for(int i=0;i<10000;i++)
		{
			contador++;
		}
	}

	public static void main(String[]args) {

		Taller1ParteBMultiThread[] t = new Taller1ParteBMultiThread[1000];

		for(int i=0; i<t.length;i++)
		{
			t[i] = new Taller1ParteBMultiThread();
			t[i].start();
		}

		System.out.println(contador);
	}

}
