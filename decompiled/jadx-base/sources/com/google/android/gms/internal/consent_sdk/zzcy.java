package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcy extends com.google.android.gms.internal.consent_sdk.zzcv {
    private final com.google.android.gms.internal.consent_sdk.zzda zza;

    zzcy(com.google.android.gms.internal.consent_sdk.zzda zzdaVar, int i) {
        super(zzdaVar.size(), i);
        this.zza = zzdaVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcv
    protected final java.lang.Object zza(int i) {
        return this.zza.get(i);
    }
}
