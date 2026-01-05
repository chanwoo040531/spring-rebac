package io.github.chanwoo040531.springrebac;


public interface PermissionEngine {

    boolean checkPermission();

    void createRelation();

    void touchRelation();

    void deleteRelation();

}
