package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbfg extends com.google.android.gms.internal.ads.zzbfo {
    static final int zza;
    static final int zzb;
    private static final int zzc;
    private final java.lang.String zzd;
    private final java.util.List zze = new java.util.ArrayList();
    private final java.util.List zzf = new java.util.ArrayList();
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;

    static {
        int iRgb = android.graphics.Color.rgb(12, org.objectweb.asm.Opcodes.FRETURN, com.ironsource.g3.c.b.g);
        zzc = iRgb;
        zza = android.graphics.Color.rgb(204, 204, 204);
        zzb = iRgb;
    }

    public zzbfg(java.lang.String str, java.util.List list, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, int i, int i2, boolean z) {
        this.zzd = str;
        for (int i3 = 0; i3 < list.size(); i3++) {
            com.google.android.gms.internal.ads.zzbfj zzbfjVar = (com.google.android.gms.internal.ads.zzbfj) list.get(i3);
            this.zze.add(zzbfjVar);
            this.zzf.add(zzbfjVar);
        }
        this.zzg = num != null ? num.intValue() : zza;
        this.zzh = num2 != null ? num2.intValue() : zzb;
        this.zzi = num3 != null ? num3.intValue() : 12;
        this.zzj = i;
        this.zzk = i2;
    }

    public final int zzb() {
        return this.zzj;
    }

    public final int zzc() {
        return this.zzk;
    }

    public final int zzd() {
        return this.zzg;
    }

    public final int zze() {
        return this.zzh;
    }

    public final int zzf() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzbfp
    public final java.lang.String zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbfp
    public final java.util.List zzh() {
        return this.zzf;
    }

    public final java.util.List zzi() {
        return this.zze;
    }
}
