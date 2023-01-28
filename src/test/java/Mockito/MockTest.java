package Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class MockTest {

    @Mock
    List mockList;

    @Test
    public void test1()  {
        List mockList = Mockito.mock(ArrayList.class);
        // эти методы ничего не будут делать - это заглушки
        mockList.add("one");
        mockList.add("two");
    }

    @Test
    public void test2() {
        mockList.add("one");
        mockList.add("two");
    }


}
