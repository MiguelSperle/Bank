package interfaces;

public interface Account {
    public void setName(String name);
    public void currentBalance(String numberAccount);
    public void drawBalance(double value);
    public void depositBalance(double value);
}
