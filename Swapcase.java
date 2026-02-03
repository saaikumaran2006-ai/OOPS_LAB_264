class Swapcase{
public static void main(String[] args){
String ch="Hello";
String cc="";
System.out.println("The character before swaping "+ch);
for(int i=0; i<ch.length(); i++){
char a=ch.charAt(i);
if (a>='a' & a<='z'){
cc=cc+(char)(a-32);
}
else if (a>='A' & a<='Z'){
cc=cc+(char)(a+32);
}
else{
cc=cc+a;
}
}
System.out.println("The character after swaping "+cc);
}
}