package Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class SpyTest {
    @Test
    public void test1() {
        List<String> mockList = Mockito.spy(new ArrayList<>());
        // эти методы работать будут
        mockList.add("one");
        mockList.add("two");

    }

    @Spy
    List mockList = new ArrayList<String>();

    @Test
    public void test2() {
        // эти методы работать будут
        mockList.add("one");
        mockList.add("two");
    }


}
