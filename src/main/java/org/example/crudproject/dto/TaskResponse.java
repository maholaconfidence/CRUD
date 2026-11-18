package org.example.crudproject.dto;

import java.util.Date;

public record TaskResponse(
        long id,
        String Task,
        String description,
        Date dueDate

) {
}
