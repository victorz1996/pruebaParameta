package com.example.pruebaparameta.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.sql.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID;
    @NotEmpty(message = "el campo nombres no debe ser nulo")
    private String nombres;
    @NotEmpty(message = "el campo apellidos no debe ser nulo")
    private String apellidos;
    @NotEmpty(message = "el campo tipoDocumento no debe ser nulo")
    private String tipoDocumento;
    @NotEmpty(message = "el campo numeroDocumento no debe ser nulo")
    private String numeroDocumento;
    @NotEmpty(message = "el campo fechaVencimiento no debe ser nulo")
    private Date fechaVencimiento;
    @NotEmpty(message = "el campo fechaVinculacionCompania no debe ser nulo")
    private Date fechaVinculacionCompania;
    @NotEmpty(message = "el campo cargo no debe ser nulo")
    private String cargo;
    @NotEmpty(message = "el campo salario no debe ser nulo")
    private Double salario;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return userID != null && Objects.equals(userID, user.userID);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
