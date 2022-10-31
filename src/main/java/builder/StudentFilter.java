package builder;

public class StudentFilter {

    public static class Builder {
        private Integer age;
        private String name;
        private String school;

        public StudentFilter build() {
            return new StudentFilter(this);
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder school(String school) {
            this.school = school;
            return this;
        }
    }

    private final Integer age;
    private final String name;
    private final String school;

    public StudentFilter(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.school = builder.school;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }
}
