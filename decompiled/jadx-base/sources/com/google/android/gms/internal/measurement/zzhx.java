package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhx extends com.google.android.gms.internal.measurement.zzmd implements com.google.android.gms.internal.measurement.zzni {
    private static final com.google.android.gms.internal.measurement.zzhx zzb;
    private long zzA;
    private int zzB;
    private boolean zzE;
    private int zzH;
    private int zzI;
    private int zzJ;
    private long zzL;
    private long zzM;
    private int zzP;
    private com.google.android.gms.internal.measurement.zzia zzR;
    private long zzT;
    private long zzU;
    private int zzX;
    private boolean zzY;
    private boolean zzaa;
    private com.google.android.gms.internal.measurement.zzhs zzab;
    private long zzaf;
    private boolean zzag;
    private boolean zzai;
    private int zzak;
    private com.google.android.gms.internal.measurement.zzhg zzam;
    private int zzan;
    private com.google.android.gms.internal.measurement.zzhc zzao;
    private com.google.android.gms.internal.measurement.zzim zzaq;
    private long zzar;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private int zzr;
    private long zzv;
    private long zzw;
    private boolean zzy;
    private com.google.android.gms.internal.measurement.zzmj zzg = zzcn();
    private com.google.android.gms.internal.measurement.zzmj zzh = zzcn();
    private java.lang.String zzn = "";
    private java.lang.String zzo = "";
    private java.lang.String zzp = "";
    private java.lang.String zzq = "";
    private java.lang.String zzs = "";
    private java.lang.String zzt = "";
    private java.lang.String zzu = "";
    private java.lang.String zzx = "";
    private java.lang.String zzz = "";
    private java.lang.String zzC = "";
    private java.lang.String zzD = "";
    private com.google.android.gms.internal.measurement.zzmj zzF = zzcn();
    private java.lang.String zzG = "";
    private java.lang.String zzK = "";
    private java.lang.String zzN = "";
    private java.lang.String zzO = "";
    private java.lang.String zzQ = "";
    private com.google.android.gms.internal.measurement.zzmh zzS = zzck();
    private java.lang.String zzV = "";
    private java.lang.String zzW = "";
    private java.lang.String zzZ = "";
    private java.lang.String zzac = "";
    private com.google.android.gms.internal.measurement.zzmj zzad = com.google.android.gms.internal.measurement.zzmd.zzcn();
    private java.lang.String zzae = "";
    private java.lang.String zzah = "";
    private java.lang.String zzaj = "";
    private java.lang.String zzal = "";
    private java.lang.String zzap = "";
    private java.lang.String zzas = "";

    static {
        com.google.android.gms.internal.measurement.zzhx zzhxVar = new com.google.android.gms.internal.measurement.zzhx();
        zzb = zzhxVar;
        com.google.android.gms.internal.measurement.zzmd.zzct(com.google.android.gms.internal.measurement.zzhx.class, zzhxVar);
    }

    private zzhx() {
    }

    public static com.google.android.gms.internal.measurement.zzhw zzA(com.google.android.gms.internal.measurement.zzhx zzhxVar) {
        com.google.android.gms.internal.measurement.zzlz zzlzVarZzcg = zzb.zzcg();
        zzlzVarZzcg.zzaY(zzhxVar);
        return (com.google.android.gms.internal.measurement.zzhw) zzlzVarZzcg;
    }

    static /* synthetic */ void zzZ(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.Iterable iterable) {
        com.google.android.gms.internal.measurement.zzmj zzmjVar = zzhxVar.zzF;
        if (!zzmjVar.zzc()) {
            zzhxVar.zzF = com.google.android.gms.internal.measurement.zzmd.zzco(zzmjVar);
        }
        com.google.android.gms.internal.measurement.zzko.zzcc(iterable, zzhxVar.zzF);
    }

    static /* synthetic */ void zzaA(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.String str) {
        str.getClass();
        zzhxVar.zzd |= 2048;
        zzhxVar.zzs = str;
    }

    static /* synthetic */ void zzaB(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.String str) {
        str.getClass();
        zzhxVar.zzd |= 8192;
        zzhxVar.zzu = str;
    }

    static /* synthetic */ void zzaC(com.google.android.gms.internal.measurement.zzhx zzhxVar, int i) {
        zzhxVar.zzd |= 33554432;
        zzhxVar.zzH = i;
    }

    static /* synthetic */ void zzaD(com.google.android.gms.internal.measurement.zzhx zzhxVar, com.google.android.gms.internal.measurement.zzhg zzhgVar) {
        zzhgVar.getClass();
        zzhxVar.zzam = zzhgVar;
        zzhxVar.zze |= 4194304;
    }

    static /* synthetic */ void zzaE(com.google.android.gms.internal.measurement.zzhx zzhxVar, long j) {
        zzhxVar.zze |= androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE;
        zzhxVar.zzar = j;
    }

    static /* synthetic */ void zzaF(com.google.android.gms.internal.measurement.zzhx zzhxVar, int i) {
        zzhxVar.zzd |= 1048576;
        zzhxVar.zzB = i;
    }

    static /* synthetic */ void zzaG(com.google.android.gms.internal.measurement.zzhx zzhxVar, long j) {
        zzhxVar.zze |= 32;
        zzhxVar.zzU = j;
    }

    static /* synthetic */ void zzaH(com.google.android.gms.internal.measurement.zzhx zzhxVar, long j) {
        zzhxVar.zzd |= 536870912;
        zzhxVar.zzL = j;
    }

    static /* synthetic */ void zzaI(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.String str) {
        zzhxVar.zze |= 131072;
        zzhxVar.zzah = str;
    }

    static /* synthetic */ void zzaJ(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.String str) {
        zzhxVar.zze |= 128;
        zzhxVar.zzW = str;
    }

    static /* synthetic */ void zzaK(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.String str) {
        str.getClass();
        zzhxVar.zze |= 524288;
        zzhxVar.zzaj = str;
    }

    static /* synthetic */ void zzaL(com.google.android.gms.internal.measurement.zzhx zzhxVar, int i) {
        zzhxVar.zze |= 8388608;
        zzhxVar.zzan = i;
    }

    static /* synthetic */ void zzaM(com.google.android.gms.internal.measurement.zzhx zzhxVar, long j) {
        zzhxVar.zzd |= 524288;
        zzhxVar.zzA = j;
    }

    static /* synthetic */ void zzaN(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.String str) {
        str.getClass();
        zzhxVar.zzd |= 256;
        zzhxVar.zzp = str;
    }

    static /* synthetic */ void zzaO(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.String str) {
        str.getClass();
        zzhxVar.zzd |= Integer.MIN_VALUE;
        zzhxVar.zzN = str;
    }

    static /* synthetic */ void zzaP(com.google.android.gms.internal.measurement.zzhx zzhxVar, long j) {
        zzhxVar.zze |= 16;
        zzhxVar.zzT = j;
    }

    static /* synthetic */ void zzaQ(com.google.android.gms.internal.measurement.zzhx zzhxVar, boolean z) {
        zzhxVar.zze |= 65536;
        zzhxVar.zzag = z;
    }

    static /* synthetic */ void zzaR(com.google.android.gms.internal.measurement.zzhx zzhxVar, long j) {
        zzhxVar.zzd |= 8;
        zzhxVar.zzk = j;
    }

    static /* synthetic */ void zzaS(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.String str) {
        str.getClass();
        zzhxVar.zze |= 16384;
        zzhxVar.zzae = str;
    }

    static /* synthetic */ void zzaT(com.google.android.gms.internal.measurement.zzhx zzhxVar, int i, com.google.android.gms.internal.measurement.zzhm zzhmVar) {
        zzhmVar.getClass();
        zzhxVar.zzcx();
        zzhxVar.zzg.set(i, zzhmVar);
    }

    static /* synthetic */ void zzaU(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.String str) {
        zzhxVar.zze |= 268435456;
        zzhxVar.zzas = "";
    }

    static /* synthetic */ void zzaV(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.String str) {
        str.getClass();
        zzhxVar.zzd |= 16777216;
        zzhxVar.zzG = str;
    }

    static /* synthetic */ void zzaW(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.String str) {
        str.getClass();
        zzhxVar.zzd |= 4194304;
        zzhxVar.zzD = str;
    }

    static /* synthetic */ void zzaX(com.google.android.gms.internal.measurement.zzhx zzhxVar, long j) {
        zzhxVar.zzd |= 16384;
        zzhxVar.zzv = j;
    }

    static /* synthetic */ void zzaY(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.String str) {
        zzhxVar.zzd |= 2097152;
        zzhxVar.zzC = str;
    }

    static /* synthetic */ void zzaZ(com.google.android.gms.internal.measurement.zzhx zzhxVar, boolean z) {
        zzhxVar.zze |= 262144;
        zzhxVar.zzai = z;
    }

    static /* synthetic */ void zzaa(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.Iterable iterable) {
        zzhxVar.zzcx();
        com.google.android.gms.internal.measurement.zzko.zzcc(iterable, zzhxVar.zzg);
    }

    static /* synthetic */ void zzab(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.Iterable iterable) {
        com.google.android.gms.internal.measurement.zzmh zzmhVar = zzhxVar.zzS;
        if (!zzmhVar.zzc()) {
            int size = zzmhVar.size();
            zzhxVar.zzS = zzmhVar.zzd(size + size);
        }
        com.google.android.gms.internal.measurement.zzko.zzcc(iterable, zzhxVar.zzS);
    }

    static /* synthetic */ void zzac(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.Iterable iterable) {
        com.google.android.gms.internal.measurement.zzmj zzmjVar = zzhxVar.zzad;
        if (!zzmjVar.zzc()) {
            zzhxVar.zzad = com.google.android.gms.internal.measurement.zzmd.zzco(zzmjVar);
        }
        com.google.android.gms.internal.measurement.zzko.zzcc(iterable, zzhxVar.zzad);
    }

    static /* synthetic */ void zzad(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.Iterable iterable) {
        zzhxVar.zzcy();
        com.google.android.gms.internal.measurement.zzko.zzcc(iterable, zzhxVar.zzh);
    }

    static /* synthetic */ void zzae(com.google.android.gms.internal.measurement.zzhx zzhxVar, com.google.android.gms.internal.measurement.zzhm zzhmVar) {
        zzhmVar.getClass();
        zzhxVar.zzcx();
        zzhxVar.zzg.add(zzhmVar);
    }

    static /* synthetic */ void zzaf(com.google.android.gms.internal.measurement.zzhx zzhxVar, com.google.android.gms.internal.measurement.zzio zzioVar) {
        zzioVar.getClass();
        zzhxVar.zzcy();
        zzhxVar.zzh.add(zzioVar);
    }

    static /* synthetic */ void zzag(com.google.android.gms.internal.measurement.zzhx zzhxVar) {
        zzhxVar.zzd &= -262145;
        zzhxVar.zzz = zzb.zzz;
    }

    static /* synthetic */ void zzai(com.google.android.gms.internal.measurement.zzhx zzhxVar) {
        zzhxVar.zzd &= -257;
        zzhxVar.zzp = zzb.zzp;
    }

    static /* synthetic */ void zzaj(com.google.android.gms.internal.measurement.zzhx zzhxVar) {
        zzhxVar.zzd &= Integer.MAX_VALUE;
        zzhxVar.zzN = zzb.zzN;
    }

    static /* synthetic */ void zzal(com.google.android.gms.internal.measurement.zzhx zzhxVar) {
        zzhxVar.zzd &= -2097153;
        zzhxVar.zzC = zzb.zzC;
    }

    static /* synthetic */ void zzam(com.google.android.gms.internal.measurement.zzhx zzhxVar) {
        zzhxVar.zzd &= -131073;
        zzhxVar.zzy = false;
    }

    static /* synthetic */ void zzan(com.google.android.gms.internal.measurement.zzhx zzhxVar) {
        zzhxVar.zzd &= -33;
        zzhxVar.zzm = 0L;
    }

    static /* synthetic */ void zzao(com.google.android.gms.internal.measurement.zzhx zzhxVar) {
        zzhxVar.zzd &= -17;
        zzhxVar.zzl = 0L;
    }

    static /* synthetic */ void zzap(com.google.android.gms.internal.measurement.zzhx zzhxVar) {
        zzhxVar.zzd &= -65537;
        zzhxVar.zzx = zzb.zzx;
    }

    static /* synthetic */ void zzaq(com.google.android.gms.internal.measurement.zzhx zzhxVar) {
        zzhxVar.zze &= -8193;
        zzhxVar.zzac = zzb.zzac;
    }

    static /* synthetic */ void zzar(com.google.android.gms.internal.measurement.zzhx zzhxVar) {
        zzhxVar.zzd &= -268435457;
        zzhxVar.zzK = zzb.zzK;
    }

    static /* synthetic */ void zzas(com.google.android.gms.internal.measurement.zzhx zzhxVar) {
        zzhxVar.zzd &= -3;
        zzhxVar.zzi = 0L;
    }

    static /* synthetic */ void zzat(com.google.android.gms.internal.measurement.zzhx zzhxVar, int i) {
        zzhxVar.zzcx();
        zzhxVar.zzg.remove(i);
    }

    static /* synthetic */ void zzau(com.google.android.gms.internal.measurement.zzhx zzhxVar, int i) {
        zzhxVar.zzcy();
        zzhxVar.zzh.remove(i);
    }

    static /* synthetic */ void zzav(com.google.android.gms.internal.measurement.zzhx zzhxVar, com.google.android.gms.internal.measurement.zzhc zzhcVar) {
        zzhcVar.getClass();
        zzhxVar.zzao = zzhcVar;
        zzhxVar.zze |= 16777216;
    }

    static /* synthetic */ void zzaw(com.google.android.gms.internal.measurement.zzhx zzhxVar, int i) {
        zzhxVar.zze |= 1048576;
        zzhxVar.zzak = i;
    }

    static /* synthetic */ void zzax(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.String str) {
        str.getClass();
        zzhxVar.zze |= 4;
        zzhxVar.zzQ = str;
    }

    static /* synthetic */ void zzay(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.String str) {
        str.getClass();
        zzhxVar.zzd |= 4096;
        zzhxVar.zzt = str;
    }

    static /* synthetic */ void zzaz(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.String str) {
        str.getClass();
        zzhxVar.zzd |= 262144;
        zzhxVar.zzz = str;
    }

    static /* synthetic */ void zzba(com.google.android.gms.internal.measurement.zzhx zzhxVar, boolean z) {
        zzhxVar.zzd |= 131072;
        zzhxVar.zzy = z;
    }

    static /* synthetic */ void zzbb(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.String str) {
        str.getClass();
        zzhxVar.zzd |= 128;
        zzhxVar.zzo = str;
    }

    static /* synthetic */ void zzbc(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.String str) {
        zzhxVar.zzd |= 64;
        zzhxVar.zzn = "android";
    }

    static /* synthetic */ void zzbd(com.google.android.gms.internal.measurement.zzhx zzhxVar, com.google.android.gms.internal.measurement.zzia zziaVar) {
        zziaVar.getClass();
        zzhxVar.zzR = zziaVar;
        zzhxVar.zze |= 8;
    }

    static /* synthetic */ void zzbe(com.google.android.gms.internal.measurement.zzhx zzhxVar, long j) {
        zzhxVar.zzd |= 32;
        zzhxVar.zzm = j;
    }

    static /* synthetic */ void zzbf(com.google.android.gms.internal.measurement.zzhx zzhxVar, long j) {
        zzhxVar.zzd |= 16;
        zzhxVar.zzl = j;
    }

    static /* synthetic */ void zzbg(com.google.android.gms.internal.measurement.zzhx zzhxVar, int i) {
        zzhxVar.zzd |= 1;
        zzhxVar.zzf = 1;
    }

    static /* synthetic */ void zzbh(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.String str) {
        str.getClass();
        zzhxVar.zzd |= 65536;
        zzhxVar.zzx = str;
    }

    static /* synthetic */ void zzbi(com.google.android.gms.internal.measurement.zzhx zzhxVar, int i) {
        zzhxVar.zze |= 2;
        zzhxVar.zzP = i;
    }

    static /* synthetic */ void zzbj(com.google.android.gms.internal.measurement.zzhx zzhxVar, boolean z) {
        zzhxVar.zzd |= 8388608;
        zzhxVar.zzE = z;
    }

    static /* synthetic */ void zzbk(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.String str) {
        str.getClass();
        zzhxVar.zze |= 8192;
        zzhxVar.zzac = str;
    }

    static /* synthetic */ void zzbl(com.google.android.gms.internal.measurement.zzhx zzhxVar, com.google.android.gms.internal.measurement.zzim zzimVar) {
        zzhxVar.zzaq = zzimVar;
        zzhxVar.zze |= 67108864;
    }

    static /* synthetic */ void zzbm(com.google.android.gms.internal.measurement.zzhx zzhxVar, long j) {
        zzhxVar.zzd |= 4;
        zzhxVar.zzj = j;
    }

    static /* synthetic */ void zzbn(com.google.android.gms.internal.measurement.zzhx zzhxVar, long j) {
        zzhxVar.zze |= 32768;
        zzhxVar.zzaf = j;
    }

    static /* synthetic */ void zzbo(com.google.android.gms.internal.measurement.zzhx zzhxVar, int i) {
        zzhxVar.zzd |= 1024;
        zzhxVar.zzr = i;
    }

    static /* synthetic */ void zzbp(com.google.android.gms.internal.measurement.zzhx zzhxVar, long j) {
        zzhxVar.zzd |= 2;
        zzhxVar.zzi = j;
    }

    static /* synthetic */ void zzbq(com.google.android.gms.internal.measurement.zzhx zzhxVar, long j) {
        zzhxVar.zzd |= 32768;
        zzhxVar.zzw = 119002L;
    }

    static /* synthetic */ void zzbr(com.google.android.gms.internal.measurement.zzhx zzhxVar, int i, com.google.android.gms.internal.measurement.zzio zzioVar) {
        zzioVar.getClass();
        zzhxVar.zzcy();
        zzhxVar.zzh.set(i, zzioVar);
    }

    static /* synthetic */ void zzbs(com.google.android.gms.internal.measurement.zzhx zzhxVar, java.lang.String str) {
        str.getClass();
        zzhxVar.zzd |= 512;
        zzhxVar.zzq = str;
    }

    private final void zzcx() {
        com.google.android.gms.internal.measurement.zzmj zzmjVar = this.zzg;
        if (zzmjVar.zzc()) {
            return;
        }
        this.zzg = com.google.android.gms.internal.measurement.zzmd.zzco(zzmjVar);
    }

    private final void zzcy() {
        com.google.android.gms.internal.measurement.zzmj zzmjVar = this.zzh;
        if (zzmjVar.zzc()) {
            return;
        }
        this.zzh = com.google.android.gms.internal.measurement.zzmd.zzco(zzmjVar);
    }

    public static com.google.android.gms.internal.measurement.zzhw zzz() {
        return (com.google.android.gms.internal.measurement.zzhw) zzb.zzcg();
    }

    public final com.google.android.gms.internal.measurement.zzim zzC() {
        com.google.android.gms.internal.measurement.zzim zzimVar = this.zzaq;
        return zzimVar == null ? com.google.android.gms.internal.measurement.zzim.zzd() : zzimVar;
    }

    public final com.google.android.gms.internal.measurement.zzio zzD(int i) {
        return (com.google.android.gms.internal.measurement.zzio) this.zzh.get(i);
    }

    public final java.lang.String zzE() {
        return this.zzQ;
    }

    public final java.lang.String zzF() {
        return this.zzt;
    }

    public final java.lang.String zzG() {
        return this.zzz;
    }

    public final java.lang.String zzH() {
        return this.zzs;
    }

    public final java.lang.String zzI() {
        return this.zzu;
    }

    public final java.lang.String zzJ() {
        return this.zzah;
    }

    public final java.lang.String zzK() {
        return this.zzW;
    }

    public final java.lang.String zzL() {
        return this.zzaj;
    }

    public final java.lang.String zzM() {
        return this.zzp;
    }

    public final java.lang.String zzN() {
        return this.zzN;
    }

    public final java.lang.String zzO() {
        return this.zzG;
    }

    public final java.lang.String zzP() {
        return this.zzD;
    }

    public final java.lang.String zzQ() {
        return this.zzC;
    }

    public final java.lang.String zzR() {
        return this.zzo;
    }

    public final java.lang.String zzS() {
        return this.zzn;
    }

    public final java.lang.String zzT() {
        return this.zzx;
    }

    public final java.lang.String zzU() {
        return this.zzac;
    }

    public final java.lang.String zzV() {
        return this.zzq;
    }

    public final java.util.List zzW() {
        return this.zzF;
    }

    public final java.util.List zzX() {
        return this.zzg;
    }

    public final java.util.List zzY() {
        return this.zzh;
    }

    public final int zza() {
        return this.zzak;
    }

    public final int zzb() {
        return this.zzH;
    }

    public final boolean zzbA() {
        return (this.zze & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0;
    }

    public final boolean zzbB() {
        return (this.zzd & 1048576) != 0;
    }

    public final boolean zzbC() {
        return (this.zzd & 536870912) != 0;
    }

    public final boolean zzbD() {
        return (this.zze & 131072) != 0;
    }

    public final boolean zzbE() {
        return (this.zze & 128) != 0;
    }

    public final boolean zzbF() {
        return (this.zze & 524288) != 0;
    }

    public final boolean zzbG() {
        return (this.zze & 8388608) != 0;
    }

    public final boolean zzbH() {
        return (this.zzd & 524288) != 0;
    }

    public final boolean zzbI() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final boolean zzbJ() {
        return (this.zze & 16) != 0;
    }

    public final boolean zzbK() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzbL() {
        return (this.zzd & 16384) != 0;
    }

    public final boolean zzbM() {
        return (this.zze & 262144) != 0;
    }

    public final boolean zzbN() {
        return (this.zzd & 131072) != 0;
    }

    public final boolean zzbO() {
        return (this.zzd & 32) != 0;
    }

    public final boolean zzbP() {
        return (this.zzd & 16) != 0;
    }

    public final boolean zzbQ() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzbR() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzbS() {
        return (this.zzd & 8388608) != 0;
    }

    public final boolean zzbT() {
        return (this.zze & 8192) != 0;
    }

    public final boolean zzbU() {
        return (this.zze & 67108864) != 0;
    }

    public final boolean zzbV() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzbW() {
        return (this.zze & 32768) != 0;
    }

    public final boolean zzbX() {
        return (this.zzd & 1024) != 0;
    }

    public final boolean zzbY() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzbZ() {
        return (this.zzd & 32768) != 0;
    }

    public final boolean zzbt() {
        return this.zzag;
    }

    public final boolean zzbu() {
        return this.zzai;
    }

    public final boolean zzbv() {
        return this.zzy;
    }

    public final boolean zzbw() {
        return this.zzE;
    }

    public final boolean zzbx() {
        return (this.zze & 16777216) != 0;
    }

    public final boolean zzby() {
        return (this.zzd & 33554432) != 0;
    }

    public final boolean zzbz() {
        return (this.zze & 4194304) != 0;
    }

    public final int zzc() {
        return this.zzB;
    }

    public final int zzd() {
        return this.zzan;
    }

    public final int zze() {
        return this.zzg.size();
    }

    public final int zzf() {
        return this.zzf;
    }

    public final int zzg() {
        return this.zzP;
    }

    public final int zzh() {
        return this.zzr;
    }

    public final int zzi() {
        return this.zzh.size();
    }

    public final long zzj() {
        return this.zzar;
    }

    public final long zzk() {
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzb, "\u0004B\u0000\u0002\u0001SB\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", com.google.android.gms.internal.measurement.zzhm.class, "zzh", com.google.android.gms.internal.measurement.zzio.class, "zzi", "zzj", "zzk", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzl", "zzE", "zzF", com.google.android.gms.internal.measurement.zzhi.class, "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", com.google.android.gms.internal.measurement.zzha.zza, "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzhx();
        }
        com.google.android.gms.internal.measurement.zzip zzipVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzhw(zzipVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final long zzm() {
        return this.zzA;
    }

    public final long zzn() {
        return this.zzT;
    }

    public final long zzo() {
        return this.zzk;
    }

    public final long zzp() {
        return this.zzv;
    }

    public final long zzq() {
        return this.zzm;
    }

    public final long zzr() {
        return this.zzl;
    }

    public final long zzs() {
        return this.zzj;
    }

    public final long zzt() {
        return this.zzaf;
    }

    public final long zzu() {
        return this.zzi;
    }

    public final long zzv() {
        return this.zzw;
    }

    public final com.google.android.gms.internal.measurement.zzhc zzw() {
        com.google.android.gms.internal.measurement.zzhc zzhcVar = this.zzao;
        return zzhcVar == null ? com.google.android.gms.internal.measurement.zzhc.zze() : zzhcVar;
    }

    public final com.google.android.gms.internal.measurement.zzhg zzx() {
        com.google.android.gms.internal.measurement.zzhg zzhgVar = this.zzam;
        return zzhgVar == null ? com.google.android.gms.internal.measurement.zzhg.zzc() : zzhgVar;
    }

    public final com.google.android.gms.internal.measurement.zzhm zzy(int i) {
        return (com.google.android.gms.internal.measurement.zzhm) this.zzg.get(i);
    }
}
