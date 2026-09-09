/* 
Arithmatic Operations :
+ =>   Addition
- =>   Substraction
* =>   Multiplication
/ =>  Division
 % => Moduls
*/

// Arithmatic Operations
class Operation1{

public static void main(String [] args){

System.out.println('a' + 12);   //109
System.out.println(1+ 10.5f);   //11.5
System.out.println(11 + 12.5);   //23.5
System.out.println('a' + 'b');   //109
}}

class Operation2{

public static void main(String [] args){

//System.out.println(10/0);    
System.out.println(10/0.0);   //nfinity
System.out.println(0.0/10);    //0.0
System.out.println(0.0/0 );    //NaN
}}

class Operation3{

public static void main(String [] args){

//int a = 10  //Simple assignment operation
 //int  b =c=d=e=10; // throw error
  int b ,c,d,e;
 b =c=d=e=10;    //chained operatior
System.out.println(b);    
System.out.println(c);     
System.out.println(d); 
System.out.println(e);
}}

// compound Operator ( +=, -=, )

class Operation4{

public static void main(String [] args){
int a = 30;
a += 20;
System.out.println(a);
}}


// Bitwise operator(&,|,^)

class Operation5{

public static void main(String [] args){
  
System.out.println(true & false);  // false
System.out.println(true | false);  // true
System.out.println(true ^ false);  //true

}}



class Operation6{

public static void main(String [] args){
  
System.out.println(4 & 5); //4
System.out.println(4 | 5);  //5
System.out.println(4 ^ 5);   //1
}
}

// Bitwise complement Operation (Negation )(~)

class Operation7{
public static void main(String [] args){
  int a = 30;
  int b = -50;
  // 
System.out.println(~a);  // -31 
System.out.println(~b);   // 49

}
}

//class Operation8{
//public static void main(String [] args){
//boolean b = true;
//System.out.println(~b); // throw error porduce Bad operand type
//}}

/*
//Ternary Or condition Operator(?:)
class Operation9{
public static void main(String [] args){
int x = 4;
int result = (x%2=0)?"Even Number":"Odd Number";
System.out.println(result);
}}
*/



class Operation10{
public static void main(String [] args){
int x = 10, y =20;
int result = (x<y)?30:40;
System.out.println(result);
}}


class Operation11{
public static void main(String [] args){
int x = 50, y = 20;
int res  = (x<y)? 1 : 0;
System.out.println(res);
}}

class Operation12{
public static void main(String [] args){
int x = 50, y = 20;
int res  = (x<y)? 1 :(x==y)? 2 :(x>y)? 3: 0;
System.out.println(res);
}}








