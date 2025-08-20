package dev.horbatiuk.streamlineapi.persistance.enums;

/**
 * Enum to classify an authentication type.
 * <p>
 * The application allows a user to authorize by:
 * <ul>
 *   <li>LOCAL: Email & Password</li>
 *   <li>GOOGLE: Google account</li>
 *   <li>FACEBOOK: Facebook account</li>
 * </ul>
 */
public enum AuthProvider {
    LOCAL,
    GOOGLE,
    FACEBOOK
}
