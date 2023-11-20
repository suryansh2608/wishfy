package in.wishfy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="EmpId")
    private Long id;
    @javax.validation.constraints.NotBlank
    @Column(name="EmpName")
    private String name;
    @javax.validation.constraints.Email
    @Column(name="EmpEmail")
    private String email;
    @Column(name="EmpDepartment")
    private String department;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EmpJoiningDate")
    private Date joiningDate;
  
}
