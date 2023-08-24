package Program;

public class Employer {
    private String name;
    private String lastName;
    private Integer age;

    public Employer(String name, String lastName, Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Employer() {
    }

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employer employer = (Employer) o;

        if (!name.equals(employer.name)) return false;
        if (!lastName.equals(employer.lastName)) return false;
        return age.equals(employer.age);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + age.hashCode();
        return result;
    }
}
