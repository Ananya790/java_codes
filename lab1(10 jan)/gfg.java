class gfg{
public static void main(String[] args) {
int n1 = 20, n2 = 30, gcd = 1;
for(int i = 1; i <= n1 && i <= n2; ++i) { 
if(n1 % i == 0 && n2 % i == 0) gcd = i;
}
int lcm = (n1 * n2) / gcd;
System.out.println("n1=20");
System.out.println("n2=30");
System.out.println("gcd is: " + gcd);
System.out.println("lcm is: " + lcm);
} 
}
