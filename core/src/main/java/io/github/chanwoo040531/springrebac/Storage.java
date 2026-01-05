package io.github.chanwoo040531.springrebac;

public interface Storage {

    void initialize();

    void save(RelationTuple tuple);

    RelationTuple load();

    void delete(RelationTuple tuple);

}
