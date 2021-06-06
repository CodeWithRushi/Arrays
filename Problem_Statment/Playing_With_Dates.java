/*
Given a date string in the format Day Month Year where
Convert the date string "Day Month Year" to the date string "YYYY-MM-DD".
 * */
import java.util.*;
public class Playing_With_Dates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String []dates= {"25th Jan 1997","2nd Oct 1998","15th Jul 1999","3rd Aug 2000"};
		String result[]=calculateDates(dates);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}
	public static String[] calculateDates(String []dates)
	{
		int mon=0;
		String date=null;
		String arr[]=new String[dates.length];
		String month[]= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		for(int i=0;i<dates.length;i++)
		{
			String temp[]=dates[i].split("\\s");
			if(temp[0].length()==4)
			{
				date=temp[0].substring(0,2);
			}
			else
			{
				 date="0"+temp[0].substring(0,1);
			}
			for(int j=0;j<month.length;j++)
			{
				if(temp[1].equals(month[j]))
				{
					 mon=j+1;
				}
			}
			arr[i]=(temp[2]+"-"+mon+"-"+date);
		}
		return arr;
	}
}


/*
 
OUTPUT:-

1997-1-25
1998-10-02
1999-7-15
2000-8-03


*/
