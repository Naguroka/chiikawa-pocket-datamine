package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzeay extends com.google.android.gms.internal.ads.zzebc {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final android.graphics.drawable.Drawable zzc;

    zzeay(java.lang.String str, java.lang.String str2, android.graphics.drawable.Drawable drawable) {
        this.zza = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null imageUrl");
        }
        this.zzb = str2;
        this.zzc = drawable;
    }

    public final boolean equals(java.lang.Object obj) {
        android.graphics.drawable.Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzebc) {
            com.google.android.gms.internal.ads.zzebc zzebcVar = (com.google.android.gms.internal.ads.zzebc) obj;
            java.lang.String str = this.zza;
            if (str != null ? str.equals(zzebcVar.zzb()) : zzebcVar.zzb() == null) {
                if (this.zzb.equals(zzebcVar.zzc()) && ((drawable = this.zzc) != null ? drawable.equals(zzebcVar.zza()) : zzebcVar.zza() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final java.lang.String toString() {
        return "OfflineAdAssets{advertiserName=" + this.zza + ", imageUrl=" + this.zzb + ", icon=" + java.lang.String.valueOf(this.zzc) + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    final android.graphics.drawable.Drawable zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    final java.lang.String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    final java.lang.String zzc() {
        return this.zzb;
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        android.graphics.drawable.Drawable drawable = this.zzc;
        return (iHashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }
}
