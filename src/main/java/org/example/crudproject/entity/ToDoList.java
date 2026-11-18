package org.example.crudproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ToDoList")

public class ToDoList {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;

   @Column(name = "first task", nullable = false)
    private  String firstTask;

    @Column(name = "second task", nullable = false)
    private  String secondTask;

    @Column(name = "third task", nullable = false)
    private  String thirdTask;

}
