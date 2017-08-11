package EncontrErros;

abstract class Identifique_Erro_3 {

	private String nome;
	private long capacidadeEmBytes;
	Dispositivo(String n,long c)
		{
		nome = n; capacidadeEmBytes = c;
		}
	abstract public String toString();
	abstract public double capacidadeEmMegabytes();
	}
class DiscoOtico extends Dispositivo
{
	public DiscoOtico(long c) 
	{
		super("Disc Ótipco", 24117280L);
	}
	public String toString()
	{
		return "Dispositivo: "+nome+" capacidade: "+c;
	}
}
	

