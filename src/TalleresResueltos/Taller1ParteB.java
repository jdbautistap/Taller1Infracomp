package TalleresResueltos;

public class Taller1ParteB 
{
	private int contador =0;

	public void incrementar()
	{
		for(int i=0; i<1000;i++)
		{
			contador++;
		}
	}
	
	public int getContador()
	{
		return contador;
	}

	public static void main(String[] args) {
		Taller1ParteB t = new Taller1ParteB();
		
		for (int i = 0; i<1000;i++)
		{
			t.incrementar();
		}
		System.out.println(t.getContador());
	}
}
