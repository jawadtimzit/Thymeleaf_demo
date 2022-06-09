package com.example.demo.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import java.sql.Date;
import java.util.Objects;


@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter @Slf4j
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @NonNull
     String name;
    @NonNull
     String email;
    @NonNull
     String password;
    @NonNull
     String gender;
    @NonNull
     String note;
    @NonNull
     boolean married;
    @NonNull
     Date birthday;
    @NonNull
     String profession;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return married == user.married && name.equals(user.name) && email.equals(user.email) && password.equals(user.password) && gender.equals(user.gender) && note.equals(user.note) && birthday.equals(user.birthday) && profession.equals(user.profession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, password, gender, note, married, birthday, profession);
    }
}
