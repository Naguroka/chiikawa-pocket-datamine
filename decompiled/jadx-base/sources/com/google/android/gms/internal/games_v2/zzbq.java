package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbq {
    private final java.lang.String zza;
    private final com.google.android.gms.common.api.Status zzb;

    private zzbq(com.google.android.gms.common.api.Status status, java.lang.String str) {
        this.zzb = status;
        this.zza = str;
    }

    public static com.google.android.gms.internal.games_v2.zzbq zzb(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(!status.isSuccess());
        return new com.google.android.gms.internal.games_v2.zzbq(status, null);
    }

    public static com.google.android.gms.internal.games_v2.zzbq zzc(java.lang.String str) {
        return new com.google.android.gms.internal.games_v2.zzbq(com.google.android.gms.common.api.Status.RESULT_SUCCESS, str);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.games_v2.zzbq)) {
            return false;
        }
        com.google.android.gms.internal.games_v2.zzbq zzbqVar = (com.google.android.gms.internal.games_v2.zzbq) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzb, zzbqVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zza, zzbqVar.zza);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb, this.zza);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("status", this.zzb).add("gameRunToken", this.zza).toString();
    }

    public final android.app.PendingIntent zza() {
        return this.zzb.getResolution();
    }

    public final java.lang.String zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzb.isSuccess();
    }
}
