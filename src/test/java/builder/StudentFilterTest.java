package builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentFilterTest {
    StudentFilter.Builder builder;

    static final int age = 13;
    static final String name = "Student Name";
    static final String school = "School Name";

    @BeforeEach
    void setup() {
        builder = new StudentFilter.Builder();
    }

    @Test
    void build_Should_createStudentFilterWithAge() {
        var studentFilter = builder.age(age).build();

        assertEquals(age, studentFilter.getAge());
    }

    @Test
    void build_Should_createStudentFilterWithName() {
        var studentFilter = builder.name(name).build();

        assertEquals(name, studentFilter.getName());
    }

    @Test
    void build_Should_createStudentFilterWithSchool() {
        var studentFilter = builder.school(school).build();

        assertEquals(school, studentFilter.getSchool());
    }

    @Test
    void build_Should_createStudentFilterWithMultipleProperties() {
        var studentFilter = builder.age(age).name(name).school(school).build();

        assertEquals(age, studentFilter.getAge());
        assertEquals(name, studentFilter.getName());
        assertEquals(school, studentFilter.getSchool());
    }
}