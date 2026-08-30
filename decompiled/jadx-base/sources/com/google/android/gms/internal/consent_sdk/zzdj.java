package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdj implements com.google.android.gms.internal.consent_sdk.zzdn {
    private static final java.lang.Object zza = new java.lang.Object();
    private volatile com.google.android.gms.internal.consent_sdk.zzdn zzb;
    private volatile java.lang.Object zzc = zza;

    private zzdj(com.google.android.gms.internal.consent_sdk.zzdn zzdnVar) {
        this.zzb = zzdnVar;
    }

    public static com.google.android.gms.internal.consent_sdk.zzdn zzb(com.google.android.gms.internal.consent_sdk.zzdn zzdnVar) {
        return zzdnVar instanceof com.google.android.gms.internal.consent_sdk.zzdj ? zzdnVar : new com.google.android.gms.internal.consent_sdk.zzdj(zzdnVar);
    }

    private final synchronized java.lang.Object zzc() {
        java.lang.Object obj = this.zzc;
        java.lang.Object obj2 = zza;
        if (obj != obj2) {
            return obj;
        }
        java.lang.Object objZza = this.zzb.zza();
        java.lang.Object obj3 = this.zzc;
        if (obj3 != obj2 && obj3 != objZza) {
            throw new java.lang.IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
        }
        this.zzc = objZza;
        this.zzb = null;
        return objZza;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdp, com.google.android.gms.internal.consent_sdk.zzdo
    public final java.lang.Object zza() {
        java.lang.Object obj = this.zzc;
        return obj == zza ? zzc() : obj;
    }
}
