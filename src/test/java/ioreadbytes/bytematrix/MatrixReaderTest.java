package ioreadbytes.bytematrix;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixReaderTest {

    MatrixReader matrixReader = new MatrixReader();

    @Test
    public void readBytesAndCreateMatrixTest() {
        assertEquals(0, matrixReader.getMyMatrix().size());
        matrixReader.readBytesAndCreateMatrix("matrix.dat");
        assertEquals(10, matrixReader.getMyMatrix().size());
        assertEquals(1000, matrixReader.getMyMatrix().get(5).length);
    }

    @Test
    public void numberOfColumnsWhereMoreZeros() {
        matrixReader.readBytesAndCreateMatrix("matrix.dat");
        assertEquals(492, matrixReader.numberOfColumnsWhereMoreZeros());
    }
}