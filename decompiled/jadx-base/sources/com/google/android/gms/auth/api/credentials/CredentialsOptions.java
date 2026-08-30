package com.google.android.gms.auth.api.credentials;

/* JADX INFO: loaded from: classes4.dex */
public final class CredentialsOptions extends com.google.android.gms.auth.api.Auth.AuthCredentialsOptions {
    public static final com.google.android.gms.auth.api.credentials.CredentialsOptions DEFAULT = (com.google.android.gms.auth.api.credentials.CredentialsOptions) new com.google.android.gms.auth.api.credentials.CredentialsOptions.Builder().zzc();

    public static final class Builder extends com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder {
        @Override // com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder
        public final com.google.android.gms.auth.api.credentials.CredentialsOptions.Builder forceEnableSaveDialog() {
            this.zzn = true;
            return this;
        }

        @Override // com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder
        /* JADX INFO: renamed from: build, reason: merged with bridge method [inline-methods] */
        public final com.google.android.gms.auth.api.credentials.CredentialsOptions zzc() {
            return new com.google.android.gms.auth.api.credentials.CredentialsOptions(this);
        }
    }

    private CredentialsOptions(com.google.android.gms.auth.api.credentials.CredentialsOptions.Builder builder) {
        super(builder);
    }
}
