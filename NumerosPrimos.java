public class NumerosPrimos 
{
    private int suma;
    public void sumPrimesInsideFirstNumbers()
    {
        System.out.println("SUMA DE LOS NUMEROS PRIMOS EXISTENTES ENTRE EL 0~50:");        

        for(int i = 2; i < 51; i++)
        {            
            if(isPrime(i))
            {
                System.out.println("- " + i);
                suma+=i;
            }
        }

        System.out.println("- La suma de todos los numeros es: " + suma);
    }
    public void sumFirstFifty()
    {
        System.out.println("SUMA DE LOS 50 PRIMEROS NUMEROS PRIMOS EXISTENTES:");
        int contador = 0;
        int number = 2;      //Cero y Uno no son primos asi que no se comprueban
        do
        {
            if(isPrime(number))
            {
                contador++;
                System.out.println("- " + number);
                suma += number;
            }
            number++;
        }
        while(contador < 50);

        System.out.println("- La suma de todos los numeros es: " + suma);
    }

    

    private boolean isPrime(int n)
    {
        //#region ciclos for deberían hacer los ciclos que se espera de ellos y no terminar antes
        //for(int i = 2; i < n; i++)
        //{
        //    if(n%i == 0) return false;
        //}
        //return true;
        //#endregion

        
        int i = 2;
        while(n%i != 0)
        {
            i++;
        }
        return n==i;
    }
    private void resetSuma()
    {
        suma = 0;
    }



    public static void main(String[]args)
    {
        NumerosPrimos npc = new NumerosPrimos();
        npc.sumPrimesInsideFirstNumbers();
        npc.resetSuma();
        npc.sumFirstFifty();
    }
}
