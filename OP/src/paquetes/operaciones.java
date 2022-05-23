package paquetes;

public class operaciones {
	
	public static void main(String[] args) {
		
		int var1 = 2, var2 = 3, var5 = 126;
		double var4 = 3.0, varNula = 0.0;
		
		int resSuma = var1 + var2;
		int resResta = var1 - var2;
		
		int resMult =  var1 * var2;
		
		int resDivInt = var2 / var1;
		int mod = var2 % var1;
		
		double resDiv = var4 / var1;
		double divNula = var4 / varNula;
		System.out.print(divNula);
		
		//suma de caracteres
		
		//operaciones booleanas
		//comparacion
		boolean resMayor = var2 >= var1;
		boolean resMenor = var2 <= var1;
		boolean resIgual = var2 == var1;
		boolean resNotIgual = var2 != var1;
		
		//operaciones de conjuncion logica
		boolean b1 = true, b2 = false;
		boolean resAnd = b1 && b2;
		boolean resOr = b1 || b2;
		boolean resNot = !b1;
		
		//atencion
		int asig = 3;
		boolean comp = asig == 3;
		
		//operaciones más complejas
		double expr = ((var1 * var2) + (resSuma - resResta)) / var4;
	}
}
