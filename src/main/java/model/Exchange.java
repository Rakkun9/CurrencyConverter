package model;

public class Exchange {
    private String exchange;
    private String value;


    //Erase value if is necessary in the course of the project
    public Exchange(String exchange, String value) {
        this.exchange = exchange;
        this.value = value;
    }
    public Exchange(){

    }

    public Exchange (ExchangeOmdb exchangeOmdb) {
        this.exchange = exchangeOmdb.base_code();
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Exchange{" +
                "exchange='" + exchange + '\'' +
                ", value=" + value +
                '}';
    }
}
