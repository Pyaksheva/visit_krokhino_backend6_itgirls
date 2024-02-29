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
@Table(name = "extra_category")
public class ExtraCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int price;
    @ManyToMany
    @JoinTable(name = "booking_extra_category",
            joinColumns = @JoinColumn(name = "extra_category_id"),
            inverseJoinColumns = @JoinColumn(name = "booking_id"))
    private List<Booking> bookingList;
    @ManyToMany
    @JoinTable(name = "main_category_extra_category",
            inverseJoinColumns = @JoinColumn(name = "category_id", referencedColumnName = "id"),
            joinColumns = @JoinColumn(name = "extra_category_id", referencedColumnName = "id"))
    private List<MainCategory> mainCategoryList;
}
