package kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "job_title")
public class JobTitle {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "title_name")
    private String titleName;
}
