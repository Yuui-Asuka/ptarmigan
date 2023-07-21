package com.ptarmigan.payment.domain;

public class VisaPay {

    private Long id;
    private String cardNumber;
    private String cardHolderName;
    private Integer expirationMonth;
    private Integer expirationYear;
    private String cvv;


    // 构造方法
    public VisaPay(Long id, String cardNumber, String cardHolderName, Integer expirationMonth, Integer expirationYear, String cvv) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.cvv = cvv;
    }

    // Getter和Setter方法

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public int getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(Integer expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(Integer expirationYear) {
        this.expirationYear = expirationYear;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    // 其他方法
    public void processPayment(double amount) {
        // 实现Visa支付的逻辑，处理支付金额
        System.out.println("Processing Visa payment of amount: " + amount);
        // 具体的支付处理逻辑...
    }


    @Override
    public String toString() {
        return "VisaPay{" +
                "cardNumber='" + cardNumber + '\'' +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", expirationMonth=" + expirationMonth +
                ", expirationYear=" + expirationYear +
                ", cvv='" + cvv + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VisaPay visaPay = (VisaPay) obj;
        return cardNumber.equals(visaPay.cardNumber) &&
                cardHolderName.equals(visaPay.cardHolderName) &&
                expirationMonth == visaPay.expirationMonth &&
                expirationYear == visaPay.expirationYear &&
                cvv.equals(visaPay.cvv);
    }


}
