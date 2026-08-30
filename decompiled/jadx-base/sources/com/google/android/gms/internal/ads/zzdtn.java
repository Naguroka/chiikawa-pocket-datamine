package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdtn implements com.google.android.gms.internal.ads.zzdsx {
    private final long zza;
    private final com.google.android.gms.internal.ads.zzdtc zzb;
    private final com.google.android.gms.internal.ads.zzfbf zzc;

    zzdtn(long j, android.content.Context context, com.google.android.gms.internal.ads.zzdtc zzdtcVar, com.google.android.gms.internal.ads.zzcgx zzcgxVar, java.lang.String str) {
        this.zza = j;
        this.zzb = zzdtcVar;
        com.google.android.gms.internal.ads.zzfbh zzfbhVarZzw = zzcgxVar.zzw();
        zzfbhVarZzw.zzb(context);
        zzfbhVarZzw.zza(str);
        this.zzc = zzfbhVarZzw.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdsx
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdsx
    public final void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            this.zzc.zzf(zzmVar, new com.google.android.gms.internal.ads.zzdtl(this));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsx
    public final void zzc() {
        try {
            this.zzc.zzk(new com.google.android.gms.internal.ads.zzdtm(this));
            this.zzc.zzm(com.google.android.gms.dynamic.ObjectWrapper.wrap(null));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
