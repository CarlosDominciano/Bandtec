#include <stdio.h>
#include <math.h>
int main (){
	 int n=0,c,i,raiz,achei=0,super=0,x,y; 
	 	c=scanf("%d",&n);
	 	while(c!=EOF){
		raiz = (int)sqrt(n)+1;
        if (n > 2){
			for(i = 2;i <= raiz && achei ==0;i++){
            if(n%i==0){
            achei=1; }
    		}
    	}
		if(achei == 1 || n<=1){
			printf("Nada\n");		
		}
		else {
			     do{
			     	x=n%10;
					y=n/10;
					n=y;
					raiz=x/2;
					if(x<=1){
						super =1;
					}
					for(i=2;i<=raiz && super ==0 ;i++){
						if(x%i ==0){
							super =1;
						}
					}
					} while (n > 0 );
					if(super == 0 ){
							printf("Super\n");
					}
					else{
							printf("Primo\n");
					}
				}
				achei=0;
				super=0;
				c = scanf("%d",&n);
		}		
	return 0;
}