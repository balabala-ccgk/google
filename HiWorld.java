public class HiWorld{
	public static void main(String[] args){
		//System.out.println("Hello World !");
		//sayHello(sum());
		HiWorld hiworld = new HiWorld();
		hiworld.sayHello(hiworld.sum());
	}
	
	
	
	public int sum(){
		int sum = 0;
		for(int i = 0; i<=100;i++){
			sum += i;
		}
		return sum;
	}
}