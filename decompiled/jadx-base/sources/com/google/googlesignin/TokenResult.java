package com.google.googlesignin;

/* JADX INFO: loaded from: classes5.dex */
public class TokenResult implements com.google.android.gms.common.api.Result {
    private com.google.android.gms.auth.api.signin.GoogleSignInAccount account;
    private long handle;
    private com.google.android.gms.common.api.Status status;

    TokenResult() {
        this.status = new com.google.android.gms.common.api.Status(4);
        this.account = null;
    }

    TokenResult(com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, int i) {
        this.status = new com.google.android.gms.common.api.Status(i);
        this.account = googleSignInAccount;
    }

    public java.lang.String toString() {
        java.util.Locale locale = java.util.Locale.getDefault();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = this.status;
        java.lang.Object obj = this.account;
        if (obj == null) {
            obj = "<null>";
        }
        objArr[1] = obj;
        return java.lang.String.format(locale, "Status: %s %s", objArr);
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.status;
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInAccount getAccount() {
        return this.account;
    }

    public void setStatus(int i) {
        this.status = new com.google.android.gms.common.api.Status(i);
    }

    public long getHandle() {
        return this.handle;
    }

    public void setHandle(long j) {
        this.handle = j;
    }
}
