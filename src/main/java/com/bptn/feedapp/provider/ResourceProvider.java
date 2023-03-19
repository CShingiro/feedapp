package com.bptn.feedapp.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import com.bptn.feedapp.provider.factory.YamlPropertySourceFactory;

@Component
@PropertySource(value = "classpath:config.yml", factory = YamlPropertySourceFactory.class)
public class ResourceProvider {

    @Value("${jwt.secret}")
    private String jwtSecret;

    @Value("${jwt.expiration}")
    private long jwtExpiration;

    @Value("${jwt.issuer}")
    private String jwtIssuer;

    @Value("${jwt.audience}")
    private String jwtAudience;

    @Value("${jwt.prefix}")
    private String jwtPrefix;

    @Value("${jwt.excluded.urls}")
    private String[] jwtExcludedUrls;

    @Value("${client.url}")
    private String clientUrl;

    @Value("${client.email.verify.param}")
    private String clientVerifyParam;

    @Value("${client.email.verify.expiration}")
    private long clientVerifyExpiration;

    @Value("${client.email.reset.param}")
    private String clientResetParam;

    @Value("${client.email.reset.expiration}")
    private long clientResetExpiration;

    public String getJwtSecret() {
        return this.jwtSecret;
    }

    public void setJwtSecret(String jwtSecret) {
        this.jwtSecret = jwtSecret;
    }

    public long getJwtExpiration() {
        return this.jwtExpiration;
    }

    public void setJwtExpiration(long jwtExpiration) {
        this.jwtExpiration = jwtExpiration;
    }

    public String getJwtIssuer() {
        return this.jwtIssuer;
    }

    public void setJwtIssuer(String jwtIssuer) {
        this.jwtIssuer = jwtIssuer;
    }

    public String getJwtAudience() {
        return this.jwtAudience;
    }

    public void setJwtAudience(String jwtAudience) {
        this.jwtAudience = jwtAudience;
    }

    public String getJwtPrefix() {
        return this.jwtPrefix;
    }

    public void setJwtPrefix(String jwtPrefix) {
        this.jwtPrefix = jwtPrefix;
    }

    public String[] getJwtExcludedUrls() {
        return this.jwtExcludedUrls;
    }

    public void setJwtExcludedUrls(String[] jwtExcludedUrls) {
        this.jwtExcludedUrls = jwtExcludedUrls;
    }

    public String getClientUrl() {
        return this.clientUrl;
    }

    public void setClientUrl(String clientUrl) {
        this.clientUrl = clientUrl;
    }

    public String getClientVerifyParam() {
        return this.clientVerifyParam;
    }

    public void setClientVerifyParam(String clientVerifyParam) {
        this.clientVerifyParam = clientVerifyParam;
    }

    public long getClientVerifyExpiration() {
        return this.clientVerifyExpiration;
    }

    public void setClientVerifyExpiration(long clientVerifyExpiration) {
        this.clientVerifyExpiration = clientVerifyExpiration;
    }

    public String getClientResetParam() {
        return this.clientResetParam;
    }

    public void setClientResetParam(String clientResetParam) {
        this.clientResetParam = clientResetParam;
    }

    public long getClientResetExpiration() {
        return this.clientResetExpiration;
    }

    public void setClientResetExpiration(long clientResetExpiration) {
        this.clientResetExpiration = clientResetExpiration;
    }

 }
