import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Stream{
    public static void main(String args[]){
List<String> a=new ArrayList();
		a.add("hi");
		a.add("hello");
		a.add("welcome");
		a.add("When");
		a.add("help");
		a.add("hire");
		a.add("india");
		a.add("race");
		a.add("in");
		
		Stream<String> s1=a.stream();
		List l1=s1.map(x->x).filter(x->x.length()>4).collect(Collectors.toList());
		System.out.println(l1);
}
}