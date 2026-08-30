package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzq implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
    public final int zza;
    public final java.lang.String zzb;

    /* synthetic */ zzq(int i, java.lang.String str, com.google.android.gms.internal.games_v2.zzp zzpVar) {
        this.zza = i;
        this.zzb = str;
    }

    public static com.google.android.gms.internal.games_v2.zzo zza() {
        return new com.google.android.gms.internal.games_v2.zzo(null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.games_v2.zzq)) {
            return false;
        }
        com.google.android.gms.internal.games_v2.zzq zzqVar = (com.google.android.gms.internal.games_v2.zzq) obj;
        return this.zza == zzqVar.zza && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzqVar.zzb);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza), this.zzb);
    }
}
