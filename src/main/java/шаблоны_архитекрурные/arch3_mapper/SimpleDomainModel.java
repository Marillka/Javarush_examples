package шаблоны_архитекрурные.arch3_mapper;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SimpleDomainModel {
    private Long id;
    private String name;
    private Property property;
}
