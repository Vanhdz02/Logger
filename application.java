public class application {
    public static void main(String[] args) {
        logger log = logger.getInstance();
        log.debug("This is a debug message");
        log.info("This is an info message");
        log.error("This is an error message");
    }
}