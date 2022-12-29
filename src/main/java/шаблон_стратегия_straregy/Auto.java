package шаблон_стратегия_straregy;

/*
Мы выделили интересующее нас семейство алгоритмов (виды заправки машин) в отдельных интерфейс с несколькими реализациями. Мы отделили их от самой сущности автомобиля. Поэтому теперь, если нам понадобится внести какие-то изменения в тот или иной процесс заправки, это никак не затронет наши классы машин.
 */

public class Auto {
    FillStrategy fillStrategy;

    public Auto(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }

    public void gas() {
        System.out.println("Едем вперед");
    }

    public void stop() {
        System.out.println("Тормозим!");
    }

    public void setFillStrategy(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }


}
