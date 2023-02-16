package ArcticWabbit.Project1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerMessageController {
	@GetMapping("/messages")
	public String getMessage() {
		return "Why does eclipse & docker refuse to work!";
	}
}
