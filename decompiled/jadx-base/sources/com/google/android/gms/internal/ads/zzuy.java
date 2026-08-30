package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzuy extends com.google.android.gms.internal.ads.zzto {
    private static final com.google.android.gms.internal.ads.zzar zza;
    private final com.google.android.gms.internal.ads.zzui[] zzb;
    private final java.util.List zzc;
    private final com.google.android.gms.internal.ads.zzbq[] zzd;
    private final java.util.ArrayList zze;
    private int zzf = -1;
    private long[][] zzg;
    private com.google.android.gms.internal.ads.zzuv zzh;
    private final com.google.android.gms.internal.ads.zztr zzi;

    static {
        com.google.android.gms.internal.ads.zzaf zzafVar = new com.google.android.gms.internal.ads.zzaf();
        zzafVar.zza("MergingMediaSource");
        zza = zzafVar.zzc();
    }

    public zzuy(boolean z, boolean z2, com.google.android.gms.internal.ads.zztr zztrVar, com.google.android.gms.internal.ads.zzui... zzuiVarArr) {
        this.zzb = zzuiVarArr;
        this.zzi = zztrVar;
        this.zze = new java.util.ArrayList(java.util.Arrays.asList(zzuiVarArr));
        this.zzc = new java.util.ArrayList(zzuiVarArr.length);
        int i = 0;
        while (true) {
            int length = zzuiVarArr.length;
            if (i >= length) {
                this.zzd = new com.google.android.gms.internal.ads.zzbq[length];
                this.zzg = new long[0][];
                new java.util.HashMap();
                com.google.android.gms.internal.ads.zzfyt.zzb(8).zzb(2).zza();
                return;
            }
            this.zzc.add(new java.util.ArrayList());
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final /* bridge */ /* synthetic */ void zzA(java.lang.Object obj, com.google.android.gms.internal.ads.zzui zzuiVar, com.google.android.gms.internal.ads.zzbq zzbqVar) {
        int iZzb;
        java.lang.Integer num = (java.lang.Integer) obj;
        if (this.zzh != null) {
            return;
        }
        if (this.zzf == -1) {
            iZzb = zzbqVar.zzb();
            this.zzf = iZzb;
        } else {
            int iZzb2 = zzbqVar.zzb();
            int i = this.zzf;
            if (iZzb2 != i) {
                this.zzh = new com.google.android.gms.internal.ads.zzuv(0);
                return;
            }
            iZzb = i;
        }
        if (this.zzg.length == 0) {
            this.zzg = (long[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Long.TYPE, iZzb, this.zzd.length);
        }
        this.zze.remove(zzuiVar);
        this.zzd[num.intValue()] = zzbqVar;
        if (this.zze.isEmpty()) {
            zzo(this.zzd[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzG(com.google.android.gms.internal.ads.zzue zzueVar) {
        com.google.android.gms.internal.ads.zzuu zzuuVar = (com.google.android.gms.internal.ads.zzuu) zzueVar;
        for (int i = 0; i < this.zzb.length; i++) {
            java.util.List list = (java.util.List) this.zzc.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((com.google.android.gms.internal.ads.zzuw) list.get(i2)).zzb.equals(zzueVar)) {
                    list.remove(i2);
                    break;
                }
            }
            this.zzb[i].zzG(zzuuVar.zzn(i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final com.google.android.gms.internal.ads.zzue zzI(com.google.android.gms.internal.ads.zzug zzugVar, com.google.android.gms.internal.ads.zzyk zzykVar, long j) {
        com.google.android.gms.internal.ads.zzbq[] zzbqVarArr = this.zzd;
        int length = this.zzb.length;
        com.google.android.gms.internal.ads.zzue[] zzueVarArr = new com.google.android.gms.internal.ads.zzue[length];
        int iZza = zzbqVarArr[0].zza(zzugVar.zza);
        for (int i = 0; i < length; i++) {
            com.google.android.gms.internal.ads.zzug zzugVarZza = zzugVar.zza(this.zzd[i].zzf(iZza));
            zzueVarArr[i] = this.zzb[i].zzI(zzugVarZza, zzykVar, j - this.zzg[iZza][i]);
            ((java.util.List) this.zzc.get(i)).add(new com.google.android.gms.internal.ads.zzuw(zzugVarZza, zzueVarArr[i], null));
        }
        return new com.google.android.gms.internal.ads.zzuu(this.zzi, this.zzg[iZza], zzueVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final com.google.android.gms.internal.ads.zzar zzJ() {
        com.google.android.gms.internal.ads.zzui[] zzuiVarArr = this.zzb;
        return zzuiVarArr.length > 0 ? zzuiVarArr[0].zzJ() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zztf
    protected final void zzn(com.google.android.gms.internal.ads.zzgy zzgyVar) {
        super.zzn(zzgyVar);
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzui[] zzuiVarArr = this.zzb;
            if (i >= zzuiVarArr.length) {
                return;
            }
            zzB(java.lang.Integer.valueOf(i), zzuiVarArr[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zztf
    protected final void zzq() {
        super.zzq();
        java.util.Arrays.fill(this.zzd, (java.lang.Object) null);
        this.zzf = -1;
        this.zzh = null;
        this.zze.clear();
        java.util.Collections.addAll(this.zze, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztf, com.google.android.gms.internal.ads.zzui
    public final void zzt(com.google.android.gms.internal.ads.zzar zzarVar) {
        this.zzb[0].zzt(zzarVar);
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzug zzy(java.lang.Object obj, com.google.android.gms.internal.ads.zzug zzugVar) {
        java.util.List list = (java.util.List) this.zzc.get(((java.lang.Integer) obj).intValue());
        for (int i = 0; i < list.size(); i++) {
            if (((com.google.android.gms.internal.ads.zzuw) list.get(i)).zza.equals(zzugVar)) {
                return ((com.google.android.gms.internal.ads.zzuw) ((java.util.List) this.zzc.get(0)).get(i)).zza;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zzui
    public final void zzz() throws java.io.IOException {
        com.google.android.gms.internal.ads.zzuv zzuvVar = this.zzh;
        if (zzuvVar != null) {
            throw zzuvVar;
        }
        super.zzz();
    }
}
