package com.google.android.gms.auth;

/* JADX INFO: loaded from: classes4.dex */
public class UserRecoverableAuthException extends com.google.android.gms.auth.GoogleAuthException {
    private final android.content.Intent mIntent;

    public UserRecoverableAuthException(java.lang.String str, android.content.Intent intent) {
        super(str);
        this.mIntent = intent;
    }

    public android.content.Intent getIntent() {
        if (this.mIntent == null) {
            return null;
        }
        return new android.content.Intent(this.mIntent);
    }
}
