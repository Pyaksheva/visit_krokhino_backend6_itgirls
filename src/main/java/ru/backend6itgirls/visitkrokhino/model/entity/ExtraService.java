package ru.backend6itgirls.visitkrokhino.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity
@Table(name = "extra_service")
public class ExtraService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int price;
    @ManyToMany
    @JoinTable(name = "booking_extra_service",
            joinColumns = @JoinColumn(name = "extra_service_id"),
            inverseJoinColumns = @JoinColumn(name = "booking_id"))
    private List<Booking> bookingList;
    @ManyToMany
    @JoinTable(name = "service_extra_service",
            inverseJoinColumns = @JoinColumn(name = "service_id", referencedColumnName = "id"),
            joinColumns = @JoinColumn(name = "extra_service_id", referencedColumnName = "id"))
    private List<Service> serviceList;
}
