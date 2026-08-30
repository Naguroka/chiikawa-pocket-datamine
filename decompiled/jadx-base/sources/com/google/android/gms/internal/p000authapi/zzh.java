package com.google.android.gms.internal.p000authapi;

/* JADX INFO: loaded from: classes4.dex */
public final class zzh implements com.google.android.gms.auth.api.credentials.CredentialRequestResult {
    private final com.google.android.gms.common.api.Status mStatus;
    private final com.google.android.gms.auth.api.credentials.Credential zzal;

    public zzh(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.api.credentials.Credential credential) {
        this.mStatus = status;
        this.zzal = credential;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.mStatus;
    }

    @Override // com.google.android.gms.auth.api.credentials.CredentialRequestResult
    public final com.google.android.gms.auth.api.credentials.Credential getCredential() {
        return this.zzal;
    }

    public static com.google.android.gms.internal.p000authapi.zzh zzd(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.internal.p000authapi.zzh(status, null);
    }
}
