package шаблоны_архитекрурные.arch3_mapper;

public class SimpleMapper {

    public SimpleDomainModel mapViewToDomainModel(SimpleView view) {
        return SimpleDomainModel.builder()
                .id(view.getId())
                .name(view.getName())
                .property(Property.valueOf(view.getProperty()))
                .build();
    }


}
