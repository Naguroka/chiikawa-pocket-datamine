package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinError {
    public static final com.applovin.impl.sdk.AppLovinError NO_FILL = new com.applovin.impl.sdk.AppLovinError(204, "No Fill");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1265a;
    private final java.lang.String b;

    public AppLovinError(int i, java.lang.String str) {
        this.f1265a = i;
        this.b = str;
    }

    protected boolean canEqual(java.lang.Object obj) {
        return obj instanceof com.applovin.impl.sdk.AppLovinError;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.sdk.AppLovinError)) {
            return false;
        }
        com.applovin.impl.sdk.AppLovinError appLovinError = (com.applovin.impl.sdk.AppLovinError) obj;
        if (!appLovinError.canEqual(this) || getCode() != appLovinError.getCode()) {
            return false;
        }
        java.lang.String message = getMessage();
        java.lang.String message2 = appLovinError.getMessage();
        return message != null ? message.equals(message2) : message2 == null;
    }

    public int getCode() {
        return this.f1265a;
    }

    public java.lang.String getMessage() {
        return this.b;
    }

    public int hashCode() {
        int code = getCode() + 59;
        java.lang.String message = getMessage();
        return (code * 59) + (message == null ? 43 : message.hashCode());
    }

    public java.lang.String toString() {
        return "AppLovinError(code=" + getCode() + ", message=" + getMessage() + ")";
    }
}
