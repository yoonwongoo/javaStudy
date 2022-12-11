package main.java.designPattern.builder;

public class User {

    private String userName;//필수
    private String phoneNumber;//필수
    private int age;//선택
    private String gender; //선택

    //빈 생성자
    public User() {
    }

    //빌더패턴을 사용하지않을 경우에는 점층적 생성자패턴을 이용해야함.
    //하지만 이럴경우에는 간단하지만 인자들이 많아지면? 관리하기가 힘들어짐.
    public User(String userName, String phoneNumber) {
        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }
    //선택생성자
    public User(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }


    //빌더 생성자
    public User(UserBuilder userBuilder) {
        this.userName = userBuilder.userName;
        this.phoneNumber = userBuilder.phoneNumber;
        this.age = userBuilder.age;
        this.gender = userBuilder.gender;
    }


    //userBuilder
    public static class UserBuilder{
        private String userName;//필수
        private String phoneNumber;//필수
        private int age;//선택
        private String gender; //선택

    public UserBuilder(String userName, String phoneNumber){
        this.userName=userName;
        this.phoneNumber=phoneNumber;
    }

    public UserBuilder age(int age){
        this.age=age;
        return this;
    }

    public UserBuilder gender(String gender){
            this.gender=gender;
            return this;
    }
    public User build(){
        return new User(this);
    }


    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public static void main(String args[]){
        User user = new User("괴발자","010-7222-2323");

        User users = new User();
        users.setPhoneNumber("010-1111-1111");
        user.setUserName("괴발자");

        User userB = new UserBuilder("괴발자","010-1111-1111")
                .age(10)
                .gender("남성")
                .build();
        System.out.println(userB.getGender());//"남성"
    }
}
