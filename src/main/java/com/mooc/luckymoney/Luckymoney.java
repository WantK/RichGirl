package com.mooc.luckymoney;

import com.sun.javafx.beans.IDProperty;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
@Entity
public class Luckymoney {
    @Id
    @GeneratedValue
    private Integer id;
    private BigDecimal money;
    private String producer;//红包的发送方
    private String consumer;//红包的接受方

    public Luckymoney() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    public Integer getId() {
        return id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public String getProducer() {
        return producer;
    }

    public String getConsumer() {
        return consumer;
    }
}
