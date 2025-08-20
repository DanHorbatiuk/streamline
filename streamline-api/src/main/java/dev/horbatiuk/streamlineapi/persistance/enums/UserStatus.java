package dev.horbatiuk.streamlineapi.persistance.enums;

/**
 * Enum to block or limit some user operations.
 * <p>
 * Each status imposes different limitations:
 * <ul>
 *     <li>ACTIVE: no limitations</li>
 *     <li>INACTIVE: limited access to default functions</li>
 *     <li>BLOCKED: account entry is restricted</li>
 * </ul>
 */
public enum UserStatus {
    ACTIVE,
    INACTIVE,
    BLOCKED
}
