package day13_practice_tasks.state_task;

public class State {
    private String name;
    private String abbreviation;
    private String politicalParty;
    private String governor;
    private String senator;
    private int population ;

    public State(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.isEmpty()||name.isBlank()){
            throw new RuntimeException(" name can not be null or empty or Blank ");
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if(abbreviation==null || abbreviation.isEmpty()||abbreviation.isBlank()){
            throw new RuntimeException(" Abbreviation can not be null or empty or Blank ");
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if(politicalParty==null || politicalParty.isEmpty()||politicalParty.isBlank()){
            throw new RuntimeException(" PoliticalParty can not be null or empty or Blank ");
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if(governor==null || governor.isEmpty()||governor.isBlank()){
            throw new RuntimeException(" Governor can not be null or empty or Blank ");
        }
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if(senator==null || governor.isEmpty()||senator.isBlank()){
            throw new RuntimeException("Senator can not be null or empty or Blank ");
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if(population<0){
            throw new RuntimeException("Population must be greater than Zero "+population);
        }
        this.population = population;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}
