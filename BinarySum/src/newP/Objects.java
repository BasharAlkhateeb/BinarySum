
package newP;


public class Objects {
    
    public static int binarySum (int x , int y){
int x1=x;
int y1=y;
///////////////
int c1=0;
int c2=0;
///////////////
int t=1;
int t1=1;
//////////////
int p=0;
int p1=0;
//////////////
int o=0;
int o1=0;
//////////////
int sum=0;
int sum2=0;
//////////////
int sum3=0;

/////////////
while (x1!=0){
    c1++;
    x1/=10;
}
//////////
while (y1!=0){
c2++;
y1/=10;    
    }
//////////
    x1=x;
    y1=y;
//////////
  if (x%10==1){
      o++;
      x1/=10;
  }
  else {
      o=0;
              x1/=10;}
///////////////////////////////////////////////////////////////////////
 //////////////////////////////////////////////////////////////////////
   for (int i =0;i<c1;i++){

                 if (x1%10==1){
                   t*=2;
                   p+=t;
                   
               }
                    if (x1%10==0){
                  t*=2;     
                   
               }

     x1/=10;

}
   
   sum=p+o;
    if (y%10==1){
      o1++;
      y1/=10;
  }
  else {
      o1=0;
              y1/=10;}
///////////////////////////////////////////////////////////////////////
 //////////////////////////////////////////////////////////////////////
   for (int i =0;i<c2;i++){
 
                 if (y1%10==1){
                   t1*=2;
                   p1+=t1;
                   
               }
                    if (y1%10==0){
                  t1*=2;

               }

     y1/=10;

}
   sum2=p1+o1;
   sum3=sum2+sum;
   
   
   /////////////////////////////////////////////////////////////////////////
    int sum3_same=sum3;
    int sum_final=1;
    int m=1;
    int length=0;
/////////////////////////////////////////////////////////////////////////

 while (sum3_same>0){
     sum3_same/=2;
     length ++;
 }
 for (int j=0;j<length;j++){
     sum_final*=10;
    
 }
 int s=sum_final;
sum3_same=sum3;
for (int i =0 ; i < length; i++){
    if (sum3_same%2==0){
        m*=10;
    }
    else if (sum3_same%2==1){
        
       sum_final+=m;
        m*=10;
    }
     
    sum3_same/=2;

}
int calculate=sum_final-s;
return calculate ;
}
}
