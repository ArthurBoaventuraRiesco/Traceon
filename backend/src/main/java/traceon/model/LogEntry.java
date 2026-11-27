package traceon.model;

import java.time.LocalDateTime;

public record LogEntry(
        LocalDateTime timestamp,
        LogLevel level,
        String message
) {
}