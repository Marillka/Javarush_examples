package forkJoin;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
В FJF есть обычный пул потоков. FJ позволяет автоматически jave делить вашу задачу на части и потом по отдельности ее обрабатывать. Например, вы указываете, что у вас есть стрим чисел, они в каком то случайном порядке и вы хотите их отфильтровать.
И можно указать что стрим является параллельным (вы его разбираете в несколько подстримов, они паралельно считаются и потом итоговый результат собирается в один.


 */
public class Main {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,4,6,7,8,2,3,4,5,6,7,3,2,4,5,8,9,0,0)
                .parallel()
                .filter(i -> {
                    System.out.println(Thread.currentThread());
                    return i == 4;
                }).collect(Collectors.toList());

        /*
        Thread[main,5,main]
Thread[main,5,main]
Thread[main,5,main]
Thread[main,5,main]
Thread[main,5,main]
Thread[main,5,main]
Thread[main,5,main]
Thread[main,5,main]
Thread[main,5,main]
Thread[ForkJoinPool.commonPool-worker-2,5,main]
Thread[ForkJoinPool.commonPool-worker-4,5,main]
Thread[ForkJoinPool.commonPool-worker-1,5,main]
Thread[ForkJoinPool.commonPool-worker-1,5,main]
Thread[ForkJoinPool.commonPool-worker-1,5,main]
Thread[ForkJoinPool.commonPool-worker-1,5,main]
Thread[main,5,main]
Thread[ForkJoinPool.commonPool-worker-1,5,main]
Thread[ForkJoinPool.commonPool-worker-5,5,main]
Thread[ForkJoinPool.commonPool-worker-4,5,main]
Thread[ForkJoinPool.commonPool-worker-2,5,main]
Thread[ForkJoinPool.commonPool-worker-3,5,main]
Thread[ForkJoinPool.commonPool-worker-4,5,main]
Thread[main,5,main]
Thread[ForkJoinPool.commonPool-worker-7,5,main]
         */
    }
}
