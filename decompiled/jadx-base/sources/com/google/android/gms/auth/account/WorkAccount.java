package com.google.android.gms.auth.account;

/* JADX INFO: loaded from: classes4.dex */
public class WorkAccount {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzr, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> CLIENT_BUILDER;
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.auth.zzr> CLIENT_KEY;

    @java.lang.Deprecated
    public static final com.google.android.gms.auth.account.WorkAccountApi WorkAccountApi;

    public static com.google.android.gms.auth.account.WorkAccountClient getClient(android.app.Activity activity) {
        return new com.google.android.gms.auth.account.WorkAccountClient(activity);
    }

    public static com.google.android.gms.auth.account.WorkAccountClient getClient(android.content.Context context) {
        return new com.google.android.gms.auth.account.WorkAccountClient(context);
    }

    private WorkAccount() {
    }

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.auth.zzr> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        com.google.android.gms.auth.account.zzf zzfVar = new com.google.android.gms.auth.account.zzf();
        CLIENT_BUILDER = zzfVar;
        API = new com.google.android.gms.common.api.Api<>("WorkAccount.API", zzfVar, clientKey);
        WorkAccountApi = new com.google.android.gms.internal.auth.zzh();
    }
}
