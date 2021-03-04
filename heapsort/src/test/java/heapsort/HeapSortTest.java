package heapsort;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HeapSortTest {

    HeapSort heapsort = new HeapSort();

    @Test
    public void sortComUnicoElemento() {
        int vetor[] = new int[1];
        vetor[0] = 10;
        heapsort.sort(vetor);
        assertEquals(vetor[0], 10);
    }

    @Test
    public void sortComDoisElementos() {
        int vetor[] = new int[2];
        vetor[0] = 10;
        vetor[1] = 5;
        heapsort.sort(vetor);
        assertEquals(vetor[0], 5);
        assertEquals(vetor[1], 10);
    }

    @Test
    public void sortComElementosNegativos() {
        int vetor[] = new int[6];
        vetor[0] = 10;
        vetor[1] = 5;
        vetor[2] = -9;
        vetor[3] = 0;
        vetor[4] = -5;
        vetor[5] = 4;
        heapsort.sort(vetor);
        assertEquals(vetor[0], -9);
        assertEquals(vetor[1], -5);
        assertEquals(vetor[2], 0);
        assertEquals(vetor[3], 4);
        assertEquals(vetor[4], 5);
        assertEquals(vetor[5], 10);
    }

    @Test
    public void sortComMultiplosElementos() {
        int vetor[] = new int[10];
        vetor[0] = 10;
        vetor[1] = 5;
        vetor[2] = 23;
        vetor[3] = 34;
        vetor[4] = 100;
        vetor[5] = 2;
        vetor[6] = 2;
        vetor[7] = 4;
        vetor[8] = 1;
        vetor[9] = 12;
        heapsort.sort(vetor);
        assertEquals(vetor[0], 1);
        assertEquals(vetor[1], 2);
        assertEquals(vetor[2], 2);
        assertEquals(vetor[3], 4);
        assertEquals(vetor[4], 5);
        assertEquals(vetor[5], 10);
        assertEquals(vetor[6], 12);
        assertEquals(vetor[7], 23);
        assertEquals(vetor[8], 34);
        assertEquals(vetor[9], 100);
    }

}
