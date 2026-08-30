package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaae {
    private final com.google.android.gms.common.api.internal.ApiKey zaa;
    private final com.google.android.gms.tasks.TaskCompletionSource zab = new com.google.android.gms.tasks.TaskCompletionSource();

    public zaae(com.google.android.gms.common.api.internal.ApiKey apiKey) {
        this.zaa = apiKey;
    }

    public final com.google.android.gms.common.api.internal.ApiKey zaa() {
        return this.zaa;
    }

    public final com.google.android.gms.tasks.TaskCompletionSource zab() {
        return this.zab;
    }
}
