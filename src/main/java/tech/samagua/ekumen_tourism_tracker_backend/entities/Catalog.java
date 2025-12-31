package tech.samagua.ekumen_tourism_tracker_backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "catalog")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Catalog {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "parameter")
    private String parameter;

    @ManyToOne
    @JoinColumn(name = "parent", referencedColumnName = "code")
    private Catalog parent;

    @Column(name = "audit_user")
    private String auditUser;
}
