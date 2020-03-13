public class KraPinProcessor
{
	public static void isValid()
	{
		String kraPinNummber="FND634NMJWT";
		try
		{
			if(kraPinNummber.length()==11)
			{
				System.out.print("KRA Number is: "+kraPinNummber);
			}
			
			else
			{
				throw new KraPinException();
			}
			
		}
		
		catch(KraPinException e)
		{
	
			System.out.println(e.getMessage()+"  Error Kra should contain 11 characters");
			System.exit(0);
			
		}
	}
	
	public static void main(String[] args)
	{
		KraPinProcessor kp=new KraPinProcessor();
		kp.isValid();
	}
}