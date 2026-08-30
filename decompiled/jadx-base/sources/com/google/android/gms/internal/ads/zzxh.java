package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzxh extends com.google.android.gms.internal.ads.zzbw {
    public final boolean zzD;
    public final boolean zzE;
    public final boolean zzF;
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    private final android.util.SparseArray zzS;
    private final android.util.SparseBooleanArray zzT;

    static {
        new com.google.android.gms.internal.ads.zzxh(new com.google.android.gms.internal.ads.zzxg());
        java.lang.Integer.toString(1000, 36);
        java.lang.Integer.toString(1001, 36);
        java.lang.Integer.toString(1002, 36);
        java.lang.Integer.toString(1003, 36);
        java.lang.Integer.toString(1004, 36);
        java.lang.Integer.toString(1005, 36);
        java.lang.Integer.toString(1006, 36);
        java.lang.Integer.toString(1007, 36);
        java.lang.Integer.toString(1008, 36);
        java.lang.Integer.toString(1009, 36);
        java.lang.Integer.toString(1010, 36);
        java.lang.Integer.toString(1011, 36);
        java.lang.Integer.toString(1012, 36);
        java.lang.Integer.toString(1013, 36);
        java.lang.Integer.toString(1014, 36);
        java.lang.Integer.toString(1015, 36);
        java.lang.Integer.toString(1016, 36);
        java.lang.Integer.toString(1017, 36);
        java.lang.Integer.toString(1018, 36);
    }

    private zzxh(com.google.android.gms.internal.ads.zzxg zzxgVar) {
        super(zzxgVar);
        this.zzD = zzxgVar.zza;
        this.zzE = false;
        this.zzF = zzxgVar.zzb;
        this.zzG = false;
        this.zzH = zzxgVar.zzc;
        this.zzI = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzL = false;
        this.zzM = zzxgVar.zzd;
        this.zzN = zzxgVar.zze;
        this.zzO = zzxgVar.zzf;
        this.zzP = false;
        this.zzQ = zzxgVar.zzg;
        this.zzR = false;
        this.zzS = zzxgVar.zzh;
        this.zzT = zzxgVar.zzi;
    }

    public static com.google.android.gms.internal.ads.zzxh zzd(android.content.Context context) {
        return new com.google.android.gms.internal.ads.zzxh(new com.google.android.gms.internal.ads.zzxg(context));
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzxh zzxhVar = (com.google.android.gms.internal.ads.zzxh) obj;
            if (super.equals(zzxhVar) && this.zzD == zzxhVar.zzD && this.zzF == zzxhVar.zzF && this.zzH == zzxhVar.zzH && this.zzM == zzxhVar.zzM && this.zzN == zzxhVar.zzN && this.zzO == zzxhVar.zzO && this.zzQ == zzxhVar.zzQ) {
                android.util.SparseBooleanArray sparseBooleanArray = this.zzT;
                android.util.SparseBooleanArray sparseBooleanArray2 = zzxhVar.zzT;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) >= 0) {
                        }
                    }
                    android.util.SparseArray sparseArray = this.zzS;
                    android.util.SparseArray sparseArray2 = zzxhVar.zzS;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                java.util.Map map = (java.util.Map) sparseArray.valueAt(i2);
                                java.util.Map map2 = (java.util.Map) sparseArray2.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (java.util.Map.Entry entry : map.entrySet()) {
                                        com.google.android.gms.internal.ads.zzwj zzwjVar = (com.google.android.gms.internal.ads.zzwj) entry.getKey();
                                        if (!map2.containsKey(zzwjVar) || !java.util.Objects.equals(entry.getValue(), map2.get(zzwjVar))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzD ? 1 : 0)) * 961) + (this.zzF ? 1 : 0)) * 961) + (this.zzH ? 1 : 0)) * 28629151) + (this.zzM ? 1 : 0)) * 31) + (this.zzN ? 1 : 0)) * 31) + (this.zzO ? 1 : 0)) * 961) + (this.zzQ ? 1 : 0)) * 31;
    }

    public final com.google.android.gms.internal.ads.zzxg zzc() {
        return new com.google.android.gms.internal.ads.zzxg(this, null);
    }

    @java.lang.Deprecated
    public final com.google.android.gms.internal.ads.zzxi zze(int i, com.google.android.gms.internal.ads.zzwj zzwjVar) {
        java.util.Map map = (java.util.Map) this.zzS.get(i);
        if (map != null) {
            return (com.google.android.gms.internal.ads.zzxi) map.get(zzwjVar);
        }
        return null;
    }

    public final boolean zzf(int i) {
        return this.zzT.get(i);
    }

    @java.lang.Deprecated
    public final boolean zzg(int i, com.google.android.gms.internal.ads.zzwj zzwjVar) {
        java.util.Map map = (java.util.Map) this.zzS.get(i);
        return map != null && map.containsKey(zzwjVar);
    }
}
