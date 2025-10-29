package solid_principle;


class MySQL{
    void connect(){};
}

interface Database{
    void connect();
}

class MysqlDb implements Database {

    @Override
    public void connect() {

    }
}

class MongoDb implements Database{

    @Override
    public void connect() {

    }
}
class App{
    Database db;
    App(Database db){
        this.db = db;
    }

    public static void main(String[] args) {
    MySQL mySQL = new MySQL();
    mySQL.connect();// tightly coupled only mysql db can we connected

     // Dependency injection
//     App app = new App(newMongoDb());
        App app = new App(new MysqlDb());
    }
}

public class DependencyInjection {
    public static void main(String[] args) {

    }
}

// High level module should not depend on low level module, they should depend on interface