package com.majul.sap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SapConfiguration {

    @Value("${jco.client.lang}")
    private String lang;
    @Value("${jco.client.client}")
    private String client;
    @Value("${jco.client.passwd}")
    private String passwd;
    @Value("${jco.client.user}")
    private String user;
    @Value("${jco.client.sysnr}")
    private String sysnr;
    @Value("${jco.client.ashost}")
    private String ashost;
    @Value("${jco.destination.peak_limit}")
    private String peakLimit;
    @Value("${jco.destination.pool_capacity}")
    private String poolCapacity;

    public SapConfiguration() {
    }

    public String getLang() {

        return lang;
    }

    public void setLang(
            String lang) {

        this.lang = lang;
    }

    public String getClient() {

        return client;
    }

    public void setClient(
            String client) {

        this.client = client;
    }

    public String getPasswd() {

        return passwd;
    }

    public void setPasswd(
            String passwd) {

        this.passwd = passwd;
    }

    public String getUser() {

        return user;
    }

    public void setUser(
            String user) {

        this.user = user;
    }

    public String getSysnr() {

        return sysnr;
    }

    public void setSysnr(
            String sysnr) {

        this.sysnr = sysnr;
    }

    public String getAshost() {

        return ashost;
    }

    public void setAshost(
            String ashost) {

        this.ashost = ashost;
    }

    public String getPeakLimit() {

        return peakLimit;
    }

    public void setPeakLimit(
            String peakLimit) {

        this.peakLimit = peakLimit;
    }

    public String getPoolCapacity() {

        return poolCapacity;
    }

    public void setPoolCapacity(
            String poolCapacity) {

        this.poolCapacity = poolCapacity;
    }

}
