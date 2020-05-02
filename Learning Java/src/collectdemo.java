import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
	
public class collectdemo {

	public static void main(String[] args)
	{
		List<Integer> value = new ArrayList<>();
        value.add(4);value.add(8);value.add(3);value.add(1,9);
        
        Comparator<Integer> c = 
        Collections.sort(value,c);
        
        for(Object o: value)
        	System.out.println(o);
        
        
	}

}
