import java.util.Arrays;
class count_string_through_streamAPI
{
	public static void main(String[] ar)
	{

	String a="HAAYE NI TERA COKA";

	long result=Arrays.stream(a.split("\\s+")).filter(word -> !word.isEmpty()).count();

	System.out.print(result);
	}
}