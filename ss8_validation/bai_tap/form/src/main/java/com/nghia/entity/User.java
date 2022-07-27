package com.nghia.entity;

import org.hibernate.validator.constraints.Range;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class User implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(min = 5, max = 45, message = "size from 5 to 45 ")
    private String firstName;

    @Size(min = 5, max = 45, message = "size from 5 to 45 ")
    private String lastName;

    @Pattern(regexp = "^\\+84-[0-9]{9}$", message = "Phone pattern 84+ nine number")
    private String phone;

    @Range(min = 18, max = 110, message = "age 18 - 110 ")
    private Integer age;

    @Email(message = "don't match pattern email")
    private String email;


    public User() {
    }

    public User(Integer id, @Size(min = 5, max = 45, message = "size from 5 to 45 ")
            String firstName, @Size(min = 5, max = 45, message = "size from 5 to 45 ")
                        String lastName, @Pattern(regexp = "^\\+84-[0-9]{9}$", message = "Phone pattern 84+ nine number")
                        String phone, @Range(min = 18, max = 110, message = "age 18 - 110 ") Integer age,
                @Email(message = "don't match pattern email") String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;

        if (user.age == null) {
            errors.rejectValue("age", "NotNullAge");
        } else if (user.age < 18) {
            errors.rejectValue("age", "Age18");
        }
    }
}
