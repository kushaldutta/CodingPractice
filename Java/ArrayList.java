// practice of using ArrayLists

import java.util.ArrayList;

class List {
  
  public static void main(String[] args) {
    ArrayList<String> toDos = new ArrayList<String>();
    toDos.add("Finish Homework");
    toDos.add("Practice Tuba");
    toDos.add(1, "Work Out");
    toDos.add("Clean Room");

	for (toDo : toDos) {
		System.out.println(toDo);
	}

    System.out.println(toDos);
    System.out.println(toDos.get(1));
    System.out.println(toDos.remove(2));
    System.out.println(toDos.size());
    System.out.println(toDos.indexOf("Clean Room"));
    System.out.println(toDos);

  }
  
}