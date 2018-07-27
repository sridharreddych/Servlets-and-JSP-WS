public class ClassVsInterface 
{ 
	public static void main(String[] args) 
	{
		Instrument[] instruments = new Instrument[3];
		
		instruments[0] = new Stock(); 
		instruments[1] = new Future(); 
		instruments[2] = new Option(); 
		for (Instrument i : instruments) 
		{ print(i); 
		}
		}
	public static void print(Instrument instrument) 
	{ 
		System.out.println(instrument.getAssetClass()); 
	} 
} 


