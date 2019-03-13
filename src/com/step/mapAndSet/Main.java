package com.step.mapAndSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
  public static void main(String[] args) {

    Person pn1 = new Person("athul", 20);
    Person pn2 = new Person("puli", 19);
    Person pn3 = new Person("deepi", 30);


    HashSet<Person> people = new HashSet<>();
    people.add(pn1);
    people.add(pn2);
    people.add(pn3);

//    System.out.println(people);

    HashMap<String, String> countries = new HashMap<>();

    countries.put("Japan","Tokyo");
    countries.put("Germany","Berlin");
    countries.put("Bangladesh","Dhaka");

//    System.out.println(countries);

    for (Map.Entry<String,String> entry: countries.entrySet()) {
      System.out.println(entry.getKey() + " ............ " + entry.getValue());
    }


  }
}
