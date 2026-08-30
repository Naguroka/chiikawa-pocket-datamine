package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public abstract class zzcde implements com.google.android.gms.common.api.Releasable {
    protected final android.content.Context zza;
    protected final java.lang.String zzb;
    protected final java.lang.ref.WeakReference zzc;

    public zzcde(com.google.android.gms.internal.ads.zzcbs zzcbsVar) {
        android.content.Context context = zzcbsVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzv.zzq().zzc(context, zzcbsVar.zzn().afmaVersion);
        this.zzc = new java.lang.ref.WeakReference(zzcbsVar);
    }

    static /* bridge */ /* synthetic */ void zze(com.google.android.gms.internal.ads.zzcde zzcdeVar, java.lang.String str, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcbs zzcbsVar = (com.google.android.gms.internal.ads.zzcbs) zzcdeVar.zzc.get();
        if (zzcbsVar != null) {
            zzcbsVar.zzd("onPrecacheEvent", map);
        }
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    public abstract void zzf();

    public final void zzg(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new com.google.android.gms.internal.ads.zzcdd(this, str, str2, str3, str4));
    }

    protected final void zzh(java.lang.String str, java.lang.String str2, int i) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new com.google.android.gms.internal.ads.zzcdb(this, str, str2, i));
    }

    public final void zzj(java.lang.String str, java.lang.String str2, long j) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new com.google.android.gms.internal.ads.zzcdc(this, str, str2, j));
    }

    public final void zzn(java.lang.String str, java.lang.String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new com.google.android.gms.internal.ads.zzcda(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    public final void zzo(java.lang.String str, java.lang.String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new com.google.android.gms.internal.ads.zzccz(this, str, str2, j, j2, j3, j4, j5, z, i, i2));
    }

    protected void zzp(int i) {
    }

    protected void zzq(int i) {
    }

    protected void zzr(int i) {
    }

    protected void zzs(int i) {
    }

    public abstract boolean zzt(java.lang.String str);

    public boolean zzu(java.lang.String str, java.lang.String[] strArr) {
        return zzt(str);
    }

    public boolean zzw(java.lang.String str, java.lang.String[] strArr, com.google.android.gms.internal.ads.zzccw zzccwVar) {
        return zzt(str);
    }
}
