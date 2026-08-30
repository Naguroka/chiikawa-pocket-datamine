package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdi implements com.google.android.gms.internal.consent_sdk.zzdk {
    private com.google.android.gms.internal.consent_sdk.zzdn zza;

    public static void zzb(com.google.android.gms.internal.consent_sdk.zzdn zzdnVar, com.google.android.gms.internal.consent_sdk.zzdn zzdnVar2) {
        com.google.android.gms.internal.consent_sdk.zzdi zzdiVar = (com.google.android.gms.internal.consent_sdk.zzdi) zzdnVar;
        if (zzdiVar.zza != null) {
            throw new java.lang.IllegalStateException();
        }
        zzdiVar.zza = zzdnVar2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdp, com.google.android.gms.internal.consent_sdk.zzdo
    public final java.lang.Object zza() {
        com.google.android.gms.internal.consent_sdk.zzdn zzdnVar = this.zza;
        if (zzdnVar != null) {
            return zzdnVar.zza();
        }
        throw new java.lang.IllegalStateException();
    }
}
