open module dao {

    requires spring.data.jpa;
    requires spring.context;
    requires spring.beans;
    requires spring.core;
    requires java.persistence;
    requires spring.jdbc;
    requires java.sql;
    requires org.postgresql.jdbc;
    requires entityModule;
    requires spring.boot.autoconfigure;
    exports com.jatin.dao;
    exports com.jatin;
}