package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfj extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzfj zzb;
    private int zzd;
    private int zze;
    private java.lang.String zzf = "";
    private com.google.android.gms.internal.measurement.zzmj zzg = zzcn();
    private boolean zzh;
    private com.google.android.gms.internal.measurement.zzfp zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        com.google.android.gms.internal.measurement.zzfj zzfjVar = new com.google.android.gms.internal.measurement.zzfj();
        zzb = zzfjVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzfj.class, zzfjVar);
    }

    private zzfj() {
    }

    public static com.google.android.gms.internal.measurement.zzfi zzc() {
        return (com.google.android.gms.internal.measurement.zzfi) zzb.zzcg();
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.measurement.zzfj zzfjVar, java.lang.String str) {
        zzfjVar.zzd |= 2;
        zzfjVar.zzf = str;
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.measurement.zzfj zzfjVar, int i, com.google.android.gms.internal.measurement.zzfl zzflVar) {
        zzflVar.getClass();
        com.google.android.gms.internal.measurement.zzmj zzmjVar = zzfjVar.zzg;
        if (!zzmjVar.zzc()) {
            zzfjVar.zzg = com.google.android.gms.internal.measurement.zzmd.zzco(zzmjVar);
        }
        zzfjVar.zzg.set(i, zzflVar);
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final com.google.android.gms.internal.measurement.zzfl zze(int i) {
        return (com.google.android.gms.internal.measurement.zzfl) this.zzg.get(i);
    }

    public final com.google.android.gms.internal.measurement.zzfp zzf() {
        com.google.android.gms.internal.measurement.zzfp zzfpVar = this.zzi;
        return zzfpVar == null ? com.google.android.gms.internal.measurement.zzfp.zzb() : zzfpVar;
    }

    public final java.lang.String zzg() {
        return this.zzf;
    }

    public final java.util.List zzh() {
        return this.zzg;
    }

    public final boolean zzk() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", com.google.android.gms.internal.measurement.zzfl.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzfj();
        }
        com.google.android.gms.internal.measurement.zzfw zzfwVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzfi(zzfwVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final boolean zzm() {
        return this.zzk;
    }

    public final boolean zzn() {
        return this.zzl;
    }

    public final boolean zzo() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzp() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzq() {
        return (this.zzd & 64) != 0;
    }
}
