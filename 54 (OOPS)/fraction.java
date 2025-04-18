class fraction 
{
    public static int gcd1(int num, int den)
    {
        int min = Math.min(num,den);
        for(int i=0; i>=1;i++){
        if(num%i==0 && den%i==0) return i;
        }
        return min;
    }
    public static class Fraction{
        int num;
        int den;

        public Fraction (int num, int den){
            this.num=num;
            this.den=den;
            simplify();
        }
        private int gcd(int a, int b) {
            while (b != 0) 
            {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        // Function to simplify the fraction
        public void simplify() {
            int gcdValue = gcd(num, den);
            num /= gcdValue;
            den /= gcdValue;
        } 
    }
    public static void main(String[] args)
    {
        Fraction f = new Fraction(54, 64);
        System.out.println(f.num+"/"+f.den);
    }
}