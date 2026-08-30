package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzakg implements com.google.android.gms.internal.ads.zzacq {
    private final com.google.android.gms.internal.ads.zzacq zzb;
    private final com.google.android.gms.internal.ads.zzakd zzc;
    private final android.util.SparseArray zzd = new android.util.SparseArray();

    public zzakg(com.google.android.gms.internal.ads.zzacq zzacqVar, com.google.android.gms.internal.ads.zzakd zzakdVar) {
        this.zzb = zzacqVar;
        this.zzc = zzakdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacq
    public final void zzD() {
        this.zzb.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacq
    public final void zzO(com.google.android.gms.internal.ads.zzadm zzadmVar) {
        this.zzb.zzO(zzadmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacq
    public final com.google.android.gms.internal.ads.zzadt zzw(int i, int i2) {
        if (i2 != 3) {
            return this.zzb.zzw(i, i2);
        }
        com.google.android.gms.internal.ads.zzaki zzakiVar = (com.google.android.gms.internal.ads.zzaki) this.zzd.get(i);
        if (zzakiVar != null) {
            return zzakiVar;
        }
        com.google.android.gms.internal.ads.zzaki zzakiVar2 = new com.google.android.gms.internal.ads.zzaki(this.zzb.zzw(i, 3), this.zzc);
        this.zzd.put(i, zzakiVar2);
        return zzakiVar2;
    }
}
