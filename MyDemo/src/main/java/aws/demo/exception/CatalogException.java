package aws.demo.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CatalogException extends RuntimeException {
	
	public CatalogException(String message) {
		super(message);
	}

}
