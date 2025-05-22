package interview_problems;

import java.util.HashSet;
import java.util.Objects;

public class EqualsAndHashCode {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        people.add(new Person(1, "Alice"));
        System.out.println(people.contains(new Person(1, "Alice")));  // ❌ false, even though equals() is true
    }
}

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person p = (Person) o;
        return this.id == p.id && this.name.equals(p.name);
    }

    // ❌ hashCode not overridden gives FALSE, if overriden, gives TRUE which is correct
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }

}

