package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzal implements com.google.android.gms.internal.consent_sdk.zzdk {
    private final com.google.android.gms.internal.consent_sdk.zzdp zza;
    private final com.google.android.gms.internal.consent_sdk.zzdp zzb;

    public zzal(com.google.android.gms.internal.consent_sdk.zzdp zzdpVar, com.google.android.gms.internal.consent_sdk.zzdp zzdpVar2, com.google.android.gms.internal.consent_sdk.zzdp zzdpVar3) {
        this.zza = zzdpVar;
        this.zzb = zzdpVar2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdp, com.google.android.gms.internal.consent_sdk.zzdo
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.consent_sdk.zzak zza() {
        return new com.google.android.gms.internal.consent_sdk.zzak((android.app.Application) this.zza.zza(), (com.google.android.gms.internal.consent_sdk.zzam) this.zzb.zza(), com.google.android.gms.internal.consent_sdk.zzar.zzb());
    }
}
