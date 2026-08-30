package com.applovin.mediation.adapter.parameters;

/* JADX INFO: loaded from: classes3.dex */
public interface MaxAdapterParameters {
    java.lang.String getAdUnitId();

    java.lang.String getConsentString();

    android.os.Bundle getCustomParameters();

    java.util.Map<java.lang.String, java.lang.Object> getLocalExtraParameters();

    android.os.Bundle getServerParameters();

    java.lang.Boolean hasUserConsent();

    @java.lang.Deprecated
    java.lang.Boolean isAgeRestrictedUser();

    java.lang.Boolean isDoNotSell();

    boolean isTesting();
}
