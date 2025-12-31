package tech.samagua.ekumen_tourism_tracker_backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "achievement")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Achievement {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "points")
    private Long points;

    @Column(name = "point_type")
    private String pointType;

    @Column(name = "audit_user")
    private String auditUser;

    @ManyToOne
    @JoinColumn(name = "administrative_division", referencedColumnName = "id")
    private AdministrativeDivision administrativeDivision;
}
