package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdl implements com.google.android.gms.internal.consent_sdk.zzdk {
    private final java.lang.Object zza;

    private zzdl(java.lang.Object obj) {
        this.zza = obj;
    }

    public static com.google.android.gms.internal.consent_sdk.zzdk zzb(java.lang.Object obj) {
        if (obj != null) {
            return new com.google.android.gms.internal.consent_sdk.zzdl(obj);
        }
        throw new java.lang.NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdp, com.google.android.gms.internal.consent_sdk.zzdo
    public final java.lang.Object zza() {
        return this.zza;
    }
}
