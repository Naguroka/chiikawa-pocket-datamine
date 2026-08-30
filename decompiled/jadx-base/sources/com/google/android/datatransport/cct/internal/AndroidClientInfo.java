package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AndroidClientInfo {

    public static abstract class Builder {
        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo build();

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setApplicationBuild(java.lang.String str);

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setCountry(java.lang.String str);

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setDevice(java.lang.String str);

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setFingerprint(java.lang.String str);

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setHardware(java.lang.String str);

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setLocale(java.lang.String str);

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setManufacturer(java.lang.String str);

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setMccMnc(java.lang.String str);

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setModel(java.lang.String str);

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setOsBuild(java.lang.String str);

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setProduct(java.lang.String str);

        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setSdkVersion(java.lang.Integer num);
    }

    public abstract java.lang.String getApplicationBuild();

    public abstract java.lang.String getCountry();

    public abstract java.lang.String getDevice();

    public abstract java.lang.String getFingerprint();

    public abstract java.lang.String getHardware();

    public abstract java.lang.String getLocale();

    public abstract java.lang.String getManufacturer();

    public abstract java.lang.String getMccMnc();

    public abstract java.lang.String getModel();

    public abstract java.lang.String getOsBuild();

    public abstract java.lang.String getProduct();

    public abstract java.lang.Integer getSdkVersion();

    public static com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder builder() {
        return new com.google.android.datatransport.cct.internal.AutoValue_AndroidClientInfo.Builder();
    }
}
