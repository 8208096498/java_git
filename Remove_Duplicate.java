package Top_16_Programms;

public class Remove_Duplicate {

	public static void main(String[] args) {
		
		String Input =new String ("astdgfdhgfjh");
		String Output=new String();
		
		for (int i=0;i<Input.length();i++) 
		{
			for(int j=0;j<Output.length();j++)
		{
				if(Input.charAt(i) != Output.charAt(j)) 
		{
			    Output=Output+Input.charAt(i);
		   }
		}
	}
		        System.out.println(Output);
		
       	}
	}
