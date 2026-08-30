package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdmv extends com.google.android.gms.internal.ads.zzbhs {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzdia zzb;
    private final com.google.android.gms.internal.ads.zzdif zzc;
    private final com.google.android.gms.internal.ads.zzdrw zzd;

    public zzdmv(java.lang.String str, com.google.android.gms.internal.ads.zzdia zzdiaVar, com.google.android.gms.internal.ads.zzdif zzdifVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zza = str;
        this.zzb = zzdiaVar;
        this.zzc = zzdifVar;
        this.zzd = zzdrwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzA() {
        this.zzb.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzB(android.os.Bundle bundle) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmO)).booleanValue()) {
            this.zzb.zzI(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzC(android.os.Bundle bundle) throws android.os.RemoteException {
        this.zzb.zzM(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzD() {
        this.zzb.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzE(com.google.android.gms.ads.internal.client.zzdd zzddVar) throws android.os.RemoteException {
        this.zzb.zzP(zzddVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzF(com.google.android.gms.ads.internal.client.zzdr zzdrVar) throws android.os.RemoteException {
        try {
            if (!zzdrVar.zzf()) {
                this.zzd.zze();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzQ(zzdrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzG(com.google.android.gms.internal.ads.zzbhq zzbhqVar) throws android.os.RemoteException {
        this.zzb.zzR(zzbhqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final boolean zzH() {
        return this.zzb.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final boolean zzI() throws android.os.RemoteException {
        return (this.zzc.zzH().isEmpty() || this.zzc.zzk() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final boolean zzJ(android.os.Bundle bundle) throws android.os.RemoteException {
        return this.zzb.zzZ(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final double zze() throws android.os.RemoteException {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final android.os.Bundle zzf() throws android.os.RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final com.google.android.gms.ads.internal.client.zzdy zzg() throws android.os.RemoteException {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgC)).booleanValue()) {
            return this.zzb.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final com.google.android.gms.ads.internal.client.zzeb zzh() throws android.os.RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final com.google.android.gms.internal.ads.zzbfp zzi() throws android.os.RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final com.google.android.gms.internal.ads.zzbft zzj() throws android.os.RemoteException {
        return this.zzb.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final com.google.android.gms.internal.ads.zzbfw zzk() throws android.os.RemoteException {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final com.google.android.gms.dynamic.IObjectWrapper zzl() throws android.os.RemoteException {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final com.google.android.gms.dynamic.IObjectWrapper zzm() throws android.os.RemoteException {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final java.lang.String zzn() throws android.os.RemoteException {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final java.lang.String zzo() throws android.os.RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final java.lang.String zzp() throws android.os.RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final java.lang.String zzq() throws android.os.RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final java.lang.String zzr() throws android.os.RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final java.lang.String zzs() throws android.os.RemoteException {
        return this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final java.lang.String zzt() throws android.os.RemoteException {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final java.util.List zzu() throws android.os.RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final java.util.List zzv() throws android.os.RemoteException {
        return zzI() ? this.zzc.zzH() : java.util.Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzw() throws android.os.RemoteException {
        this.zzb.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzx() throws android.os.RemoteException {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzy(com.google.android.gms.ads.internal.client.zzdh zzdhVar) throws android.os.RemoteException {
        this.zzb.zzC(zzdhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzz(android.os.Bundle bundle) throws android.os.RemoteException {
        this.zzb.zzG(bundle);
    }
}
