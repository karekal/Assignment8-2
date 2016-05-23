import java.util.*;
public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet <String> set =new HashSet <String>();
set.add("hey there");
set.add("im using");
set.add("Acadgild");
Iterator iter=set.iterator();
while (iter.hasNext()){
	System.out.println("value :"+iter.next()+" ");
}
	}

}
