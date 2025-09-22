package kr.ac.kopo.su.demojdbctest.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Team
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToOne
    @JoinColumn(name = "team_id")
    private Team team;
}
