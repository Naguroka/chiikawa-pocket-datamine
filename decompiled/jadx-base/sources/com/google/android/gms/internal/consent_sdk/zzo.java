package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzo implements com.google.android.gms.internal.consent_sdk.zzdk {
    private final com.google.android.gms.internal.consent_sdk.zzdp zza;
    private final com.google.android.gms.internal.consent_sdk.zzdp zzb;

    public zzo(com.google.android.gms.internal.consent_sdk.zzdp zzdpVar, com.google.android.gms.internal.consent_sdk.zzdp zzdpVar2) {
        this.zza = zzdpVar;
        this.zzb = zzdpVar2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdp, com.google.android.gms.internal.consent_sdk.zzdo
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.consent_sdk.zzl zza() {
        return new com.google.android.gms.internal.consent_sdk.zzl((android.app.Application) this.zza.zza(), (com.google.android.gms.internal.consent_sdk.zzam) this.zzb.zza());
    }
}
