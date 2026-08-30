package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzxg extends com.google.android.gms.internal.ads.zzbv {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final android.util.SparseArray zzh;
    private final android.util.SparseBooleanArray zzi;

    @java.lang.Deprecated
    public zzxg() {
        this.zzh = new android.util.SparseArray();
        this.zzi = new android.util.SparseBooleanArray();
        zzy();
    }

    private final void zzy() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    public final com.google.android.gms.internal.ads.zzxg zzq(int i, boolean z) {
        if (this.zzi.get(i) != z) {
            if (z) {
                this.zzi.put(i, true);
            } else {
                this.zzi.delete(i);
            }
        }
        return this;
    }

    public zzxg(android.content.Context context) {
        super.zze(context);
        android.graphics.Point pointZzw = com.google.android.gms.internal.ads.zzei.zzw(context);
        super.zzf(pointZzw.x, pointZzw.y, true);
        this.zzh = new android.util.SparseArray();
        this.zzi = new android.util.SparseBooleanArray();
        zzy();
    }

    /* synthetic */ zzxg(com.google.android.gms.internal.ads.zzxh zzxhVar, com.google.android.gms.internal.ads.zzxs zzxsVar) {
        super(zzxhVar);
        this.zza = zzxhVar.zzD;
        this.zzb = zzxhVar.zzF;
        this.zzc = zzxhVar.zzH;
        this.zzd = zzxhVar.zzM;
        this.zze = zzxhVar.zzN;
        this.zzf = zzxhVar.zzO;
        this.zzg = zzxhVar.zzQ;
        android.util.SparseArray sparseArray = zzxhVar.zzS;
        android.util.SparseArray sparseArray2 = new android.util.SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new java.util.HashMap((java.util.Map) sparseArray.valueAt(i)));
        }
        this.zzh = sparseArray2;
        this.zzi = zzxhVar.zzT.clone();
    }
}
