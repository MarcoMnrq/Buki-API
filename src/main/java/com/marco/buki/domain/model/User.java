package com.marco.buki.domain.model;

import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@Entity
@Table(name = "users")
public class User extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 30, min = 4)
    private String email;

    @NotNull

    private String firstName;

    private String lastName;

    private String description;

    private Character gender;

    private Boolean verified;

}
