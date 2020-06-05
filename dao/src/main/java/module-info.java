open module dao {

    requires spring.data.jpa;
    requires spring.context;
    requires entityModule;
    requires spring.boot.autoconfigure;
    exports com.jatin.dao;
    exports com.jatin;
}