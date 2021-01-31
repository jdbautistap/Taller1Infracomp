package TalleresResueltos;

import java.util.Scanner;

public class Taler1ParteA extends Thread
{

	private boolean valorInicail;

	private String name;
	
	private static int limite;

	public Taler1ParteA(String name, boolean valor)
	{
		System.out.println("Extendiendo la clase thread");
		this.name = name;
		this.valorInicail = valor;
	}

	public boolean esPar(int numero)
	{
		if (numero%2==0)
		{
			return true;}
		else
		{
			return false;
		}
	}

	public void run()
	{
		try
		{
			for(int i = 1; i <= limite; i++)
			{
				boolean res = esPar(i);

				if(res==valorInicail)
				{
					System.out.println(name + ": " + i);
					Thread.sleep(50);
				}
				else if(res==valorInicail)
				{
					System.out.println(name + ": " + i);
					Thread.sleep(50);
				}
				
			}
		}
		catch (Exception e) {}

		System.out.println("Saliendo " + name);
	}

	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.print("Ingrese un limite \n");  
			limite = sc.nextInt();
		}
		
		Taler1ParteA t0 = new Taler1ParteA("Thread " + 0, false);
		Taler1ParteA t1 = new Taler1ParteA("Thread " + 1, true);

		t0.start();
		t1.start();
	}
}
