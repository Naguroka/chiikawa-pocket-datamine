package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzyb {
    private com.google.android.gms.internal.ads.zzya zza;
    private com.google.android.gms.internal.ads.zzyj zzb;

    public com.google.android.gms.internal.ads.zzll zze() {
        throw null;
    }

    public void zzj() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzk(com.google.android.gms.internal.ads.zze zzeVar) {
        throw null;
    }

    public boolean zzn() {
        throw null;
    }

    public abstract com.google.android.gms.internal.ads.zzyc zzo(com.google.android.gms.internal.ads.zzlm[] zzlmVarArr, com.google.android.gms.internal.ads.zzwj zzwjVar, com.google.android.gms.internal.ads.zzug zzugVar, com.google.android.gms.internal.ads.zzbq zzbqVar) throws com.google.android.gms.internal.ads.zzib;

    public abstract void zzp(java.lang.Object obj);

    protected final com.google.android.gms.internal.ads.zzyj zzq() {
        com.google.android.gms.internal.ads.zzyj zzyjVar = this.zzb;
        com.google.android.gms.internal.ads.zzcw.zzb(zzyjVar);
        return zzyjVar;
    }

    public final void zzr(com.google.android.gms.internal.ads.zzya zzyaVar, com.google.android.gms.internal.ads.zzyj zzyjVar) {
        this.zza = zzyaVar;
        this.zzb = zzyjVar;
    }

    protected final void zzs() {
        com.google.android.gms.internal.ads.zzya zzyaVar = this.zza;
        if (zzyaVar != null) {
            zzyaVar.zzj();
        }
    }
}
