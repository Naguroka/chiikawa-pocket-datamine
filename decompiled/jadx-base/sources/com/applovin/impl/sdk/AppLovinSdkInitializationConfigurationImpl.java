package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinSdkInitializationConfigurationImpl extends com.applovin.sdk.AppLovinSdkInitializationConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f1267a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final com.applovin.mediation.MaxSegmentCollection d;
    private final java.util.List e;
    private final java.util.List f;
    private final boolean g;

    public static class BuilderImpl implements com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f1268a;
        private java.lang.String b;
        private java.lang.String c;
        private com.applovin.mediation.MaxSegmentCollection d;
        private java.util.List e = java.util.Collections.emptyList();
        private java.util.List f = java.util.Collections.emptyList();
        private boolean g = true;

        public BuilderImpl(java.lang.String str, android.content.Context context) {
            this.f1268a = str;
            com.applovin.impl.sdk.n.e("AppLovinSdkInitializationConfiguration", "Initializing with key: " + str);
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public com.applovin.sdk.AppLovinSdkInitializationConfiguration build() {
            return new com.applovin.impl.sdk.AppLovinSdkInitializationConfigurationImpl(this);
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public java.util.List<java.lang.String> getAdUnitIds() {
            return this.f;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public java.lang.String getMediationProvider() {
            return this.b;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public java.lang.String getPluginVersion() {
            return this.c;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public java.lang.String getSdkKey() {
            return this.f1268a;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public com.applovin.mediation.MaxSegmentCollection getSegmentCollection() {
            return this.d;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public java.util.List<java.lang.String> getTestDeviceAdvertisingIds() {
            return this.e;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public boolean isExceptionHandlerEnabled() {
            return this.g;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder setAdUnitIds(java.util.List<java.lang.String> list) {
            com.applovin.impl.sdk.n.e("AppLovinSdkInitializationConfiguration", "setAdUnitIds(adUnitIds=" + list + ")");
            if (list == null) {
                return this;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (java.lang.String str : list) {
                if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str) && str.length() > 0) {
                    if (str.length() == 16) {
                        arrayList.add(str);
                    } else {
                        com.applovin.impl.sdk.n.h("AppLovinSdkInitializationConfiguration", "Unable to set initialization ad unit id (" + str + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                    }
                }
            }
            this.f = arrayList;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder setExceptionHandlerEnabled(boolean z) {
            com.applovin.impl.sdk.n.e("AppLovinSdkInitializationConfiguration", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z + ")");
            this.g = z;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder setMediationProvider(java.lang.String str) {
            com.applovin.impl.sdk.n.e("AppLovinSdkInitializationConfiguration", "setMediationProvider(mediationProvider=" + str + ")");
            if (str == null || (!str.isEmpty() && str.length() <= 64 && com.applovin.impl.sdk.utils.StringUtils.isAlphaNumeric(str))) {
                this.b = str;
                return this;
            }
            com.applovin.impl.sdk.n.h("AppLovinSdkInitializationConfiguration", "Mediation provider set to invalid value: " + str + ". Please use a valid mediation provider (e.g., AppLovinMediationProvider.MAX)");
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder setPluginVersion(java.lang.String str) {
            com.applovin.impl.sdk.n.e("AppLovinSdkInitializationConfiguration", "setPluginVersion(pluginVersion=" + str + ")");
            this.c = str;
            return this;
        }

        public com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder setSdkKey(java.lang.String str) {
            this.f1268a = str;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder setSegmentCollection(com.applovin.mediation.MaxSegmentCollection maxSegmentCollection) {
            com.applovin.impl.sdk.n.e("AppLovinSdkInitializationConfiguration", "setSegmentCollection(segmentCollection=" + maxSegmentCollection + ")");
            this.d = maxSegmentCollection;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder setTestDeviceAdvertisingIds(java.util.List<java.lang.String> list) {
            com.applovin.impl.sdk.n.e("AppLovinSdkInitializationConfiguration", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + ")");
            if (list == null) {
                return this;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (java.lang.String str : list) {
                if (str == null || str.length() != 36) {
                    com.applovin.impl.sdk.n.h("AppLovinSdkInitializationConfiguration", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
                } else {
                    arrayList.add(str);
                }
            }
            this.e = arrayList;
            return this;
        }

        public java.lang.String toString() {
            return "AppLovinSdkInitializationConfiguration.Builder{ sdkKey=" + this.f1268a + "mediationProvider=" + this.b + "pluginVersion=" + this.c + "testDeviceAdvertisingIdentifiers=" + this.e + "adUnitIdentifiers=" + this.f + "isExceptionHandlerEnabled=" + this.g + "segmentCollection=" + this.d + "}";
        }
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public java.util.List<java.lang.String> getAdUnitIds() {
        return this.f;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public java.lang.String getMediationProvider() {
        return this.b;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public java.lang.String getPluginVersion() {
        return this.c;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public java.lang.String getSdkKey() {
        return this.f1267a;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public com.applovin.mediation.MaxSegmentCollection getSegmentCollection() {
        return this.d;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public java.util.List<java.lang.String> getTestDeviceAdvertisingIds() {
        return this.e;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public boolean isExceptionHandlerEnabled() {
        return this.g;
    }

    public java.lang.String toString() {
        return "AppLovinSdkInitializationConfiguration{ sdkKey=" + this.f1267a + ", mediationProvider=" + this.b + ", pluginVersion=" + this.c + ", testDeviceAdvertisingIds=" + this.e + ", adUnitIdentifiers=" + this.f + ", isExceptionHandlerEnabled=" + this.g + ", segmentCollection=" + this.d + "}";
    }

    private AppLovinSdkInitializationConfigurationImpl(com.applovin.impl.sdk.AppLovinSdkInitializationConfigurationImpl.BuilderImpl builderImpl) {
        this.f1267a = builderImpl.f1268a;
        this.b = builderImpl.b;
        this.c = builderImpl.c;
        this.d = builderImpl.d;
        this.e = builderImpl.e;
        this.f = builderImpl.f;
        this.g = builderImpl.g;
    }
}
