package database.modelsDB;

/**
 * Class with the description of the Program
 */
public class ProgramDB {
    private String name;
    private String version;

    /**
     *
     * @param name program's name
     * @param version program's version
     */
    public ProgramDB(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }
    public String getVersion() {
        return version;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}