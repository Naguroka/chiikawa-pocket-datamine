package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzag {
    private android.app.Application zza;

    private zzag() {
        throw null;
    }

    /* synthetic */ zzag(com.google.android.gms.internal.consent_sdk.zzaj zzajVar) {
    }

    public final com.google.android.gms.internal.consent_sdk.zza zza() {
        com.google.android.gms.internal.consent_sdk.zzdm.zzb(this.zza, android.app.Application.class);
        return new com.google.android.gms.internal.consent_sdk.zzaf(this.zza, null);
    }

    public final com.google.android.gms.internal.consent_sdk.zzag zzb(android.app.Application application) {
        application.getClass();
        this.zza = application;
        return this;
    }
}
