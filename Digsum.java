class Digsum{
public static void main(String[] args){
int num=123;
System.out.println("The number before sum "+num);
int sum=0;
while (num>0){
int dig=num%10;
sum=sum+dig;
num=num/10;
}
System.out.println("The number after sum "+sum);
}
}
