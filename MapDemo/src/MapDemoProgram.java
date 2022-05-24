import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemoProgram {
	 public static void main(String[] args) throws Exception {
	        concurrentHashMapIllustration();
	        arrayListIllustration();
	 }
	 private static void arrayListIllustration() {
	        // create ArrayList
	        ArrayList<String> countries = new ArrayList<>();

	        // Add elements to ArrayList
	        countries.add("India");
	        countries.add("USA");
	        countries.add("SriLanka");
	        countries.add("Nepal");
	        System.out.println("ArrayList: " + countries);
	        countries.remove("USA");
	       System.out.println("ArrayList: " + countries);
	    }
	 private static void concurrentHashMapIllustration() {
	        System.out.println("ConcurrentHashMapMethod - Illustration");
	        ConcurrentHashMap<String, String> bookISBN = new ConcurrentHashMap<>();
	        bookISBN.put("978-1-60309-502-0", "Animal Stories");
	        bookISBN.put("978-1-60309-495-5", "Better Place");
	        bookISBN.put("978-1-60309-478-8", "Bionic");
	        bookISBN.put("978-1-60309-420-7", "Bottled");
	        bookISBN.put("978-1-60309-449-8", "BOX");
	        bookISBN.put("978-1-60309-455-9","Deep Breaths");
	        bookISBN.put("978-1-60309-344-6","The Fun Family");
	        bookISBN.put("978-1-60309-438-2","Girl Town");
	        System.out.println("Size of the Map - " + bookISBN.size());
	        printMap(bookISBN);
	        bookISBN.remove("978-1-60309-438-2");
	        System.out.println("Size of the Map - " + bookISBN.size());
	        printMap(bookISBN);
	    }
	 public static void printMap(Map<String, String> map){
	        for (String key: map.keySet()) {
	            System.out.println(key + " --> "  + map.get(key));
	        }
	 }
}
