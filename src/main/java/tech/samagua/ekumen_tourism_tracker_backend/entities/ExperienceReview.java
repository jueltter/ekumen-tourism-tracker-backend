package tech.samagua.ekumen_tourism_tracker_backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "experience_review")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExperienceReview {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "rating")
    private Double rating;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @JoinColumn(name = "tourist", referencedColumnName = "id")
    @ManyToOne
    private Tourist tourist;

    @JoinColumn(name = "tourism_experience", referencedColumnName = "id")
    @ManyToOne
    private TourismExperience tourismExperience;

    @Column(name = "audit_user")
    private String auditUser;



}