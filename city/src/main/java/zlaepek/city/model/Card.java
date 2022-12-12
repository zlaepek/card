package zlaepek.city.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Card")
@NoArgsConstructor
public class Card {
    @Id  // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // SQL에서 auto_increment 의미
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "owner", length = 50)
    private String owner;

    @Column(name = "limit")
    private double limit;

    @Column(name = "total_usage")
    private double total_usage;

    @Builder
    public Card(String owner, double limit, double total_usage) {
        this.owner = owner;
        this.limit = limit;
        this.total_usage = total_usage;
    }
}