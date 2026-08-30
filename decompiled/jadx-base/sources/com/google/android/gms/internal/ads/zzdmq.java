package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdmq extends com.google.android.gms.internal.ads.zzbgm {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzdia zzb;
    private final com.google.android.gms.internal.ads.zzdif zzc;

    public zzdmq(java.lang.String str, com.google.android.gms.internal.ads.zzdia zzdiaVar, com.google.android.gms.internal.ads.zzdif zzdifVar) {
        this.zza = str;
        this.zzb = zzdiaVar;
        this.zzc = zzdifVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final android.os.Bundle zzb() throws android.os.RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final com.google.android.gms.ads.internal.client.zzeb zzc() throws android.os.RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final com.google.android.gms.internal.ads.zzbfp zzd() throws android.os.RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final com.google.android.gms.internal.ads.zzbfw zze() throws android.os.RemoteException {
        return this.zzc.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final com.google.android.gms.dynamic.IObjectWrapper zzf() throws android.os.RemoteException {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final com.google.android.gms.dynamic.IObjectWrapper zzg() throws android.os.RemoteException {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final java.lang.String zzh() throws android.os.RemoteException {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final java.lang.String zzi() throws android.os.RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final java.lang.String zzj() throws android.os.RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final java.lang.String zzk() throws android.os.RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final java.lang.String zzl() throws android.os.RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final java.util.List zzm() throws android.os.RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzn() throws android.os.RemoteException {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzo(android.os.Bundle bundle) throws android.os.RemoteException {
        this.zzb.zzG(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzp(android.os.Bundle bundle) throws android.os.RemoteException {
        this.zzb.zzM(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final boolean zzq(android.os.Bundle bundle) throws android.os.RemoteException {
        return this.zzb.zzZ(bundle);
    }
}
