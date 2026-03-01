package bai6;

class PatientEx6 {
    String name;
    int age;
    String department;

    public PatientEx6(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return String.format("Patient(%s, Age: %d)", name, age);
    }
}
