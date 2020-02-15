public class Application {

    public static void main(String[] args) {
        for (Student s : Student.values()) {
            if (s.isFemale()) {
                System.out.println("女生：" + s.getName());
            }
        }
    }

}
