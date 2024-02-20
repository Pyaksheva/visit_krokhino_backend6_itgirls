package ru.backend6itgirls.visitkrokhino.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.time.LocalTime;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity
public class Timetable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_id")
    private Service service;
    @Column(nullable = false)
    private LocalTime start;
    @Column(nullable = false)
    private Duration duration;
}
