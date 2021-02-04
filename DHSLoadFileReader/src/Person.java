public class Person {
    private String dataLine;
    private String mbiNumber;
    private String healthRulesNumber;
    private String amisysNumber;
    private String caseNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    private String firstName;
    private String lastName;
    private String middleName;

    public String getTuplNumber() {
        return tuplNumber;
    }

    public void setTuplNumber(String tuplNumber) {
        this.tuplNumber = tuplNumber;
    }

    private String tuplNumber;

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }
    public String getDataLine() {
        return dataLine;
    }

    public void setDataLine(String dataLine) {
        this.dataLine = dataLine;
    }

    public String getMbiNumber() {
        return mbiNumber;
    }

    public void setMbiNumber(String mbiNumber) {
        this.mbiNumber = mbiNumber;
    }

    public String getHealthRulesNumber() {
        return healthRulesNumber;
    }

    public void setHealthRulesNumber(String healthRulesNumber) {
        this.healthRulesNumber = healthRulesNumber;
    }

    public String getAmisysNumber() {
        return amisysNumber;
    }

    public void setAmisysNumber(String amisysNumber) {
        this.amisysNumber = amisysNumber;
    }

    public HealthPlan getHealthPlan() {
        return healthPlan;
    }

    public void setHealthPlan(HealthPlan healthPlan) {
        this.healthPlan = healthPlan;
    }

    public String getPmiNumber() {
        return pmiNumber;
    }

    public void setPmiNumber(String pmiNumber) {
        this.pmiNumber = pmiNumber;
    }

    private String pmiNumber;

    private HealthPlan healthPlan;

    public static String rightTrim(String word) {
        return word.replaceAll("\\s+$", "");
    };

    public Person(String line) {
        setHealthRulesNumber(line.substring(15,34));
        setAmisysNumber(rightTrim(line.substring(35,45)));
        setPmiNumber(rightTrim(line.substring(7,14)));
        setCaseNumber(rightTrim(line.substring(237,245)));
        setTuplNumber(rightTrim(line.substring(245,264)));
        setMbiNumber(rightTrim(line.substring(46,57)));

        setFirstName(rightTrim(line.substring(118,152)));
        setLastName(rightTrim(line.substring(58,117)));
        setMiddleName(rightTrim(line.substring(153,177)));

        healthPlan = new HealthPlan(line);

    }
}
