package io.github.chanwoo040531.springrebac;

/**
 * Factory for creating validated relation tuples.
 */
public final class RelationTupleFactory {

    private RelationTupleFactory() {
    }

    public static RelationTuple create(ResourceRef resource, Relation relation, SubjectRef subject) {
        if (resource == null) {
            throw new IllegalArgumentException("resource is required");
        }
        if (relation == null) {
            throw new IllegalArgumentException("relation is required");
        }
        if (subject == null) {
            throw new IllegalArgumentException("subject is required");
        }
        requireText(resource.type(), "resourceType");
        requireText(resource.id(), "resourceId");
        requireText(relation.name(), "relation");
        requireText(subject.type(), "subjectType");
        requireText(subject.id(), "subjectId");
        return new DefaultRelationTuple(resource, relation, subject);
    }

    private static void requireText(String value, String name) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(name + " is required");
        }
    }

}
