package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzn {
    private final java.lang.Class<?> zza;
    private final com.google.android.gms.common.api.Api.ApiOptions zzb = null;

    zzn(com.google.android.gms.common.api.GoogleApi<?> googleApi, com.google.android.gms.common.api.Api.ApiOptions apiOptions) {
        this.zza = googleApi.getClass();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.nearby.zzn) {
            com.google.android.gms.internal.nearby.zzn zznVar = (com.google.android.gms.internal.nearby.zzn) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zza, zznVar.zza)) {
                com.google.android.gms.common.api.Api.ApiOptions apiOptions = zznVar.zzb;
                if (com.google.android.gms.common.internal.Objects.equal(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, null);
    }
}
