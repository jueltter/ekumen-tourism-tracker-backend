package tech.samagua.ekumen_tourism_tracker_backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "turist_achievement")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TouristAchievement {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @JoinColumn(name = "tourist", referencedColumnName = "id")
    @ManyToOne
    private Tourist tourist;

    @JoinColumn(name = "achievement", referencedColumnName = "id")
    @ManyToOne
    private Achievement achievement;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "audit_user")
    private String auditUser;
}
