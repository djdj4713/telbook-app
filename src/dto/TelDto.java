package dto;

public class TelDto {
    private int id;
    private String name;
    private int age;
    private String address;
    private String phone;

    @Override
    public String toString() {
        if (getId() == 0) {
            return String.format("이름: %s / 나이: %d / 주소: %s / 전화: %s",
                    name, age, address, phone);
        }
        return String.format("ID: %d / 이름: %s / 나이: %d / 주소: %s / 전화: %s",
                id, name, age, address, phone);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
