public class PassengerInfo {
    private String name;
    private String secondName;
    private int numberPass;

    public PassengerInfo(String name, String secondName, int numberPass) {
        this.name = name;
        this.secondName = secondName;
        this.numberPass = numberPass;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getNumberPass() {
        return numberPass;
    }

    @Override
    public String toString() {
        return "PassengerInfo{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", numberPass=" + numberPass +
                '}';
    }
}
