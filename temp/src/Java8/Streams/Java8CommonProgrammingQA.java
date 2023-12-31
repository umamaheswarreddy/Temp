package Java8.Streams;

import javax.swing.text.html.parser.Entity;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8CommonProgrammingQA {
    public static void main(String[] args) {

        List<Student> studentList = Stream.of(
                        new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                        new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                        new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                        new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                        new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                        new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                        new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
                        new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                        new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                        new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929")))
                .toList();


        // 1. Find the list of students whose rank is in between 50 and 100

        List<Student> studentList1 = studentList.stream().filter(s -> s.getRank() > 50 && s.getRank() < 100).toList();
//        System.out.println(studentList1);

        //2. Find the Students who stays in Karnataka and sort them by their names

        studentList.stream().filter(student -> student.getCity().equals("Karnataka")).sorted(Comparator.comparing(Student::getFirstName).reversed()).map(Student::getFirstName).collect(Collectors.toList());

        List<String> collect = studentList.stream().filter(student -> student.getCity().equals("Karnataka"))
                .sorted(Comparator.comparing(Student::getFirstName, Comparator.reverseOrder())).map(Student::getFirstName).collect(Collectors.toList());
//         System.out.println(collect);


        // 3. Find all departments names

        List<String> DeptList = studentList.stream().map(Student::getDept).distinct().collect(Collectors.toList());
        Set<String> DeptSet = studentList.stream().map(Student::getDept).collect(Collectors.toSet());
//        System.out.println(DeptSet);

        //4.  Find all the contact numbers

        List<String> phNumList = studentList.stream().flatMap(student -> student.getContacts().stream()).toList();
//        System.out.println(phNumList);

        //one2one-> map
        //one2many-> flatmap

        //5.  Group The Student By Department Names

        Map<String, List<Student>> stringListMap = studentList.stream().collect(Collectors.groupingBy(Student::getDept));

        //6. Find the department who is having maximum number of students


        Map.Entry<String, Long> stringLongEntry = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue()).get();
//        System.out.println(stringLongEntry);

        //7. Find the average age of male and female students

        Map<String, Double> avgStudents = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge)));
//        System.out.println(avgStudents);

        //8.Find the highest rank in each department

        Map<String, Optional<Student>> collect1 = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.maxBy(Comparator.comparingInt(Student::getRank))));

//        System.out.println(collect1);

        //9 .Find the student who has second rank
        studentList.stream().sorted(Comparator.comparingInt(Student::getRank)).limit(2).skip(1).forEach(System.out::println);

        Student student = studentList.stream()
                        .sorted(Comparator.comparingInt(Student::getRank))
                                .skip(1)
                                        .findFirst().get();

        System.out.println(student);


    }
}
