package br.com.etechoracio.feriados.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;


@Entity
@Table(name="feriados")


 public class Feriado {
	
 @Id
 @GeneratedValue
 @Column(name = "F_ID")
 private Integer id;
 
 @Column(name ="F_TIPO")
 private String tipo;
 
 @Column(name="F_DESC")
 private String desc;
 
 @Column(name ="F_DATA")
 private Date data;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public String getDesc() {
	return desc;
}

public void setDesc(String desc) {
	this.desc = desc;
}

public Date getData() {
	return data;
}

public void setData(Date data) {
	this.data = data;
}
 
 }   
 