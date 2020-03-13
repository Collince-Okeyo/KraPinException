public class KraPinException extends Exception
{
	public KraPinException()
	{
		super(" Invalid KRA Pin Number");
	}
	
	public KraPinException(String message)
	{
		super(message);
	}
}
