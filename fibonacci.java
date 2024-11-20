class fibonacci
{
	public static void main(String[] ar)
	{

	int next_num=0,
	first_num=0,
	second_num=1,
	n=10; 

	System.out.println("the fibonacci series till"+ n +"is");

	for(int i=0;i<=n;i++)
	{
	System.out.print(first_num); 
	next_num=first_num+second_num;
	first_num=second_num;
	second_num=next_num;
	}
	}
}