package TalleresResueltos;

import java.util.Scanner;

public class Taller1ParteARunnable implements Runnable
{
	private boolean valor;

	private String name;

	private static int limite;

	public Taller1ParteARunnable (String name, boolean valor)
	{
		System.out.println("Implementando la interfaz Runnable.");
		this.name = name;
		this.valor = valor;
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

				if(res==valor)
				{
					System.out.println(name + ": " + i);
					Thread.sleep(100);
				}
				else if(res==valor)
				{
					System.out.println(name + ": " + i);
					Thread.sleep(100);
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

		Thread t0 =  new Thread(new Taller1ParteARunnable("Thread " + 0, false));
		Thread t1 =  new Thread(new Taller1ParteARunnable("Thread " + 1, true));

		t0.start();
		t1.start();
	}
}
