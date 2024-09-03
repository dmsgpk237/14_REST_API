package com.ohgiraffers.restapi.section04.hateoas;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class UserDTO {

    private int no;

//    @NotNull(message = "아이디는 반드시 입력되어야 합니다.")
    @NotBlank(message = "아이디는 공백일 수 없습니다.")
    private  String id;

    private String pwd;

    private String name;

    private LocalDate enrollDate;

    public UserDTO() {
    }

    public UserDTO(int no, String id, String pwd, String name, LocalDate enrollDate) {
        this.no = no;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public @NotNull(message = "아이디는 반드시 입력되어야 합니다.") String getId() {
        return id;
    }

    public void setId(@NotNull(message = "아이디는 반드시 입력되어야 합니다.") String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(LocalDate enrollDate) {
        this.enrollDate = enrollDate;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "no=" + no +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", enrollDate=" + enrollDate +
                '}';
    }
}
