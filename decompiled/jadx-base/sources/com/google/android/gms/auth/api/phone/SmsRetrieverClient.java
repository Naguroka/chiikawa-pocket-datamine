package com.google.android.gms.auth.api.phone;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SmsRetrieverClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> implements com.google.android.gms.auth.api.phone.SmsRetrieverApi {
    private static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.p001authapiphone.zzi, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> CLIENT_BUILDER;
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.p001authapiphone.zzi> CLIENT_KEY;

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.p001authapiphone.zzi> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        com.google.android.gms.auth.api.phone.zza zzaVar = new com.google.android.gms.auth.api.phone.zza();
        CLIENT_BUILDER = zzaVar;
        API = new com.google.android.gms.common.api.Api<>("SmsRetriever.API", zzaVar, clientKey);
    }

    public SmsRetrieverClient(android.app.Activity activity) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions>) API, (com.google.android.gms.common.api.Api.ApiOptions) null, (com.google.android.gms.common.api.internal.StatusExceptionMapper) new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }

    public SmsRetrieverClient(android.content.Context context) {
        super(context, API, (com.google.android.gms.common.api.Api.ApiOptions) null, new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> startSmsRetriever();
}
