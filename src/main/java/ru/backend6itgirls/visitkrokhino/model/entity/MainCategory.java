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
@Table(name = "main_category")
public class MainCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int price;
    @Column(nullable = false)
    private int capacity;
    @ManyToMany
    @JoinTable(name = "main_category_extra_category",
            joinColumns = @JoinColumn(name = "main_category_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "extra_category_id", referencedColumnName = "id"))
    private List<ExtraCategory> extraCategoryList;
}
