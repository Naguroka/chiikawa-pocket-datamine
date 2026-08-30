package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhdm extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzhdm zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private com.google.android.gms.internal.ads.zzhdi zzC;
    private com.google.android.gms.internal.ads.zzhbt zzE;
    private com.google.android.gms.internal.ads.zzhbl zzG;
    private com.google.android.gms.internal.ads.zzhcm zzI;
    private int zzJ;
    private long zzM;
    private com.google.android.gms.internal.ads.zzhdl zzN;
    private com.google.android.gms.internal.ads.zzhcr zzO;
    private int zzc;
    private int zzd;
    private int zze;
    private com.google.android.gms.internal.ads.zzhbp zzi;
    private com.google.android.gms.internal.ads.zzhcx zzm;
    private boolean zzn;
    private boolean zzu;
    private boolean zzv;
    private com.google.android.gms.internal.ads.zzhde zzx;
    private boolean zzy;
    private byte zzQ = 2;
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private java.lang.String zzh = "";
    private com.google.android.gms.internal.ads.zzgyd zzj = zzbK();
    private com.google.android.gms.internal.ads.zzgyd zzk = zzbK();
    private java.lang.String zzl = "";
    private com.google.android.gms.internal.ads.zzgyd zzo = com.google.android.gms.internal.ads.zzgxr.zzbK();
    private java.lang.String zzp = "";
    private com.google.android.gms.internal.ads.zzgwj zzw = com.google.android.gms.internal.ads.zzgwj.zzb;
    private java.lang.String zzz = "";
    private com.google.android.gms.internal.ads.zzgyd zzA = com.google.android.gms.internal.ads.zzgxr.zzbK();
    private com.google.android.gms.internal.ads.zzgyd zzB = com.google.android.gms.internal.ads.zzgxr.zzbK();
    private com.google.android.gms.internal.ads.zzgyd zzD = zzbK();
    private java.lang.String zzF = "";
    private com.google.android.gms.internal.ads.zzgyd zzH = zzbK();
    private com.google.android.gms.internal.ads.zzgyd zzK = zzbK();
    private com.google.android.gms.internal.ads.zzgyd zzL = zzbK();
    private java.lang.String zzP = "";

    static {
        com.google.android.gms.internal.ads.zzhdm zzhdmVar = new com.google.android.gms.internal.ads.zzhdm();
        zza = zzhdmVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzhdm.class, zzhdmVar);
    }

    private zzhdm() {
    }

    public static com.google.android.gms.internal.ads.zzhbn zzc() {
        return (com.google.android.gms.internal.ads.zzhbn) zza.zzaZ();
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzhdm zzhdmVar, java.lang.Iterable iterable) {
        com.google.android.gms.internal.ads.zzgyd zzgydVar = zzhdmVar.zzA;
        if (!zzgydVar.zzc()) {
            zzhdmVar.zzA = com.google.android.gms.internal.ads.zzgxr.zzbL(zzgydVar);
        }
        com.google.android.gms.internal.ads.zzgvs.zzaQ(iterable, zzhdmVar.zzA);
    }

    static /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzhdm zzhdmVar, java.lang.Iterable iterable) {
        com.google.android.gms.internal.ads.zzgyd zzgydVar = zzhdmVar.zzB;
        if (!zzgydVar.zzc()) {
            zzhdmVar.zzB = com.google.android.gms.internal.ads.zzgxr.zzbL(zzgydVar);
        }
        com.google.android.gms.internal.ads.zzgvs.zzaQ(iterable, zzhdmVar.zzB);
    }

    static /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzhdm zzhdmVar, com.google.android.gms.internal.ads.zzhdc zzhdcVar) {
        zzhdcVar.getClass();
        com.google.android.gms.internal.ads.zzgyd zzgydVar = zzhdmVar.zzj;
        if (!zzgydVar.zzc()) {
            zzhdmVar.zzj = com.google.android.gms.internal.ads.zzgxr.zzbL(zzgydVar);
        }
        zzhdmVar.zzj.add(zzhdcVar);
    }

    static /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzhdm zzhdmVar) {
        zzhdmVar.zzc &= -65;
        zzhdmVar.zzl = zza.zzl;
    }

    static /* synthetic */ void zzm(com.google.android.gms.internal.ads.zzhdm zzhdmVar, java.lang.String str) {
        zzhdmVar.zzc |= 64;
        zzhdmVar.zzl = str;
    }

    static /* synthetic */ void zzn(com.google.android.gms.internal.ads.zzhdm zzhdmVar, com.google.android.gms.internal.ads.zzhde zzhdeVar) {
        zzhdeVar.getClass();
        zzhdmVar.zzx = zzhdeVar;
        zzhdmVar.zzc |= 8192;
    }

    static /* synthetic */ void zzo(com.google.android.gms.internal.ads.zzhdm zzhdmVar, com.google.android.gms.internal.ads.zzhbp zzhbpVar) {
        zzhbpVar.getClass();
        zzhdmVar.zzi = zzhbpVar;
        zzhdmVar.zzc |= 32;
    }

    static /* synthetic */ void zzp(com.google.android.gms.internal.ads.zzhdm zzhdmVar, java.lang.String str) {
        str.getClass();
        zzhdmVar.zzc |= 8;
        zzhdmVar.zzg = str;
    }

    static /* synthetic */ void zzq(com.google.android.gms.internal.ads.zzhdm zzhdmVar, com.google.android.gms.internal.ads.zzhcx zzhcxVar) {
        zzhcxVar.getClass();
        zzhdmVar.zzm = zzhcxVar;
        zzhdmVar.zzc |= 128;
    }

    static /* synthetic */ void zzr(com.google.android.gms.internal.ads.zzhdm zzhdmVar, java.lang.String str) {
        str.getClass();
        zzhdmVar.zzc |= 4;
        zzhdmVar.zzf = str;
    }

    static /* synthetic */ void zzs(com.google.android.gms.internal.ads.zzhdm zzhdmVar, int i) {
        zzhdmVar.zzd = i - 1;
        zzhdmVar.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.zzhdx zzhdxVar = null;
        switch (zzgxqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return java.lang.Byte.valueOf(this.zzQ);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzQ = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbQ(zza, "\u0001#\u0000\u0001\u0001##\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019", new java.lang.Object[]{"zzc", "zzf", "zzg", "zzh", "zzj", com.google.android.gms.internal.ads.zzhdc.class, "zzn", "zzo", "zzp", "zzu", "zzv", "zzd", com.google.android.gms.internal.ads.zzhcy.zza, "zze", com.google.android.gms.internal.ads.zzhbm.zza, "zzi", "zzl", "zzm", "zzw", "zzk", com.google.android.gms.internal.ads.zzhdq.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", com.google.android.gms.internal.ads.zzhdw.class, "zzE", "zzF", "zzG", "zzH", com.google.android.gms.internal.ads.zzhbx.class, "zzI", "zzJ", com.google.android.gms.internal.ads.zzhdg.zza, "zzK", com.google.android.gms.internal.ads.zzhcp.class, "zzL", com.google.android.gms.internal.ads.zzhcu.class, "zzM", "zzN", "zzO", "zzP"});
            case NEW_MUTABLE_INSTANCE:
                return new com.google.android.gms.internal.ads.zzhdm();
            case NEW_BUILDER:
                return new com.google.android.gms.internal.ads.zzhbn(zzhdxVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    synchronized (com.google.android.gms.internal.ads.zzhdm.class) {
                        zzgxmVar = zzb;
                        if (zzgxmVar == null) {
                            zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zza);
                            zzb = zzgxmVar;
                        }
                        break;
                    }
                }
                return zzgxmVar;
            default:
                throw null;
        }
    }

    public final java.lang.String zzf() {
        return this.zzl;
    }

    public final java.lang.String zzg() {
        return this.zzf;
    }

    public final java.util.List zzh() {
        return this.zzj;
    }
}
