package шаблоны_поведенческие_behavioral.Observer_Listener_Наблюдатель_Слушатель.ex2;

interface Observable {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
