package dev.horbatiuk.streamlineapi.persistance;

import dev.horbatiuk.streamlineapi.persistance.entities.Device;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeviceRepository extends JpaRepository<Device, UUID> {
}
