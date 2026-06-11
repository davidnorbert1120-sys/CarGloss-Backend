package hu.cargloss.cargloss_backend.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "services")
public class OfferedService extends BaseEntity {

    @Column(nullable = false,length = 100)
    private String name;

    @Column(length = 2000)
    private String description;

    @Column(nullable = false)
    private Integer price;

}
