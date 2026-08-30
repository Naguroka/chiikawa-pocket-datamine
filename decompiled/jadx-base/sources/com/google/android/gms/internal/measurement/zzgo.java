package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgo extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzgo zzb;
    private int zzd;
    private long zze;
    private int zzg;
    private boolean zzl;
    private com.google.android.gms.internal.measurement.zzgi zzq;
    private com.google.android.gms.internal.measurement.zzgs zzr;
    private com.google.android.gms.internal.measurement.zzgy zzs;
    private com.google.android.gms.internal.measurement.zzgu zzt;
    private com.google.android.gms.internal.measurement.zzgq zzu;
    private java.lang.String zzf = "";
    private com.google.android.gms.internal.measurement.zzmj zzh = zzcn();
    private com.google.android.gms.internal.measurement.zzmj zzi = zzcn();
    private com.google.android.gms.internal.measurement.zzmj zzj = zzcn();
    private java.lang.String zzk = "";
    private com.google.android.gms.internal.measurement.zzmj zzm = zzcn();
    private com.google.android.gms.internal.measurement.zzmj zzn = zzcn();
    private java.lang.String zzo = "";
    private java.lang.String zzp = "";

    static {
        com.google.android.gms.internal.measurement.zzgo zzgoVar = new com.google.android.gms.internal.measurement.zzgo();
        zzb = zzgoVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzgo.class, zzgoVar);
    }

    private zzgo() {
    }

    public static com.google.android.gms.internal.measurement.zzgn zzf() {
        return (com.google.android.gms.internal.measurement.zzgn) zzb.zzcg();
    }

    public static com.google.android.gms.internal.measurement.zzgo zzh() {
        return zzb;
    }

    static /* synthetic */ void zzs(com.google.android.gms.internal.measurement.zzgo zzgoVar, int i, com.google.android.gms.internal.measurement.zzgm zzgmVar) {
        zzgmVar.getClass();
        com.google.android.gms.internal.measurement.zzmj zzmjVar = zzgoVar.zzi;
        if (!zzmjVar.zzc()) {
            zzgoVar.zzi = com.google.android.gms.internal.measurement.zzmd.zzco(zzmjVar);
        }
        zzgoVar.zzi.set(i, zzgmVar);
    }

    public final int zza() {
        return this.zzm.size();
    }

    public final int zzb() {
        return this.zzi.size();
    }

    public final long zzc() {
        return this.zze;
    }

    public final com.google.android.gms.internal.measurement.zzgi zzd() {
        com.google.android.gms.internal.measurement.zzgi zzgiVar = this.zzq;
        return zzgiVar == null ? com.google.android.gms.internal.measurement.zzgi.zzb() : zzgiVar;
    }

    public final com.google.android.gms.internal.measurement.zzgm zze(int i) {
        return (com.google.android.gms.internal.measurement.zzgm) this.zzi.get(i);
    }

    public final com.google.android.gms.internal.measurement.zzgy zzi() {
        com.google.android.gms.internal.measurement.zzgy zzgyVar = this.zzs;
        return zzgyVar == null ? com.google.android.gms.internal.measurement.zzgy.zzc() : zzgyVar;
    }

    public final java.lang.String zzj() {
        return this.zzf;
    }

    public final java.lang.String zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", "zzh", com.google.android.gms.internal.measurement.zzgw.class, "zzi", com.google.android.gms.internal.measurement.zzgm.class, "zzj", com.google.android.gms.internal.measurement.zzfh.class, "zzk", "zzl", "zzm", com.google.android.gms.internal.measurement.zziv.class, "zzn", com.google.android.gms.internal.measurement.zzgk.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzgo();
        }
        com.google.android.gms.internal.measurement.zzgz zzgzVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzgn(zzgzVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final java.util.List zzm() {
        return this.zzj;
    }

    public final java.util.List zzn() {
        return this.zzn;
    }

    public final java.util.List zzo() {
        return this.zzm;
    }

    public final java.util.List zzp() {
        return this.zzh;
    }

    public final boolean zzt() {
        return (this.zzd & 128) != 0;
    }

    public final boolean zzu() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzv() {
        return (this.zzd & 512) != 0;
    }

    public final boolean zzw() {
        return (this.zzd & 1) != 0;
    }
}
