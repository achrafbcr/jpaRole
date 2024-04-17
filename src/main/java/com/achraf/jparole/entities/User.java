package com.achraf.jparole.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Table(name ="USERS")
public class User  {

    @Id
    private String userId;
    @Column(name="USER_NAME",unique = true, length = 20)
    private String username;
    private String password;
    @ManyToMany(mappedBy = "users",fetch = FetchType.EAGER)
    private List<Role> roles = new ArrayList<>();

}
