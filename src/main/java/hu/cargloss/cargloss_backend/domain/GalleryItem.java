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
@Table(name = "gallery_items")
public class GalleryItem extends BaseEntity{

    @Column(nullable = false, length = 500)
    private String imageUrl;

    @Column(nullable = false, length = 200)
    private String publicId;

    @Column(length = 150)
    private String title;


}
