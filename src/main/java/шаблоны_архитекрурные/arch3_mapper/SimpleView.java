package шаблоны_архитекрурные.arch3_mapper;

import lombok.Data;
import lombok.NoArgsConstructor;

// ApiModel
@Data
@NoArgsConstructor
public class SimpleView {

    // JsonValue
    private Long id;
    // JsonValue
    private String name;
    // JsonValue
    private String property;
}
