package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbqi extends com.google.android.gms.internal.ads.zzbpj {
    private final com.google.android.gms.ads.mediation.Adapter zza;
    private final com.google.android.gms.internal.ads.zzbwh zzb;

    zzbqi(com.google.android.gms.ads.mediation.Adapter adapter, com.google.android.gms.internal.ads.zzbwh zzbwhVar) {
        this.zza = adapter;
        this.zzb = zzbwhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zze() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbwh zzbwhVar = this.zzb;
        if (zzbwhVar != null) {
            zzbwhVar.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzf() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbwh zzbwhVar = this.zzb;
        if (zzbwhVar != null) {
            zzbwhVar.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzg(int i) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbwh zzbwhVar = this.zzb;
        if (zzbwhVar != null) {
            zzbwhVar.zzg(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzi(int i, java.lang.String str) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzj(int i) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzl(java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzm() throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzn() throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzo() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbwh zzbwhVar = this.zzb;
        if (zzbwhVar != null) {
            zzbwhVar.zzi(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzp() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbwh zzbwhVar = this.zzb;
        if (zzbwhVar != null) {
            zzbwhVar.zzj(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzq(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzr(com.google.android.gms.internal.ads.zzbgq zzbgqVar, java.lang.String str) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzs(com.google.android.gms.internal.ads.zzbwi zzbwiVar) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzt(com.google.android.gms.internal.ads.zzbwm zzbwmVar) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbwh zzbwhVar = this.zzb;
        if (zzbwhVar != null) {
            zzbwhVar.zzm(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), new com.google.android.gms.internal.ads.zzbwi(zzbwmVar.zzf(), zzbwmVar.zze()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzu() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbwh zzbwhVar = this.zzb;
        if (zzbwhVar != null) {
            zzbwhVar.zzn(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzv() throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzw() throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzx() throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzy() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbwh zzbwhVar = this.zzb;
        if (zzbwhVar != null) {
            zzbwhVar.zzo(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza));
        }
    }
}
