package dev.horbatiuk.streamlineapi.security;

import dev.horbatiuk.streamlineapi.persistance.entities.User;
import dev.horbatiuk.streamlineapi.persistance.enums.UserRole;
import dev.horbatiuk.streamlineapi.persistance.enums.UserStatus;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.stream.Collectors;

public record CustomUserDetails(User user) implements UserDetails {

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return user.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.name()))
                .collect(Collectors.toSet());
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getEmail();
    }

    public String getDisplayName() {
        return user.getName();
    }

    public boolean isActive() {
        return user.getStatus() == UserStatus.ACTIVE;
    }

    public boolean isInactive() {
        return user.getStatus() == UserStatus.INACTIVE;
    }

    public boolean isBlocked() {
        return user.getStatus() == UserStatus.BLOCKED;
    }

    public boolean isAdmin() {
        return user.getRoles().contains(UserRole.ADMINISTRATOR);
    }

    public  boolean isSuperAdmin(UserRole role) {
        return user.getRoles().contains(UserRole.SUPER_ADMINISTRATOR);
    }
}
