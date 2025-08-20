package dev.horbatiuk.streamlineloggingservice.mongo;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EnableMongoAuditing
@Document(collection = "device_logs")
public class DeviceLog {

    @Id
    private String id;

    /** Human-readable ID, format: [TYPE]-[YYYYMMDD]-[SEQ]-[RAND] */
    private String deviceId;

    /** When event happens on device */
    private Instant timestamp;

    /** When document was saved in DB */
    @CreatedDate
    private Instant logCreatedAt;

    /** LogLevel: TRACE, DEBUG, INFO, WARN, ERROR, FATAL, OFF */
    private String level;

    private String message;

    private String deviceType;

    private String firmwareVersion;

    /** Contains additional data about event which is unique for each device */
    private Map<String, Object> payload;
}

