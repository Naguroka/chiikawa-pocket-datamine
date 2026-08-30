package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zabt extends com.google.android.gms.common.api.internal.zaaf {
    private final com.google.android.gms.common.api.GoogleApi zaa;

    public zabt(com.google.android.gms.common.api.GoogleApi googleApi) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.zaa = googleApi;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t) {
        return (T) this.zaa.doRead(t);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T execute(T t) {
        return (T) this.zaa.doWrite(t);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final android.content.Context getContext() {
        return this.zaa.getApplicationContext();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final android.os.Looper getLooper() {
        return this.zaa.getLooper();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zao(com.google.android.gms.common.api.internal.zacx zacxVar) {
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zap(com.google.android.gms.common.api.internal.zacx zacxVar) {
    }
}
