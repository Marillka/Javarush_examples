package шаблоны_поведенческие_behavioral.Strategy.ex2;

public class DownloadLinuxStrategy implements  Strategy{
    @Override
    public void download(String file) {
        System.out.println("linux download: " + file);
    }
}
