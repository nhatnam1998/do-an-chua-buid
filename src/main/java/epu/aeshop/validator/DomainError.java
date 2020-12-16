package epu.aeshop.validator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DomainError {
    private String field;
    private String message;
}
