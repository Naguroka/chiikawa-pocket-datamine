package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzape {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    public zzape(java.lang.String str, java.lang.String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzape zzapeVar = (com.google.android.gms.internal.ads.zzape) obj;
            if (android.text.TextUtils.equals(this.zza, zzapeVar.zza) && android.text.TextUtils.equals(this.zzb, zzapeVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final java.lang.String toString() {
        return "Header[name=" + this.zza + ",value=" + this.zzb + com.ironsource.y8.i.e;
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    public final java.lang.String zzb() {
        return this.zzb;
    }
}
