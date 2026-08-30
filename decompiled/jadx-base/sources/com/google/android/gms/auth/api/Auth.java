package com.google.android.gms.auth.api;

/* JADX INFO: loaded from: classes4.dex */
public final class Auth {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.Auth.AuthCredentialsOptions> CREDENTIALS_API;
    public static final com.google.android.gms.auth.api.credentials.CredentialsApi CredentialsApi;
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.signin.GoogleSignInOptions> GOOGLE_SIGN_IN_API;
    public static final com.google.android.gms.auth.api.signin.GoogleSignInApi GoogleSignInApi;

    @java.lang.Deprecated
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.AuthProxyOptions> PROXY_API;

    @java.lang.Deprecated
    public static final com.google.android.gms.auth.api.proxy.ProxyApi ProxyApi;
    public static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.p000authapi.zzr> zzg;
    public static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.auth.api.signin.internal.zzg> zzh;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.p000authapi.zzr, com.google.android.gms.auth.api.Auth.AuthCredentialsOptions> zzi;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.auth.api.signin.internal.zzg, com.google.android.gms.auth.api.signin.GoogleSignInOptions> zzj;

    private Auth() {
    }

    @java.lang.Deprecated
    public static class AuthCredentialsOptions implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
        private static final com.google.android.gms.auth.api.Auth.AuthCredentialsOptions zzk = new com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder().zzc();
        private final java.lang.String zzl = null;
        private final boolean zzm;

        public AuthCredentialsOptions(com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder builder) {
            this.zzm = builder.zzn.booleanValue();
        }

        @java.lang.Deprecated
        public static class Builder {
            protected java.lang.Boolean zzn = false;

            public com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder forceEnableSaveDialog() {
                this.zzn = true;
                return this;
            }

            public com.google.android.gms.auth.api.Auth.AuthCredentialsOptions zzc() {
                return new com.google.android.gms.auth.api.Auth.AuthCredentialsOptions(this);
            }
        }

        public final android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.zzm);
            return bundle;
        }
    }

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.p000authapi.zzr> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        zzg = clientKey;
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.auth.api.signin.internal.zzg> clientKey2 = new com.google.android.gms.common.api.Api.ClientKey<>();
        zzh = clientKey2;
        com.google.android.gms.auth.api.zzc zzcVar = new com.google.android.gms.auth.api.zzc();
        zzi = zzcVar;
        com.google.android.gms.auth.api.zzd zzdVar = new com.google.android.gms.auth.api.zzd();
        zzj = zzdVar;
        PROXY_API = com.google.android.gms.auth.api.AuthProxy.API;
        CREDENTIALS_API = new com.google.android.gms.common.api.Api<>("Auth.CREDENTIALS_API", zzcVar, clientKey);
        GOOGLE_SIGN_IN_API = new com.google.android.gms.common.api.Api<>("Auth.GOOGLE_SIGN_IN_API", zzdVar, clientKey2);
        ProxyApi = com.google.android.gms.auth.api.AuthProxy.ProxyApi;
        CredentialsApi = new com.google.android.gms.internal.p000authapi.zzi();
        GoogleSignInApi = new com.google.android.gms.auth.api.signin.internal.zzf();
    }
}
