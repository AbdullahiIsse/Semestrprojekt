package Teammedlem;

public class Teammedlem
{
  private String Fornavn,Efternavn,Rolle;
  private int Telefonnummer,TeammedlemId;

  public Teammedlem(String fornavn, String efternavn, String rolle, int telefonnummer, int teammedlemId) {
    Fornavn = fornavn;
    Efternavn = efternavn;
    Rolle = rolle;
    Telefonnummer = telefonnummer;
    TeammedlemId = teammedlemId;
  }

  public String getFornavn() {
    return Fornavn;
  }

  public void setFornavn(String fornavn) {
    Fornavn = fornavn;
  }

  public String getEfternavn() {
    return Efternavn;
  }

  public void setEfternavn(String efternavn) {
    Efternavn = efternavn;
  }

  public String getRolle() {
    return Rolle;
  }

  public void setRolle(String rolle) {
    Rolle = rolle;
  }

  public int getTelefonnummer() {
    return Telefonnummer;
  }

  public void setTelefonnummer(int telefonnummer) {
    Telefonnummer = telefonnummer;
  }

  public int getTeammedlemId() {
    return TeammedlemId;
  }

  public void setTeammedlemId(int teammedlemId) {
    TeammedlemId = teammedlemId;
  }

  @Override
  public String toString() {
    return "Teammedlem{" +
            "Fornavn='" + Fornavn + '\'' +
            ", Efternavn='" + Efternavn + '\'' +
            ", Rolle='" + Rolle + '\'' +
            ", Telefonnummer=" + Telefonnummer +
            ", TeammedlemId=" + TeammedlemId +
            '}';
  }
  public String toxmll(){
    return "<Teamedlem><fornavn>" + Fornavn + "</fornavn>" + "<efternavn>"+ Efternavn + "</efternavn>" + "<Rolle>" + Rolle + "</rolle>" + "<Telefonnummer>" + Telefonnummer + "</Telefonnummer>" + "<Teammedlemid>" + TeammedlemId + "</tea>";

  }
}