package com.google.googlesignin;

/* JADX INFO: loaded from: classes5.dex */
public class TokenRequest {
    private java.lang.String accountName;
    private boolean doAuthCode;
    private boolean doEmail;
    private boolean doIdToken;
    private boolean forceRefresh;
    private long handle;
    private boolean hidePopups;
    private com.google.googlesignin.TokenPendingResult pendingResponse;
    private java.lang.String[] scopes;
    private boolean useGamesConfig;
    private java.lang.String webClientId;

    public TokenRequest(boolean z, java.lang.String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, java.lang.String str2, java.lang.String[] strArr, long j) {
        this.pendingResponse = new com.google.googlesignin.TokenPendingResult(j);
        this.useGamesConfig = z;
        this.webClientId = str;
        this.doAuthCode = z2;
        this.forceRefresh = z3;
        this.doEmail = z4;
        this.doIdToken = z5;
        this.hidePopups = z6;
        this.accountName = str2;
        this.handle = j;
        if (strArr != null && strArr.length > 0) {
            java.lang.String[] strArr2 = new java.lang.String[strArr.length];
            this.scopes = strArr2;
            java.lang.System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            return;
        }
        this.scopes = null;
    }

    public com.google.android.gms.common.api.PendingResult<com.google.googlesignin.TokenResult> getPendingResponse() {
        return this.pendingResponse;
    }

    public void setResult(int i, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        this.pendingResponse.setResult(googleSignInAccount, i);
        this.pendingResponse.setStatus(i);
    }

    public void cancel() {
        this.pendingResponse.cancel();
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.getDefault(), "%s(a:%b:e:%b:i:%b)", java.lang.Integer.toHexString(hashCode()), java.lang.Boolean.valueOf(this.doAuthCode), java.lang.Boolean.valueOf(this.doEmail), java.lang.Boolean.valueOf(this.doIdToken));
    }

    public java.lang.String getWebClientId() {
        java.lang.String str = this.webClientId;
        return str == null ? "" : str;
    }

    public boolean getForceRefresh() {
        return this.forceRefresh;
    }

    public boolean isValid() {
        java.lang.String str = this.webClientId;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        if (this.doAuthCode) {
            com.google.googlesignin.GoogleSignInHelper.logError("Invalid configuration, auth code requires web client id");
            return false;
        }
        if (!this.doIdToken) {
            return true;
        }
        com.google.googlesignin.GoogleSignInHelper.logError("Invalid configuration, id token requires web client id");
        return false;
    }

    public long getHandle() {
        return this.handle;
    }

    public boolean getUseGamesConfig() {
        return this.useGamesConfig;
    }

    public boolean getDoAuthCode() {
        return this.doAuthCode;
    }

    public boolean getDoEmail() {
        return this.doEmail;
    }

    public boolean getDoIdToken() {
        return this.doIdToken;
    }

    public java.lang.String[] getScopes() {
        return this.scopes;
    }

    public java.lang.String getAccountName() {
        return this.accountName;
    }

    public boolean getHidePopups() {
        return this.hidePopups;
    }
}
