package com.google.android.gms.auth;

/* JADX INFO: loaded from: classes4.dex */
public class GooglePlayServicesAvailabilityException extends com.google.android.gms.auth.UserRecoverableAuthException {
    private final int zzu;

    GooglePlayServicesAvailabilityException(int i, java.lang.String str, android.content.Intent intent) {
        super(str, intent);
        this.zzu = i;
    }

    public int getConnectionStatusCode() {
        return this.zzu;
    }
}
