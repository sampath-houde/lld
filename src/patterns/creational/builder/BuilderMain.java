package patterns.creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Sampath", "Houde")
                .setAge(10)
                .setIsMale(false)
                .setMiddleName("Shiddaram")
                .setIsPhysicallyChallenged(true)
                .build();

        System.out.println(user);

        User user2 = new User.UserBuilder("Rahul", "Kulkarni")
                .build();

        System.out.println(user2);
    }
}
