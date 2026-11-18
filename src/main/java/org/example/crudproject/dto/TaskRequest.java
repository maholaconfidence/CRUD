package org.example.crudproject.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Date;

public record TaskRequest(
      @NotBlank (message = "Task must is required")
      @Size (max = 100 , message = "Task name must not exceed 100 characters")
      String Task,

      @NotBlank (message = "description is required")
      @Size (max = 200 , message = "Description name must not exceed 200 characters")
      String description,

      @NotBlank (message = "Date is required")
      @Size (max = 100 , message = "Date must be in year/month/day format")
      Date dueDate


) {
}
