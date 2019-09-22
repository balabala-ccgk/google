/**
* Description: Multiplication tables
* Author:      lalala
* Date:        2019-9-22
*/
public class Multiplicationtables{
	/**
    * Description: Multiplication tables
    * param:       [null]
    * return:      [null]
	* Date:        2019-9-22
    */  
	public static void main(String[] args){
		int i,j,k,z;
        i = 9; 
		j = 1;
		z = 1;
		while(i >= 1){
			while(j <= 9){
			    k = i * j;
                System.out.print(i);	
				System.out.print(" * ");	
				System.out.print(j);
                System.out.print(" = ");
                System.out.print(k );
                System.out.print("  ");	
                j++;				
			}
		i--;	
		z++;
		j = z;
		System.out.print("\n");	
		}
		 
		
		
		
		
		
	}
	
	
	
}
