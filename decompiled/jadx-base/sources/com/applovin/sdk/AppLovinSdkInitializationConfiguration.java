package com.applovin.sdk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AppLovinSdkInitializationConfiguration {

    public interface Builder {
        com.applovin.sdk.AppLovinSdkInitializationConfiguration build();

        java.util.List<java.lang.String> getAdUnitIds();

        java.lang.String getMediationProvider();

        java.lang.String getPluginVersion();

        java.lang.String getSdkKey();

        com.applovin.mediation.MaxSegmentCollection getSegmentCollection();

        java.util.List<java.lang.String> getTestDeviceAdvertisingIds();

        boolean isExceptionHandlerEnabled();

        com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder setAdUnitIds(java.util.List<java.lang.String> list);

        com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder setExceptionHandlerEnabled(boolean z);

        com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder setMediationProvider(java.lang.String str);

        com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder setPluginVersion(java.lang.String str);

        com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder setSegmentCollection(com.applovin.mediation.MaxSegmentCollection maxSegmentCollection);

        com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder setTestDeviceAdvertisingIds(java.util.List<java.lang.String> list);
    }

    public static com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder builder(java.lang.String str, android.content.Context context) {
        return new com.applovin.impl.sdk.AppLovinSdkInitializationConfigurationImpl.BuilderImpl(str, context);
    }

    public abstract java.util.List<java.lang.String> getAdUnitIds();

    public abstract java.lang.String getMediationProvider();

    public abstract java.lang.String getPluginVersion();

    public abstract java.lang.String getSdkKey();

    public abstract com.applovin.mediation.MaxSegmentCollection getSegmentCollection();

    public abstract java.util.List<java.lang.String> getTestDeviceAdvertisingIds();

    public abstract boolean isExceptionHandlerEnabled();
}
