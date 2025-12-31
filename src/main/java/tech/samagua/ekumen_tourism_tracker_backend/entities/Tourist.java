package tech.samagua.ekumen_tourism_tracker_backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tourist")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tourist {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "points")
    private long points;

    @Column(name = "profile_picture")
    private String profilePicture;

    @Column(name = "badge")
    private String badge;

    @Column(name = "audit_user")
    private String auditUser;
}
