package mx.com.gm.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="assignations")
public class Asignation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_assignation")
    private Integer idAsignation;

    private String turn;

    @JoinColumn(name = "id_student", referencedColumnName = "id_student")
    @ManyToOne
    private Student student;

    @JoinColumn(name = "id_course", referencedColumnName = "id_course")
    @ManyToOne
    private Course course;

    public Asignation() {
    }

    public Asignation(Integer idAsignation) {
        this.idAsignation = idAsignation;
    }

    public Integer getIdAsignation() {
        return idAsignation;
    }

    public void setIdAsignation(Integer idAsignation) {
        this.idAsignation = idAsignation;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Asignations{" + "idAsignation=" + idAsignation + ", turn=" + turn + ", student=" + student + ", course=" + course + '}';
    }

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.idAsignation);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Asignation other = (Asignation) obj;
        if (!Objects.equals(this.idAsignation, other.idAsignation)) {
            return false;
        }
        return true;
    }

    
}
