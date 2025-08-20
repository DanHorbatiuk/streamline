package dev.horbatiuk.streamlineapi.persistance;

import dev.horbatiuk.streamlineapi.persistance.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
