package ArcticWabbit.Project1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerProductController {
	@GetMapping("/products")
	public String getMessage() {
		return "A new thing";
	}
}
