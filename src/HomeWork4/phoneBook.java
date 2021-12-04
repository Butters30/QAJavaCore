package HomeWork4;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class phoneBook {
private final HashMap<String, HashSet<String>> PhoneBook =new HashMap<>();
    public Set<String> getPhone(String name){return PhoneBook.get(name);}
    public void addPB(String name, String phoneNumber){
 HashSet<String> phone;
  if(PhoneBook.containsKey(name)){
    phone =PhoneBook.get(name);}

  else{phone = new HashSet<>();}
   phone.add(phoneNumber);
   PhoneBook.put(name,phone);
  }
}
