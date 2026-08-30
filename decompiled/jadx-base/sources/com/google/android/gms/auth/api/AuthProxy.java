package com.google.android.gms.auth.api;

/* JADX INFO: loaded from: classes4.dex */
public final class AuthProxy {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.AuthProxyOptions> API;
    public static final com.google.android.gms.auth.api.proxy.ProxyApi ProxyApi;
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.auth.zzak> zzah;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzak, com.google.android.gms.auth.api.AuthProxyOptions> zzai;

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.auth.zzak> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        zzah = clientKey;
        com.google.android.gms.auth.api.zza zzaVar = new com.google.android.gms.auth.api.zza();
        zzai = zzaVar;
        API = new com.google.android.gms.common.api.Api<>("Auth.PROXY_API", zzaVar, clientKey);
        ProxyApi = new com.google.android.gms.internal.auth.zzar();
    }
}
