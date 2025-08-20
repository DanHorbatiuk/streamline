package dev.horbatiuk.streamlineapi.persistance.enums;

/**
 * Enum to classify roles for users.
 * <p>
 * Each role has different access:
 * <ul>
 *     <li>USER: basic functionality</li>
 *     <li>ADMINISTRATOR: all USER permissions plus ability to basic admin functions</li>
 *     <li>SUPER_ADMINISTRATOR: full application access, including role and system administration</li>
 * </ul>
 */
public enum UserRole {
    USER,
    ADMINISTRATOR,
    SUPER_ADMINISTRATOR,
}
