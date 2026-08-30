package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzto extends com.google.android.gms.internal.ads.zztf {
    private final java.util.HashMap zza = new java.util.HashMap();
    private android.os.Handler zzb;
    private com.google.android.gms.internal.ads.zzgy zzc;

    protected zzto() {
    }

    protected abstract void zzA(java.lang.Object obj, com.google.android.gms.internal.ads.zzui zzuiVar, com.google.android.gms.internal.ads.zzbq zzbqVar);

    protected final void zzB(final java.lang.Object obj, com.google.android.gms.internal.ads.zzui zzuiVar) {
        com.google.android.gms.internal.ads.zzcw.zzd(!this.zza.containsKey(obj));
        com.google.android.gms.internal.ads.zzuh zzuhVar = new com.google.android.gms.internal.ads.zzuh() { // from class: com.google.android.gms.internal.ads.zztl
            @Override // com.google.android.gms.internal.ads.zzuh
            public final void zza(com.google.android.gms.internal.ads.zzui zzuiVar2, com.google.android.gms.internal.ads.zzbq zzbqVar) {
                this.zza.zzA(obj, zzuiVar2, zzbqVar);
            }
        };
        com.google.android.gms.internal.ads.zztm zztmVar = new com.google.android.gms.internal.ads.zztm(this, obj);
        this.zza.put(obj, new com.google.android.gms.internal.ads.zztn(zzuiVar, zzuhVar, zztmVar));
        android.os.Handler handler = this.zzb;
        handler.getClass();
        zzuiVar.zzh(handler, zztmVar);
        android.os.Handler handler2 = this.zzb;
        handler2.getClass();
        zzuiVar.zzg(handler2, zztmVar);
        zzuiVar.zzm(zzuhVar, this.zzc, zzb());
        if (zzu()) {
            return;
        }
        zzuiVar.zzi(zzuhVar);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    protected final void zzj() {
        for (com.google.android.gms.internal.ads.zztn zztnVar : this.zza.values()) {
            zztnVar.zza.zzi(zztnVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztf
    protected final void zzl() {
        for (com.google.android.gms.internal.ads.zztn zztnVar : this.zza.values()) {
            zztnVar.zza.zzk(zztnVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztf
    protected void zzn(com.google.android.gms.internal.ads.zzgy zzgyVar) {
        this.zzc = zzgyVar;
        this.zzb = com.google.android.gms.internal.ads.zzei.zzy(null);
    }

    @Override // com.google.android.gms.internal.ads.zztf
    protected void zzq() {
        for (com.google.android.gms.internal.ads.zztn zztnVar : this.zza.values()) {
            zztnVar.zza.zzp(zztnVar.zzb);
            zztnVar.zza.zzs(zztnVar.zzc);
            zztnVar.zza.zzr(zztnVar.zzc);
        }
        this.zza.clear();
    }

    protected int zzw(java.lang.Object obj, int i) {
        return 0;
    }

    protected long zzx(java.lang.Object obj, long j, com.google.android.gms.internal.ads.zzug zzugVar) {
        return j;
    }

    protected com.google.android.gms.internal.ads.zzug zzy(java.lang.Object obj, com.google.android.gms.internal.ads.zzug zzugVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public void zzz() throws java.io.IOException {
        java.util.Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zztn) it.next()).zza.zzz();
        }
    }
}
