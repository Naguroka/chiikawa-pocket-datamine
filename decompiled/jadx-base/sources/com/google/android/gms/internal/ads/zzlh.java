package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzlh extends com.google.android.gms.internal.ads.zzhi {
    public static final /* synthetic */ int zzb = 0;
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final com.google.android.gms.internal.ads.zzbq[] zzg;
    private final java.lang.Object[] zzh;
    private final java.util.HashMap zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzlh(java.util.Collection collection, com.google.android.gms.internal.ads.zzwb zzwbVar) {
        com.google.android.gms.internal.ads.zzbq[] zzbqVarArr = new com.google.android.gms.internal.ads.zzbq[collection.size()];
        java.util.Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            zzbqVarArr[i2] = ((com.google.android.gms.internal.ads.zzkp) it.next()).zza();
            i2++;
        }
        java.lang.Object[] objArr = new java.lang.Object[collection.size()];
        java.util.Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((com.google.android.gms.internal.ads.zzkp) it2.next()).zzb();
            i++;
        }
        this(zzbqVarArr, objArr, zzwbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    protected final int zzp(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    protected final int zzq(int i) {
        return com.google.android.gms.internal.ads.zzei.zzc(this.zze, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    protected final int zzr(int i) {
        return com.google.android.gms.internal.ads.zzei.zzc(this.zzf, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    protected final int zzs(int i) {
        return this.zze[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    protected final int zzt(int i) {
        return this.zzf[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    protected final com.google.android.gms.internal.ads.zzbq zzu(int i) {
        return this.zzg[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    protected final java.lang.Object zzv(int i) {
        return this.zzh[i];
    }

    final java.util.List zzw() {
        return java.util.Arrays.asList(this.zzg);
    }

    public final com.google.android.gms.internal.ads.zzlh zzx(com.google.android.gms.internal.ads.zzwb zzwbVar) {
        com.google.android.gms.internal.ads.zzbq[] zzbqVarArr = new com.google.android.gms.internal.ads.zzbq[this.zzg.length];
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzbq[] zzbqVarArr2 = this.zzg;
            if (i >= zzbqVarArr2.length) {
                return new com.google.android.gms.internal.ads.zzlh(zzbqVarArr, this.zzh, zzwbVar);
            }
            zzbqVarArr[i] = new com.google.android.gms.internal.ads.zzlg(this, zzbqVarArr2[i]);
            i++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzlh(com.google.android.gms.internal.ads.zzbq[] zzbqVarArr, java.lang.Object[] objArr, com.google.android.gms.internal.ads.zzwb zzwbVar) {
        super(false, zzwbVar);
        int i = 0;
        this.zzg = zzbqVarArr;
        int length = zzbqVarArr.length;
        this.zze = new int[length];
        this.zzf = new int[length];
        this.zzh = objArr;
        this.zzi = new java.util.HashMap();
        int iZzc = 0;
        int iZzb = 0;
        int i2 = 0;
        while (i < zzbqVarArr.length) {
            com.google.android.gms.internal.ads.zzbq zzbqVar = zzbqVarArr[i];
            this.zzg[i2] = zzbqVar;
            this.zzf[i2] = iZzc;
            this.zze[i2] = iZzb;
            iZzc += zzbqVar.zzc();
            iZzb += this.zzg[i2].zzb();
            this.zzi.put(objArr[i2], java.lang.Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.zzc = iZzc;
        this.zzd = iZzb;
    }
}
