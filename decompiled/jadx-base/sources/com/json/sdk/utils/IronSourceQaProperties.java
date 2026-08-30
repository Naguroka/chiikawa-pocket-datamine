package com.json.sdk.utils;

/* JADX INFO: loaded from: classes5.dex */
public class IronSourceQaProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.json.sdk.utils.IronSourceQaProperties f3402a;
    private static java.util.Map<java.lang.String, java.lang.String> b = new java.util.HashMap();

    private IronSourceQaProperties() {
    }

    public static com.json.sdk.utils.IronSourceQaProperties getInstance() {
        if (f3402a == null) {
            f3402a = new com.json.sdk.utils.IronSourceQaProperties();
        }
        return f3402a;
    }

    public static boolean isInitialized() {
        return f3402a != null;
    }

    public java.util.Map<java.lang.String, java.lang.String> getParameters() {
        return b;
    }

    public void setQaParameter(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return;
        }
        b.put(str, str2);
    }
}
