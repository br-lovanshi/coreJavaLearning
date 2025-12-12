package collections.Nov03Revision.desingPatterns.creational;

public final class Singleton {
    private static Singleton connection;
    private final String name;
    private final String port;

    private Singleton(String name, String port) {
        this.name = name;
        this.port = port;
    }

    public static Singleton getConnection() {
        synchronized (Singleton.class) {
            if (connection == null) {
                connection = new Singleton("SQL", "3361");
            }
            return connection;
        }
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getConnection();
        System.out.println(singleton.name);
    }

    public static class Logger {

        private Logger(){};

        private static class Log{
            private static final Logger LOG = new Logger();
        }

        public static Logger getLogger(){
            return Log.LOG;
        }
    }

    static class UseLog{
        public static void main(String[] args) {
            Logger log = Logger.getLogger();
            Logger log1 = Logger.getLogger();
            System.out.println(log);
        }
    }
}

// make a class final
// all data field private final
// make constructor private
// make a filed private static to get the singleton obj
// make a public static method getConnection();
