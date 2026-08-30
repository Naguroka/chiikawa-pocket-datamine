package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzby {
    public static final com.google.android.gms.internal.ads.zzby zza = new com.google.android.gms.internal.ads.zzby(com.google.android.gms.internal.ads.zzfxn.zzn());
    private final com.google.android.gms.internal.ads.zzfxn zzb;

    static {
        java.lang.Integer.toString(0, 36);
    }

    public zzby(java.util.List list) {
        this.zzb = com.google.android.gms.internal.ads.zzfxn.zzl(list);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zzb.equals(((com.google.android.gms.internal.ads.zzby) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final com.google.android.gms.internal.ads.zzfxn zza() {
        return this.zzb;
    }

    public final boolean zzb(int i) {
        for (int i2 = 0; i2 < this.zzb.size(); i2++) {
            com.google.android.gms.internal.ads.zzbx zzbxVar = (com.google.android.gms.internal.ads.zzbx) this.zzb.get(i2);
            if (zzbxVar.zzc() && zzbxVar.zza() == i) {
                return true;
            }
        }
        return false;
    }
}
