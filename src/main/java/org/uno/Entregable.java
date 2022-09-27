package org.uno;

public interface Entregable extends Comparable {
    void entregar();

    void devolver();

    boolean isEntregado();
}
