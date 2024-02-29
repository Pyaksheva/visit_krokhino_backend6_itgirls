package ru.backend6itgirls.visitkrokhino.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, name = "reservation_status")
    private ReservationStatus reservationStatus;
    @Column(nullable = false, name = "customer_name")
    private String customerName;
    @Column(nullable = false, name = "customer_surname")
    private String customerSurname;
    @Column(nullable = false, name = "customer_email")
    private String customerEmail;
    @Column(nullable = false, name = "customer_phone")
    private int customerPhone;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "main_category_id")
    private MainCategory mainCategory;
    @Column(nullable = false, name = "guest_number")
    private int guestNumber;
    @Column(nullable = false, name = "start_dttm")
    private LocalDateTime startDateTime;
    @Column(nullable = false, name = "end_dttm")
    private LocalDateTime endDateTime;
    @Column(nullable = false, name = "total_price")
    private int totalPrice;
    @ManyToMany
    @JoinTable(name = "booking_extra_category",
            joinColumns = @JoinColumn(name = "booking_id"),
            inverseJoinColumns = @JoinColumn(name = "extra_category_id"))
    private List<ExtraCategory> extraCategoryList;
}
