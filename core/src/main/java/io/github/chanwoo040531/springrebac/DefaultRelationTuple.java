package io.github.chanwoo040531.springrebac;

public record DefaultRelationTuple(
	ResourceRef resource,
	Relation relation,
	SubjectRef subject
) implements RelationTuple {
}