package com.MusicPlatForm.comment_service.dto.client;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class UserProfileResponse {
    String id;
    String firstName;
    String lastName;
    String displayName;
    LocalDate dob;
    Boolean gender;
    String email;
    String cover;
    String avatar;
    String userId;
}
