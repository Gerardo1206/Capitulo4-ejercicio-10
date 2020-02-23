package ejercicio.pkg10;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class CertificateOfDeposit {
    private Integer certificateNumber;
    private String accountHoldersLastName;
    private Double balance;
    private GregorianCalendar issueDate;
    private GregorianCalendar maturityDate;

    public CertificateOfDeposit(Integer certificateNumber, String accountHoldersLastName, Double balance, GregorianCalendar issueDate) {
        this.certificateNumber = certificateNumber;
        this.accountHoldersLastName = accountHoldersLastName;
        this.balance = balance;
        this.issueDate= (GregorianCalendar) GregorianCalendar.getInstance();
        this.issueDate = issueDate;
        this.maturityDate=(GregorianCalendar) GregorianCalendar.getInstance();
        this.maturityDate=(GregorianCalendar) issueDate.clone();
        maturityDate.add(Calendar.YEAR, 1);
    }

    public void setCertificateNumber(Integer certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public void setAccountHoldersLastName(String accountHoldersLastName) {
        this.accountHoldersLastName = accountHoldersLastName;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setIssueDate(GregorianCalendar issueDate) {
        this.issueDate = issueDate;
    }

    public void setMaturityDate(GregorianCalendar maturityDate) {
        this.maturityDate = maturityDate;
    }
    
    public Integer getCertificateNumber() {
        return certificateNumber;
    }

    public String getAccountHoldersLastName() {
        return accountHoldersLastName;
    }

    public Double getBalance() {
        return balance;
    }

    public GregorianCalendar getIssueDate() {
        return issueDate;
    }

    public GregorianCalendar getMaturityDate() {
        return maturityDate;
    }

    @Override
    public String toString() {
        return "CertificateOfDeposit:" + "\n certificateNumber=" + certificateNumber + "\n accountHoldersLastName=" + accountHoldersLastName + "\n balance=" + balance + "\n issueDate = " + issueDate.get(Calendar.DATE)+"/"+(issueDate.get(Calendar.MONTH)+1)+"/"+issueDate.get(Calendar.YEAR)+ "\n maturityDate = " + maturityDate.get(Calendar.DATE)+"/"+(maturityDate.get(Calendar.MONTH)+1)+"/" +maturityDate.get(Calendar.YEAR);
    }

}
