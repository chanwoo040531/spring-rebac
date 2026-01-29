package io.github.chanwoo040531.springrebac;

/**
 * Relation tuple for ReBAC: resource, relation, subject.
 */
public interface RelationTuple {

    ResourceRef resource();

    Relation relation();

    SubjectRef subject();
}
