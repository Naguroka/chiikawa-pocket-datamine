package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdmo extends com.google.android.gms.internal.ads.zzbgk {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzdia zzb;
    private final com.google.android.gms.internal.ads.zzdif zzc;

    public zzdmo(java.lang.String str, com.google.android.gms.internal.ads.zzdia zzdiaVar, com.google.android.gms.internal.ads.zzdif zzdifVar) {
        this.zza = str;
        this.zzb = zzdiaVar;
        this.zzc = zzdifVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final double zzb() throws android.os.RemoteException {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final android.os.Bundle zzc() throws android.os.RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final com.google.android.gms.ads.internal.client.zzeb zzd() throws android.os.RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final com.google.android.gms.internal.ads.zzbfp zze() throws android.os.RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final com.google.android.gms.internal.ads.zzbfw zzf() throws android.os.RemoteException {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final com.google.android.gms.dynamic.IObjectWrapper zzg() throws android.os.RemoteException {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final com.google.android.gms.dynamic.IObjectWrapper zzh() throws android.os.RemoteException {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final java.lang.String zzi() throws android.os.RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final java.lang.String zzj() throws android.os.RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final java.lang.String zzk() throws android.os.RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final java.lang.String zzl() throws android.os.RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final java.lang.String zzm() throws android.os.RemoteException {
        return this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final java.lang.String zzn() throws android.os.RemoteException {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final java.util.List zzo() throws android.os.RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final void zzp() throws android.os.RemoteException {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final void zzq(android.os.Bundle bundle) throws android.os.RemoteException {
        this.zzb.zzG(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final void zzr(android.os.Bundle bundle) throws android.os.RemoteException {
        this.zzb.zzM(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final boolean zzs(android.os.Bundle bundle) throws android.os.RemoteException {
        return this.zzb.zzZ(bundle);
    }
}
