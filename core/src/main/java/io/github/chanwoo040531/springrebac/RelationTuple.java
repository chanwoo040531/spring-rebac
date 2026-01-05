package io.github.chanwoo040531.springrebac;

/**
 * Relation tuple for ReBAC: resource (type + id), relation, subject (type + id).
 */
public record RelationTuple(
        String resourceType,
        String resourceId,
        String relation,
        String subjectType,
        String subjectId
) {
    public RelationTuple {
        if (isBlank(resourceType)) {
            throw new IllegalArgumentException("resourceType is required");
        }
        if (isBlank(resourceId)) {
            throw new IllegalArgumentException("resourceId is required");
        }
        if (isBlank(relation)) {
            throw new IllegalArgumentException("relation is required");
        }
        if (isBlank(subjectType)) {
            throw new IllegalArgumentException("subjectType is required");
        }
        if (isBlank(subjectId)) {
            throw new IllegalArgumentException("subjectId is required");
        }
    }

    private static boolean isBlank(String value) {
        return value == null || value.isBlank();
    }
}
