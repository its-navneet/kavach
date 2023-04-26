package com.example.kavach.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "admin_input")
@Getter
@Setter
@NoArgsConstructor
public class SiteLocation{
    String id;

    @NotBlank
    Float latitude;

    @NotBlank
    Float longitude;
}
