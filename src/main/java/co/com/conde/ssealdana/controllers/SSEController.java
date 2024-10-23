package co.com.conde.ssealdana.controllers;

import co.com.conde.ssealdana.services.SSEService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
public class SSEController {

    private final SSEService sseService;

    public SSEController(SSEService sseService) {
        this.sseService = sseService;
    }

    @GetMapping(value = "/sse", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public SseEmitter subscribe() {
        SseEmitter emitter = new SseEmitter(Long.MAX_VALUE);
        sseService.addEmitter(emitter);
        return emitter;
    }
}
