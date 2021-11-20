package com.dbs.springbootjdbctemplate.dto;




import java.io.Serializable;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employeetbl")
public class Employee implements Serializable{
@Id
private String empId;
private String empFirstName;
private String empLastName;
private String address;
private float empSalary;
}