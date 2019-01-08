
import java.util.LinkedHashMap;
import java.util.Map;


    public class TelephonBook {

        private LinkedHashMap<String, String> book = new LinkedHashMap<>();

        public TelephonBook(LinkedHashMap<String, String> book) {

            this.book = book;
        }

        public void add(String familie, String telephon) {

            book.put(familie, telephon);
        }

        public void get(String familie1) {


            for (String fam : book.keySet()) {
                if (familie1 == fam) {
                    System.out.println( fam + ":  " + book.get(fam));
                }
            }
        }
        public void display(){
            for (Map.Entry<String, String> o : book.entrySet()) {
                System.out.print(o.getKey() + ": ");
                System.out.println(o.getValue());
            }

        }
    }

