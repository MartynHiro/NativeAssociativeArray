public class Main {
    public static void main(String[] args) {
        MyMap<String, UserInfo> map = new MyMap<>();
        map.put("Serg", new UserInfo(30));
        UserInfo info = map.get("Serg");
        System.out.println(info);
    }
}