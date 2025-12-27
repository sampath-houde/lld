package patterns.creational.builder;

public class User {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final Integer age;
    private final Boolean isMale;
    private final Boolean isPhysicallyChallenged;

    User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;
        this.age = builder.age;
        this.isMale = builder.isMale;
        this.isPhysicallyChallenged = builder.isPhysicallyChallenged;
    }

    public static class UserBuilder {
        private String firstName;
        private String middleName = "";
        private String lastName;
        private Integer age = -1;
        private Boolean isMale;
        private Boolean isPhysicallyChallenged;

        UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        UserBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        UserBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        UserBuilder setIsMale(Boolean isMale) {
            this.isMale = isMale;
            return this;
        }

        UserBuilder setIsPhysicallyChallenged(Boolean isPhysicallyChallenged) {
            this.isPhysicallyChallenged = isPhysicallyChallenged;
            return this;
        }

        User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                ", isPhysicallyChallenged=" + isPhysicallyChallenged +
                '}';
    }
}

