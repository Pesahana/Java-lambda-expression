package examples;

		public class NoParameters{  
			
		public static void main(String[] args) {  
		    Sayable s=()->{  
		    	
		        return "Today is the good day.";  
		    };  
		    
		    System.out.println(s.say());  
		}  

}  

