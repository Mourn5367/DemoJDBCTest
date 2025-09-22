package kr.ac.kopo.su.demojdbctest.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private float price;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "detail_id")
//    private Detail detail;

    // 공유 기본키를 사용한 양방향...

    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Detail detail;


}
