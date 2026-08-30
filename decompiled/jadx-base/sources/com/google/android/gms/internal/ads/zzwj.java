package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzwj {
    public static final com.google.android.gms.internal.ads.zzwj zza = new com.google.android.gms.internal.ads.zzwj(new com.google.android.gms.internal.ads.zzbr[0]);
    public final int zzb;
    private final com.google.android.gms.internal.ads.zzfxn zzc;
    private int zzd;

    static {
        java.lang.Integer.toString(0, 36);
    }

    public zzwj(com.google.android.gms.internal.ads.zzbr... zzbrVarArr) {
        this.zzc = com.google.android.gms.internal.ads.zzfxn.zzm(zzbrVarArr);
        this.zzb = zzbrVarArr.length;
        int i = 0;
        while (i < this.zzc.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.zzc.size(); i3++) {
                if (((com.google.android.gms.internal.ads.zzbr) this.zzc.get(i)).equals(this.zzc.get(i3))) {
                    com.google.android.gms.internal.ads.zzdo.zzd("TrackGroupArray", "", new java.lang.IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzwj zzwjVar = (com.google.android.gms.internal.ads.zzwj) obj;
            if (this.zzb == zzwjVar.zzb && this.zzc.equals(zzwjVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.zzc.hashCode();
        this.zzd = iHashCode;
        return iHashCode;
    }

    public final int zza(com.google.android.gms.internal.ads.zzbr zzbrVar) {
        int iIndexOf = this.zzc.indexOf(zzbrVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final com.google.android.gms.internal.ads.zzbr zzb(int i) {
        return (com.google.android.gms.internal.ads.zzbr) this.zzc.get(i);
    }

    public final com.google.android.gms.internal.ads.zzfxn zzc() {
        return com.google.android.gms.internal.ads.zzfxn.zzl(com.google.android.gms.internal.ads.zzfyd.zzb(this.zzc, new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzwi
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzwj zzwjVar = com.google.android.gms.internal.ads.zzwj.zza;
                return java.lang.Integer.valueOf(((com.google.android.gms.internal.ads.zzbr) obj).zzc);
            }
        }));
    }
}
