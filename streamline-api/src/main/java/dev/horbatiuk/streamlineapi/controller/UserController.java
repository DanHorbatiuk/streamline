package dev.horbatiuk.streamlineapi.controller;

import dev.horbatiuk.streamlineapi.persistance.entities.User;
import dev.horbatiuk.streamlineapi.persistance.enums.UserStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    /*
     *  GET /users/me — отримати інформацію про поточного користувача.
     *  PUT /users/me — оновлення профілю користувача.
     *  GET /users — список користувачів (для адміністратора).
     *  GET /users/{id} — інформація про конкретного користувача (для адміністратора).
     *  DELETE /users/{id} — видалити користувача (адмін).
     */

    @GetMapping
    @PreAuthorize("'ADMINISTRATOR' or 'SUPER_ADMINISTRATOR'")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok().body(new ArrayList<User>());
    }

    @GetMapping
    @PreAuthorize("'ADMINISTRATOR' or 'SUPER_ADMINISTRATOR'")
    public ResponseEntity<User> getUser(
            @RequestParam UUID userId
    ) {
        return ResponseEntity.ok(new User());
    }

    @PatchMapping
    @PreAuthorize("'ADMINISTRATOR' or 'SUPER_ADMINISTRATOR'")
    public ResponseEntity<User> changeUserStatus(
            @RequestParam UUID userID,
            @RequestParam UserStatus userStatus
    ) {
        return ResponseEntity.ok(new User());
    }

    @DeleteMapping
    @PreAuthorize("'ADMINISTRATOR' or 'SUPER_ADMINISTRATOR'")
    public ResponseEntity<Void> deleteUser(
            @RequestParam UUID userId
    ) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/me")
    public ResponseEntity<User> getCurrentUser() {
        return ResponseEntity.ok(new User());
    }

    @PutMapping("/me")
    public ResponseEntity<User> updateCurrentUser(
            @RequestBody User user
    ) {
        return ResponseEntity.ok(user);
    }

}
