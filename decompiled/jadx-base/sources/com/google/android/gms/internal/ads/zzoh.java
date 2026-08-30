package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzoh {
    public static final com.google.android.gms.internal.ads.zzoh zza;
    public final int zzb;
    public final int zzc;
    private final com.google.android.gms.internal.ads.zzfxs zzd;

    static {
        com.google.android.gms.internal.ads.zzoh zzohVar;
        if (com.google.android.gms.internal.ads.zzei.zza >= 33) {
            com.google.android.gms.internal.ads.zzfxr zzfxrVar = new com.google.android.gms.internal.ads.zzfxr();
            for (int i = 1; i <= 10; i++) {
                zzfxrVar.zzf(java.lang.Integer.valueOf(com.google.android.gms.internal.ads.zzei.zzi(i)));
            }
            zzohVar = new com.google.android.gms.internal.ads.zzoh(2, zzfxrVar.zzi());
        } else {
            zzohVar = new com.google.android.gms.internal.ads.zzoh(2, 10);
        }
        zza = zzohVar;
    }

    public zzoh(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = null;
    }

    public zzoh(int i, java.util.Set set) {
        this.zzb = i;
        com.google.android.gms.internal.ads.zzfxs zzfxsVarZzl = com.google.android.gms.internal.ads.zzfxs.zzl(set);
        this.zzd = zzfxsVarZzl;
        com.google.android.gms.internal.ads.zzfzt it = zzfxsVarZzl.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = java.lang.Math.max(iMax, java.lang.Integer.bitCount(((java.lang.Integer) it.next()).intValue()));
        }
        this.zzc = iMax;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzoh)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzoh zzohVar = (com.google.android.gms.internal.ads.zzoh) obj;
        return this.zzb == zzohVar.zzb && this.zzc == zzohVar.zzc && java.util.Objects.equals(this.zzd, zzohVar.zzd);
    }

    public final int hashCode() {
        com.google.android.gms.internal.ads.zzfxs zzfxsVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzfxsVar == null ? 0 : zzfxsVar.hashCode());
    }

    public final java.lang.String toString() {
        return "AudioProfile[format=" + this.zzb + ", maxChannelCount=" + this.zzc + ", channelMasks=" + java.lang.String.valueOf(this.zzd) + com.ironsource.y8.i.e;
    }

    public final int zza(int i, com.google.android.gms.internal.ads.zze zzeVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (com.google.android.gms.internal.ads.zzei.zza < 29) {
            java.lang.Integer num = (java.lang.Integer) com.google.android.gms.internal.ads.zzoi.zzb.getOrDefault(java.lang.Integer.valueOf(this.zzb), 0);
            num.getClass();
            return num.intValue();
        }
        int i2 = this.zzb;
        for (int i3 = 10; i3 > 0; i3--) {
            int iZzi = com.google.android.gms.internal.ads.zzei.zzi(i3);
            if (iZzi != 0 && android.media.AudioTrack.isDirectPlaybackSupported(new android.media.AudioFormat.Builder().setEncoding(i2).setSampleRate(i).setChannelMask(iZzi).build(), zzeVar.zza().zza)) {
                return i3;
            }
        }
        return 0;
    }

    public final boolean zzb(int i) {
        if (this.zzd == null) {
            return i <= this.zzc;
        }
        int iZzi = com.google.android.gms.internal.ads.zzei.zzi(i);
        if (iZzi == 0) {
            return false;
        }
        return this.zzd.contains(java.lang.Integer.valueOf(iZzi));
    }
}
