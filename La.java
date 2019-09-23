/**
* Description: 
* Author:      lalala
* Date:        2019-9-22
*/
import java.util.Scanner;

public class La{
    public static void main(String[] args){
       /**
       * Description: 
       * param:       
       * return:      [null]
       * Date:        2019-9-22
       */ 
	System.out.print("请输入年龄:");
	Scanner scan = new Scanner(System.in);
	int age = scan.nextInt();
	
	int j;
	if(age < 15)
    j = 1;
	else
	j = 2;
	
	switch(j){
	case 1:
	System.out.print("小姐姐");
	break;
	case 2:
	System.out.print("老阿姨");
	break;
	}
	}
}
