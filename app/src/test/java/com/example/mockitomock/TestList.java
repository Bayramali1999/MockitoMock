package com.example.mockitomock;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.LinkedList;
import java.util.List;

import static android.opengl.ETC1.isValid;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestList {

    private boolean valid;

    @Test
    public void mockList() {
        List l = mock(List.class);

        l.add("a");
        l.clear();


        verify(l).add("a");
        verify(l).clear();
    }

    @Ignore("ldvcofvkf")
    @Test(expected = RuntimeException.class)
                public void mockLinkedList() {
        LinkedList linkedList = mock(LinkedList.class);

        when(linkedList.get(0)).thenReturn("first");
        when(linkedList.get(2)).thenThrow(new RuntimeException());

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(2));

        verify(linkedList).get(2);
    }


    @Test
    public void testAnyInt() {
        List list = mock(List.class);
        when(list.get(anyInt())).thenReturn("elementz");

//        verify(list.contains/).thenReturn(true);
//        verify(list).add(argThat(someString ->
//        ((String) someString).length() > 7));

    }

    public boolean isValid() {
        return valid;
    }
}
