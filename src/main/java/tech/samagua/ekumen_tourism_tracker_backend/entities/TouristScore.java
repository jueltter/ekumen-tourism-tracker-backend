package tech.samagua.ekumen_tourism_tracker_backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "tourist_score")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TouristScore {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "points")
    private Long points;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "point_type")
    private String pointType;

    @JoinColumn(name = "tourist", referencedColumnName = "id")
    @ManyToOne
    private Tourist tourist;

    @Column(name = "audit_user")
    private String auditUser;
}
