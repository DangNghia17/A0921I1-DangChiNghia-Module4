package codegym.vn.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class ClassName {
    @Id
    @Column(length = 20)
    private String classCode;
    private String className;

    @OneToMany(mappedBy = "className")
    private Set<Student> students;
    public ClassName() {

    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
