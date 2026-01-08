/*
2. Write a Program in Java to Add two Numbers.
Input: 2 3
Output: 5
*/
class segundo {
    public int sum(int numero1, int numero2)
    {
        return numero1 + numero2;
    }
    
    public static void main(String[] args)
    {
        segundo ob = new segundo();
        int resultado = ob.sum(4, 5);
        System.out.println(resultado);
    }
}