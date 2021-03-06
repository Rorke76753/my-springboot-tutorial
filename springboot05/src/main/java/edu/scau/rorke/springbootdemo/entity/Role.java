package edu.scau.rorke.springbootdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author Rorke
 * @date 2020/2/13 16:33
 */
@Table(name = "tb_role")
@Entity
public class Role implements Serializable {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "user_role")
    private String typeName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
