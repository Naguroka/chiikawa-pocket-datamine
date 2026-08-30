package com.applovin.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinSdkSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1608a;
    private boolean b;
    private java.lang.String f;
    private java.lang.String g;
    private final com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings k;
    private com.applovin.impl.sdk.j l;
    private java.lang.String m;
    private boolean e = true;
    private final java.util.Map<java.lang.String, java.lang.Object> localSettings = new java.util.HashMap();
    private java.util.List h = java.util.Collections.emptyList();
    private java.util.List i = java.util.Collections.emptyList();
    private final java.util.Map j = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private boolean c = true;
    private boolean d = true;

    public AppLovinSdkSettings(android.content.Context context) {
        this.m = "";
        if (context == null) {
            com.applovin.impl.sdk.n.h("AppLovinSdkSettings", "context cannot be null. Please provide a valid context.");
        }
        android.content.Context contextD = com.applovin.impl.yp.d(context);
        this.f1608a = com.applovin.impl.yp.k(contextD);
        this.k = com.applovin.impl.h4.a(contextD);
        this.m = contextD.getPackageName();
        a(contextD);
    }

    private void a(android.content.Context context) {
        int identifier = context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName());
        if (identifier == 0) {
            return;
        }
        java.lang.String strA = com.applovin.impl.yp.a(identifier, context, (com.applovin.impl.sdk.j) null);
        this.j.putAll(com.applovin.impl.sdk.utils.JsonUtils.tryToStringMap(com.applovin.impl.sdk.utils.StringUtils.isValidString(strA) ? com.applovin.impl.sdk.utils.JsonUtils.jsonObjectFromJsonString(strA, new org.json.JSONObject()) : new org.json.JSONObject()));
    }

    public void attachAppLovinSdk(com.applovin.impl.sdk.j jVar) {
        this.l = jVar;
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(this.f)) {
            jVar.k0().a(java.util.Arrays.asList(this.f.split(",")));
            this.f = null;
        }
        if (this.g != null) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a("AppLovinSdkSettings", "Setting user id: " + this.g);
            }
            jVar.o0().a(this.g);
            this.g = null;
        }
    }

    public java.util.Map<java.lang.String, java.lang.String> getExtraParameters() {
        java.util.Map<java.lang.String, java.lang.String> map;
        synchronized (this.j) {
            map = com.applovin.impl.sdk.utils.CollectionUtils.map(this.j);
        }
        return map;
    }

    @java.lang.Deprecated
    public java.util.List<java.lang.String> getInitializationAdUnitIds() {
        return this.i;
    }

    public com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings getTermsAndPrivacyPolicyFlowSettings() {
        return this.k;
    }

    @java.lang.Deprecated
    public java.util.List<java.lang.String> getTestDeviceAdvertisingIds() {
        return this.h;
    }

    public java.lang.String getUserIdentifier() {
        com.applovin.impl.sdk.j jVar = this.l;
        return jVar == null ? this.g : jVar.o0().c();
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.c;
    }

    @java.lang.Deprecated
    public boolean isExceptionHandlerEnabled() {
        return this.d;
    }

    public boolean isMuted() {
        return this.b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f1608a;
    }

    public void setCreativeDebuggerEnabled(boolean z) {
        com.applovin.impl.sdk.n.e("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z + ")");
        if (this.c == z) {
            return;
        }
        this.c = z;
        com.applovin.impl.sdk.j jVar = this.l;
        if (jVar == null) {
            return;
        }
        if (z) {
            jVar.v().l();
        } else {
            jVar.v().k();
        }
    }

    @java.lang.Deprecated
    public void setExceptionHandlerEnabled(boolean z) {
        com.applovin.impl.sdk.n.e("AppLovinSdkSettings", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z + ")");
        this.d = z;
    }

    public void setExtraParameter(java.lang.String str, java.lang.String str2) {
        com.applovin.impl.sdk.n.e("AppLovinSdkSettings", "setExtraParameter(key=" + str + ", value=" + str2 + ")");
        if (android.text.TextUtils.isEmpty(str)) {
            com.applovin.impl.sdk.n.h("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        java.lang.String strTrim = str2 != null ? str2.trim() : null;
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.l == null) {
                this.f = strTrim;
            } else if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strTrim)) {
                this.l.k0().a(java.util.Arrays.asList(strTrim.split(",")));
            } else {
                this.l.k0().a((java.lang.String) null);
            }
        } else if ("fan".equals(str) || "esc".equals(str)) {
            if (!this.m.startsWith("com.unity.")) {
                return;
            }
        } else if ("disable_all_logs".equals(str)) {
            com.applovin.impl.sdk.n.a(java.lang.Boolean.parseBoolean(strTrim));
        } else if ("package_name_override".equals(str)) {
            com.applovin.impl.sdk.k.b(strTrim);
        }
        this.j.put(str, strTrim);
    }

    @java.lang.Deprecated
    public void setInitializationAdUnitIds(java.util.List<java.lang.String> list) {
        com.applovin.impl.sdk.n.e("AppLovinSdkSettings", "setInitializationAdUnitIds(initializationAdUnitIds=" + list + ")");
        if (list == null) {
            this.i = java.util.Collections.emptyList();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (java.lang.String str : list) {
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str) && str.length() > 0) {
                if (str.length() == 16) {
                    arrayList.add(str);
                } else {
                    com.applovin.impl.sdk.n.h("AppLovinSdkSettings", "Unable to set initialization ad unit id (" + str + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                }
            }
        }
        this.i = arrayList;
    }

    public void setMuted(boolean z) {
        com.applovin.impl.sdk.n.e("AppLovinSdkSettings", "setMuted(muted=" + z + ")");
        this.b = z;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z) {
        com.applovin.impl.sdk.n.e("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z + ")");
        this.e = z;
    }

    @java.lang.Deprecated
    public void setTestDeviceAdvertisingIds(java.util.List<java.lang.String> list) {
        com.applovin.impl.sdk.n.e("AppLovinSdkSettings", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + ")");
        if (list == null) {
            this.h = java.util.Collections.emptyList();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (java.lang.String str : list) {
            if (str == null || str.length() != 36) {
                com.applovin.impl.sdk.n.h("AppLovinSdkSettings", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
            } else {
                arrayList.add(str);
            }
        }
        this.h = arrayList;
    }

    public void setUserIdentifier(java.lang.String str) {
        com.applovin.impl.sdk.n.e("AppLovinSdkSettings", "setUserIdentifier(userIdentifier=" + str + ")");
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str) && str.length() > com.applovin.impl.yp.b(8)) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + com.applovin.impl.yp.b(8) + " maximum)");
        }
        com.applovin.impl.sdk.j jVar = this.l;
        if (jVar == null) {
            this.g = str;
            return;
        }
        jVar.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.l.I().a("AppLovinSdkSettings", "Setting user id: " + str);
        }
        this.l.o0().a(str);
    }

    public void setVerboseLogging(boolean z) {
        com.applovin.impl.sdk.n.e("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z + ")");
        if (!com.applovin.impl.yp.k()) {
            this.f1608a = z;
            return;
        }
        com.applovin.impl.sdk.n.h("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
        if (com.applovin.impl.yp.k(null) != z) {
            com.applovin.impl.sdk.n.h("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
        }
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.e;
    }

    public java.lang.String toString() {
        return "AppLovinSdkSettings{isVerboseLoggingEnabled=" + this.f1608a + ", muted=" + this.b + ", testDeviceAdvertisingIds=" + this.h.toString() + ", initializationAdUnitIds=" + this.i.toString() + ", creativeDebuggerEnabled=" + this.c + ", exceptionHandlerEnabled=" + this.d + '}';
    }
}
