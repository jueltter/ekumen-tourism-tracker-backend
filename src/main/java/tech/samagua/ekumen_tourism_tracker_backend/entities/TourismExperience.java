package tech.samagua.ekumen_tourism_tracker_backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tourism_experience")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TourismExperience {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @JoinColumn(name = "province", referencedColumnName = "id")
    @ManyToOne
    private AdministrativeDivision province;

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "type")
    private String type; // TODO: add questions table related to tourism experience type

    @Column(name = "audit_user")
    private String auditUser;

}
