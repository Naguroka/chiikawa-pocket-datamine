package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzasy extends com.google.android.gms.internal.ads.zzgxr implements com.google.android.gms.internal.ads.zzgzd {
    private static final com.google.android.gms.internal.ads.zzasy zza;
    private static volatile com.google.android.gms.internal.ads.zzgzk zzb;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzE;
    private long zzI;
    private long zzJ;
    private long zzK;
    private long zzM;
    private com.google.android.gms.internal.ads.zzata zzP;
    private com.google.android.gms.internal.ads.zzast zzaG;
    private long zzaM;
    private com.google.android.gms.internal.ads.zzasl zzaP;
    private com.google.android.gms.internal.ads.zzasn zzaQ;
    private int zzaT;
    private long zzaU;
    private boolean zzaX;
    private long zzaZ;
    private com.google.android.gms.internal.ads.zzasv zzah;
    private com.google.android.gms.internal.ads.zzasx zzaj;
    private int zzau;
    private int zzav;
    private int zzaw;
    private int zzax;
    private com.google.android.gms.internal.ads.zzatl zzay;
    private com.google.android.gms.internal.ads.zzatj zzba;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzu;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private java.lang.String zzv = "";
    private java.lang.String zzF = "";
    private java.lang.String zzG = "D";
    private java.lang.String zzH = "";
    private java.lang.String zzL = "";
    private long zzN = -1;
    private long zzO = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private long zzU = -1;
    private long zzV = -1;
    private java.lang.String zzW = "D";
    private java.lang.String zzX = "D";
    private long zzY = -1;
    private int zzZ = 1000;
    private int zzaa = 1000;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private long zzae = -1;
    private long zzaf = -1;
    private int zzag = 1000;
    private com.google.android.gms.internal.ads.zzgyd zzai = zzbK();
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private long zzap = -1;
    private long zzaq = -1;
    private long zzar = -1;
    private java.lang.String zzas = "D";
    private long zzat = -1;
    private long zzaz = -1;
    private int zzaA = 1000;
    private int zzaB = 1000;
    private java.lang.String zzaC = "D";
    private com.google.android.gms.internal.ads.zzgyd zzaD = zzbK();
    private int zzaE = 1000;
    private com.google.android.gms.internal.ads.zzgyd zzaF = zzbK();
    private java.lang.String zzaH = "";
    private long zzaI = -1;
    private long zzaJ = -1;
    private long zzaK = -1;
    private long zzaL = -1;
    private long zzaN = -1;
    private java.lang.String zzaO = "";
    private long zzaR = -1;
    private long zzaS = -1;
    private java.lang.String zzaV = "";
    private int zzaW = 2;
    private java.lang.String zzaY = "";
    private long zzbb = -1;
    private java.lang.String zzbc = "";

    static {
        com.google.android.gms.internal.ads.zzasy zzasyVar = new com.google.android.gms.internal.ads.zzasy();
        zza = zzasyVar;
        com.google.android.gms.internal.ads.zzgxr.zzbZ(com.google.android.gms.internal.ads.zzasy.class, zzasyVar);
    }

    private zzasy() {
    }

    static /* synthetic */ void zzA(com.google.android.gms.internal.ads.zzasy zzasyVar, java.lang.String str) {
        str.getClass();
        zzasyVar.zze |= 8388608;
        zzasyVar.zzaV = str;
    }

    static /* synthetic */ void zzB(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zze |= androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE;
        zzasyVar.zzaZ = j;
    }

    static /* synthetic */ void zzC(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zze |= 8192;
        zzasyVar.zzaL = j;
    }

    static /* synthetic */ void zzD(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zze |= 4096;
        zzasyVar.zzaK = j;
    }

    static /* synthetic */ void zzE(com.google.android.gms.internal.ads.zzasy zzasyVar, java.lang.String str) {
        str.getClass();
        zzasyVar.zzd |= 256;
        zzasyVar.zzX = str;
    }

    static /* synthetic */ void zzF(com.google.android.gms.internal.ads.zzasy zzasyVar, java.lang.String str) {
        str.getClass();
        zzasyVar.zzc |= 4194304;
        zzasyVar.zzF = str;
    }

    static /* synthetic */ void zzG(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzc |= 1048576;
        zzasyVar.zzD = j;
    }

    static /* synthetic */ void zzH(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzc |= 1024;
        zzasyVar.zzp = j;
    }

    static /* synthetic */ void zzI(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzc |= 2048;
        zzasyVar.zzu = j;
    }

    static /* synthetic */ void zzJ(com.google.android.gms.internal.ads.zzasy zzasyVar, java.lang.String str) {
        str.getClass();
        zzasyVar.zzc |= 1;
        zzasyVar.zzf = str;
    }

    static /* synthetic */ void zzK(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzd |= 4194304;
        zzasyVar.zzam = j;
    }

    static /* synthetic */ void zzL(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzc |= 524288;
        zzasyVar.zzC = j;
    }

    static /* synthetic */ void zzM(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzd |= 8388608;
        zzasyVar.zzan = j;
    }

    static /* synthetic */ void zzN(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzd |= 64;
        zzasyVar.zzV = j;
    }

    static /* synthetic */ void zzO(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzd |= 16;
        zzasyVar.zzT = j;
    }

    static /* synthetic */ void zzP(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzc |= Integer.MIN_VALUE;
        zzasyVar.zzO = j;
    }

    static /* synthetic */ void zzQ(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzd |= 8;
        zzasyVar.zzS = j;
    }

    static /* synthetic */ void zzR(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzd |= 4;
        zzasyVar.zzR = j;
    }

    static /* synthetic */ void zzS(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzc |= 1073741824;
        zzasyVar.zzN = j;
    }

    static /* synthetic */ void zzT(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzc |= 32768;
        zzasyVar.zzy = j;
    }

    static /* synthetic */ void zzU(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzd |= 2;
        zzasyVar.zzQ = j;
    }

    static /* synthetic */ void zzV(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzc |= 8192;
        zzasyVar.zzw = j;
    }

    static /* synthetic */ void zzW(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzc |= 16384;
        zzasyVar.zzx = j;
    }

    static /* synthetic */ void zzX(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzd |= 16384;
        zzasyVar.zzad = j;
    }

    static /* synthetic */ void zzY(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zze |= 1024;
        zzasyVar.zzaI = j;
    }

    static /* synthetic */ void zzZ(com.google.android.gms.internal.ads.zzasy zzasyVar, com.google.android.gms.internal.ads.zzasv zzasvVar) {
        zzasvVar.getClass();
        zzasyVar.zzah = zzasvVar;
        zzasyVar.zzd |= 262144;
    }

    public static com.google.android.gms.internal.ads.zzasc zza() {
        return (com.google.android.gms.internal.ads.zzasc) zza.zzaZ();
    }

    static /* synthetic */ void zzaa(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzc |= 67108864;
        zzasyVar.zzJ = j;
    }

    static /* synthetic */ void zzab(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzc |= 65536;
        zzasyVar.zzz = j;
    }

    static /* synthetic */ void zzac(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzc |= 2097152;
        zzasyVar.zzE = j;
    }

    static /* synthetic */ void zzad(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzc |= androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE;
        zzasyVar.zzK = j;
    }

    static /* synthetic */ void zzae(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzc |= 33554432;
        zzasyVar.zzI = j;
    }

    static /* synthetic */ void zzaf(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzc |= 536870912;
        zzasyVar.zzM = j;
    }

    static /* synthetic */ void zzag(com.google.android.gms.internal.ads.zzasy zzasyVar, com.google.android.gms.internal.ads.zzasx zzasxVar) {
        zzasxVar.getClass();
        zzasyVar.zzaj = zzasxVar;
        zzasyVar.zzd |= 524288;
    }

    static /* synthetic */ void zzah(com.google.android.gms.internal.ads.zzasy zzasyVar, java.lang.String str) {
        str.getClass();
        zzasyVar.zzc |= 268435456;
        zzasyVar.zzL = str;
    }

    static /* synthetic */ void zzam(com.google.android.gms.internal.ads.zzasy zzasyVar, int i) {
        zzasyVar.zzaa = i - 1;
        zzasyVar.zzd |= 2048;
    }

    static /* synthetic */ void zzan(com.google.android.gms.internal.ads.zzasy zzasyVar, int i) {
        zzasyVar.zzaW = 5;
        zzasyVar.zze |= 16777216;
    }

    static /* synthetic */ void zzao(com.google.android.gms.internal.ads.zzasy zzasyVar, int i) {
        zzasyVar.zzag = i - 1;
        zzasyVar.zzd |= 131072;
    }

    static /* synthetic */ void zzap(com.google.android.gms.internal.ads.zzasy zzasyVar, int i) {
        zzasyVar.zzaB = i - 1;
        zzasyVar.zze |= 32;
    }

    static /* synthetic */ void zzaq(com.google.android.gms.internal.ads.zzasy zzasyVar, int i) {
        zzasyVar.zzaT = i - 1;
        zzasyVar.zze |= 2097152;
    }

    static /* synthetic */ void zzar(com.google.android.gms.internal.ads.zzasy zzasyVar, int i) {
        zzasyVar.zzaA = i - 1;
        zzasyVar.zze |= 16;
    }

    static /* synthetic */ void zzas(com.google.android.gms.internal.ads.zzasy zzasyVar, int i) {
        zzasyVar.zzZ = i - 1;
        zzasyVar.zzd |= 1024;
    }

    public static com.google.android.gms.internal.ads.zzasy zzc() {
        return zza;
    }

    public static com.google.android.gms.internal.ads.zzasy zzd(byte[] bArr, com.google.android.gms.internal.ads.zzgxb zzgxbVar) throws com.google.android.gms.internal.ads.zzgyg {
        return (com.google.android.gms.internal.ads.zzasy) com.google.android.gms.internal.ads.zzgxr.zzbx(zza, bArr, zzgxbVar);
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzasy zzasyVar, com.google.android.gms.internal.ads.zzasv zzasvVar) {
        zzasvVar.getClass();
        com.google.android.gms.internal.ads.zzgyd zzgydVar = zzasyVar.zzai;
        if (!zzgydVar.zzc()) {
            zzasyVar.zzai = com.google.android.gms.internal.ads.zzgxr.zzbL(zzgydVar);
        }
        zzasyVar.zzai.add(zzasvVar);
    }

    static /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzd |= 67108864;
        zzasyVar.zzaq = j;
    }

    static /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzasy zzasyVar, java.lang.String str) {
        str.getClass();
        zzasyVar.zzd |= 268435456;
        zzasyVar.zzas = str;
    }

    static /* synthetic */ void zzm(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzd |= androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE;
        zzasyVar.zzar = j;
    }

    static /* synthetic */ void zzn(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zze |= 2048;
        zzasyVar.zzaJ = j;
    }

    static /* synthetic */ void zzo(com.google.android.gms.internal.ads.zzasy zzasyVar, java.lang.String str) {
        str.getClass();
        zzasyVar.zze |= 65536;
        zzasyVar.zzaO = str;
    }

    static /* synthetic */ void zzp(com.google.android.gms.internal.ads.zzasy zzasyVar, java.lang.String str) {
        str.getClass();
        zzasyVar.zzc |= 2;
        zzasyVar.zzg = str;
    }

    static /* synthetic */ void zzq(com.google.android.gms.internal.ads.zzasy zzasyVar, java.lang.String str) {
        str.getClass();
        zzasyVar.zzd |= 128;
        zzasyVar.zzW = str;
    }

    static /* synthetic */ void zzr(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzc |= 4;
        zzasyVar.zzh = j;
    }

    static /* synthetic */ void zzs(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzd |= 2097152;
        zzasyVar.zzal = j;
    }

    static /* synthetic */ void zzt(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzc |= 32;
        zzasyVar.zzk = j;
    }

    static /* synthetic */ void zzu(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzc |= 16;
        zzasyVar.zzj = j;
    }

    static /* synthetic */ void zzv(com.google.android.gms.internal.ads.zzasy zzasyVar, java.lang.String str) {
        str.getClass();
        zzasyVar.zzc |= 16777216;
        zzasyVar.zzH = str;
    }

    static /* synthetic */ void zzw(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzd |= 32;
        zzasyVar.zzU = j;
    }

    static /* synthetic */ void zzx(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzd |= 4096;
        zzasyVar.zzab = j;
    }

    static /* synthetic */ void zzy(com.google.android.gms.internal.ads.zzasy zzasyVar, long j) {
        zzasyVar.zzd |= 8192;
        zzasyVar.zzac = j;
    }

    static /* synthetic */ void zzz(com.google.android.gms.internal.ads.zzasy zzasyVar, boolean z) {
        zzasyVar.zze |= 33554432;
        zzasyVar.zzaX = z;
    }

    public final boolean zzai() {
        return this.zzaX;
    }

    public final boolean zzaj() {
        return (this.zzc & 4194304) != 0;
    }

    public final boolean zzak() {
        return (this.zze & 268435456) != 0;
    }

    public final int zzal() {
        int iZza = com.google.android.gms.internal.ads.zzash.zza(this.zzaW);
        if (iZza == 0) {
            return 3;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzgxq zzgxqVar, java.lang.Object obj, java.lang.Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            com.google.android.gms.internal.ads.zzgxx zzgxxVar = com.google.android.gms.internal.ads.zzate.zza;
            return zzbQ(zza, "\u0001b\u0000\u0003\u0001Įb\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂV\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈW\u0019ဂ[\u001a᠌X\u001bဈ\u0016\u001cဇY\u001dဈ\u0018\u001eဈZ\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌AEဉBFဂCGဂ8Hဂ9I᠌DJဂ)Kဈ\u0017L᠌EMဈFN\u001bO᠌GP\u001bQဉHRဈISဂJTဂKUဂLVဂMWဂNXဂOYဈPZဉQ[ဉR\\ဂS]ဂT^᠌U_᠌@Éဉ\\ĭဂ]Įဈ^", new java.lang.Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzaU", "zzD", "zzE", "zzaV", "zzaZ", "zzaW", com.google.android.gms.internal.ads.zzasg.zza, "zzF", "zzaX", "zzH", "zzaY", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzai", com.google.android.gms.internal.ads.zzasv.class, "zzU", "zzV", "zzW", "zzX", "zzZ", zzgxxVar, "zzaa", zzgxxVar, "zzah", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", zzgxxVar, "zzaj", "zzak", "zzal", "zzam", "zzan", "zzaq", "zzar", "zzat", "zzau", com.google.android.gms.internal.ads.zzatd.zza, "zzav", com.google.android.gms.internal.ads.zzath.zza, "zzas", "zzax", com.google.android.gms.internal.ads.zzasd.zza, "zzay", "zzaz", "zzao", "zzap", "zzaA", zzgxxVar, "zzY", "zzG", "zzaB", zzgxxVar, "zzaC", "zzaD", com.google.android.gms.internal.ads.zzasr.class, "zzaE", zzgxxVar, "zzaF", com.google.android.gms.internal.ads.zzasf.class, "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", "zzaQ", "zzaR", "zzaS", "zzaT", com.google.android.gms.internal.ads.zzaso.zza, "zzaw", com.google.android.gms.internal.ads.zzasi.zza, "zzba", "zzbb", "zzbc"});
        }
        if (iOrdinal == 3) {
            return new com.google.android.gms.internal.ads.zzasy();
        }
        com.google.android.gms.internal.ads.zzato zzatoVar = null;
        if (iOrdinal == 4) {
            return new com.google.android.gms.internal.ads.zzasc(zzatoVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzasy.class) {
                zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    zzgxmVar = new com.google.android.gms.internal.ads.zzgxm(zza);
                    zzb = zzgxmVar;
                }
            }
        }
        return zzgxmVar;
    }

    public final com.google.android.gms.internal.ads.zzatj zzf() {
        com.google.android.gms.internal.ads.zzatj zzatjVar = this.zzba;
        return zzatjVar == null ? com.google.android.gms.internal.ads.zzatj.zzc() : zzatjVar;
    }

    public final java.lang.String zzg() {
        return this.zzaV;
    }

    public final java.lang.String zzh() {
        return this.zzF;
    }
}
