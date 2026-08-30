package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdif {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzeb zzb;
    private com.google.android.gms.internal.ads.zzbfp zzc;
    private android.view.View zzd;
    private java.util.List zze;
    private com.google.android.gms.ads.internal.client.zzez zzg;
    private android.os.Bundle zzh;
    private com.google.android.gms.internal.ads.zzcex zzi;
    private com.google.android.gms.internal.ads.zzcex zzj;
    private com.google.android.gms.internal.ads.zzcex zzk;
    private com.google.android.gms.internal.ads.zzecr zzl;
    private com.google.common.util.concurrent.ListenableFuture zzm;
    private com.google.android.gms.internal.ads.zzcab zzn;
    private android.view.View zzo;
    private android.view.View zzp;
    private com.google.android.gms.dynamic.IObjectWrapper zzq;
    private double zzr;
    private com.google.android.gms.internal.ads.zzbfw zzs;
    private com.google.android.gms.internal.ads.zzbfw zzt;
    private java.lang.String zzu;
    private float zzx;
    private java.lang.String zzy;
    private final androidx.collection.SimpleArrayMap zzv = new androidx.collection.SimpleArrayMap();
    private final androidx.collection.SimpleArrayMap zzw = new androidx.collection.SimpleArrayMap();
    private java.util.List zzf = java.util.Collections.emptyList();

    public static com.google.android.gms.internal.ads.zzdif zzag(com.google.android.gms.internal.ads.zzbpp zzbppVar) {
        try {
            com.google.android.gms.internal.ads.zzdie zzdieVarZzak = zzak(zzbppVar.zzg(), null);
            com.google.android.gms.internal.ads.zzbfp zzbfpVarZzh = zzbppVar.zzh();
            android.view.View view = (android.view.View) zzam(zzbppVar.zzj());
            java.lang.String strZzo = zzbppVar.zzo();
            java.util.List listZzr = zzbppVar.zzr();
            java.lang.String strZzm = zzbppVar.zzm();
            android.os.Bundle bundleZzf = zzbppVar.zzf();
            java.lang.String strZzn = zzbppVar.zzn();
            android.view.View view2 = (android.view.View) zzam(zzbppVar.zzk());
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzl = zzbppVar.zzl();
            java.lang.String strZzq = zzbppVar.zzq();
            java.lang.String strZzp = zzbppVar.zzp();
            double dZze = zzbppVar.zze();
            com.google.android.gms.internal.ads.zzbfw zzbfwVarZzi = zzbppVar.zzi();
            com.google.android.gms.internal.ads.zzdif zzdifVar = new com.google.android.gms.internal.ads.zzdif();
            zzdifVar.zza = 2;
            zzdifVar.zzb = zzdieVarZzak;
            zzdifVar.zzc = zzbfpVarZzh;
            zzdifVar.zzd = view;
            zzdifVar.zzZ("headline", strZzo);
            zzdifVar.zze = listZzr;
            zzdifVar.zzZ("body", strZzm);
            zzdifVar.zzh = bundleZzf;
            zzdifVar.zzZ("call_to_action", strZzn);
            zzdifVar.zzo = view2;
            zzdifVar.zzq = iObjectWrapperZzl;
            zzdifVar.zzZ(com.ironsource.y8.h.U, strZzq);
            zzdifVar.zzZ("price", strZzp);
            zzdifVar.zzr = dZze;
            zzdifVar.zzs = zzbfwVarZzi;
            return zzdifVar;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static com.google.android.gms.internal.ads.zzdif zzah(com.google.android.gms.internal.ads.zzbpq zzbpqVar) {
        try {
            com.google.android.gms.internal.ads.zzdie zzdieVarZzak = zzak(zzbpqVar.zzf(), null);
            com.google.android.gms.internal.ads.zzbfp zzbfpVarZzg = zzbpqVar.zzg();
            android.view.View view = (android.view.View) zzam(zzbpqVar.zzi());
            java.lang.String strZzo = zzbpqVar.zzo();
            java.util.List listZzp = zzbpqVar.zzp();
            java.lang.String strZzm = zzbpqVar.zzm();
            android.os.Bundle bundleZze = zzbpqVar.zze();
            java.lang.String strZzn = zzbpqVar.zzn();
            android.view.View view2 = (android.view.View) zzam(zzbpqVar.zzj());
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzk = zzbpqVar.zzk();
            java.lang.String strZzl = zzbpqVar.zzl();
            com.google.android.gms.internal.ads.zzbfw zzbfwVarZzh = zzbpqVar.zzh();
            com.google.android.gms.internal.ads.zzdif zzdifVar = new com.google.android.gms.internal.ads.zzdif();
            zzdifVar.zza = 1;
            zzdifVar.zzb = zzdieVarZzak;
            zzdifVar.zzc = zzbfpVarZzg;
            zzdifVar.zzd = view;
            zzdifVar.zzZ("headline", strZzo);
            zzdifVar.zze = listZzp;
            zzdifVar.zzZ("body", strZzm);
            zzdifVar.zzh = bundleZze;
            zzdifVar.zzZ("call_to_action", strZzn);
            zzdifVar.zzo = view2;
            zzdifVar.zzq = iObjectWrapperZzk;
            zzdifVar.zzZ(com.ironsource.y8.h.F0, strZzl);
            zzdifVar.zzt = zzbfwVarZzh;
            return zzdifVar;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static com.google.android.gms.internal.ads.zzdif zzai(com.google.android.gms.internal.ads.zzbpp zzbppVar) {
        try {
            return zzal(zzak(zzbppVar.zzg(), null), zzbppVar.zzh(), (android.view.View) zzam(zzbppVar.zzj()), zzbppVar.zzo(), zzbppVar.zzr(), zzbppVar.zzm(), zzbppVar.zzf(), zzbppVar.zzn(), (android.view.View) zzam(zzbppVar.zzk()), zzbppVar.zzl(), zzbppVar.zzq(), zzbppVar.zzp(), zzbppVar.zze(), zzbppVar.zzi(), null, 0.0f);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static com.google.android.gms.internal.ads.zzdif zzaj(com.google.android.gms.internal.ads.zzbpq zzbpqVar) {
        try {
            return zzal(zzak(zzbpqVar.zzf(), null), zzbpqVar.zzg(), (android.view.View) zzam(zzbpqVar.zzi()), zzbpqVar.zzo(), zzbpqVar.zzp(), zzbpqVar.zzm(), zzbpqVar.zze(), zzbpqVar.zzn(), (android.view.View) zzam(zzbpqVar.zzj()), zzbpqVar.zzk(), null, null, -1.0d, zzbpqVar.zzh(), zzbpqVar.zzl(), 0.0f);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static com.google.android.gms.internal.ads.zzdie zzak(com.google.android.gms.ads.internal.client.zzeb zzebVar, com.google.android.gms.internal.ads.zzbpt zzbptVar) {
        if (zzebVar == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzdie(zzebVar, zzbptVar);
    }

    private static com.google.android.gms.internal.ads.zzdif zzal(com.google.android.gms.ads.internal.client.zzeb zzebVar, com.google.android.gms.internal.ads.zzbfp zzbfpVar, android.view.View view, java.lang.String str, java.util.List list, java.lang.String str2, android.os.Bundle bundle, java.lang.String str3, android.view.View view2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str4, java.lang.String str5, double d, com.google.android.gms.internal.ads.zzbfw zzbfwVar, java.lang.String str6, float f) {
        com.google.android.gms.internal.ads.zzdif zzdifVar = new com.google.android.gms.internal.ads.zzdif();
        zzdifVar.zza = 6;
        zzdifVar.zzb = zzebVar;
        zzdifVar.zzc = zzbfpVar;
        zzdifVar.zzd = view;
        zzdifVar.zzZ("headline", str);
        zzdifVar.zze = list;
        zzdifVar.zzZ("body", str2);
        zzdifVar.zzh = bundle;
        zzdifVar.zzZ("call_to_action", str3);
        zzdifVar.zzo = view2;
        zzdifVar.zzq = iObjectWrapper;
        zzdifVar.zzZ(com.ironsource.y8.h.U, str4);
        zzdifVar.zzZ("price", str5);
        zzdifVar.zzr = d;
        zzdifVar.zzs = zzbfwVar;
        zzdifVar.zzZ(com.ironsource.y8.h.F0, str6);
        zzdifVar.zzR(f);
        return zzdifVar;
    }

    private static java.lang.Object zzam(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
    }

    public static com.google.android.gms.internal.ads.zzdif zzt(com.google.android.gms.internal.ads.zzbpt zzbptVar) {
        try {
            return zzal(zzak(zzbptVar.zzj(), zzbptVar), zzbptVar.zzk(), (android.view.View) zzam(zzbptVar.zzm()), zzbptVar.zzs(), zzbptVar.zzv(), zzbptVar.zzq(), zzbptVar.zzi(), zzbptVar.zzr(), (android.view.View) zzam(zzbptVar.zzn()), zzbptVar.zzo(), zzbptVar.zzu(), zzbptVar.zzt(), zzbptVar.zze(), zzbptVar.zzl(), zzbptVar.zzp(), zzbptVar.zzf());
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final synchronized java.lang.String zzA() {
        return this.zzu;
    }

    public final synchronized java.lang.String zzB() {
        return zzF("headline");
    }

    public final synchronized java.lang.String zzC() {
        return this.zzy;
    }

    public final synchronized java.lang.String zzD() {
        return zzF("price");
    }

    public final synchronized java.lang.String zzE() {
        return zzF(com.ironsource.y8.h.U);
    }

    public final synchronized java.lang.String zzF(java.lang.String str) {
        return (java.lang.String) this.zzw.get(str);
    }

    public final synchronized java.util.List zzG() {
        return this.zze;
    }

    public final synchronized java.util.List zzH() {
        return this.zzf;
    }

    public final synchronized void zzI() {
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzi;
        if (zzcexVar != null) {
            zzcexVar.destroy();
            this.zzi = null;
        }
        com.google.android.gms.internal.ads.zzcex zzcexVar2 = this.zzj;
        if (zzcexVar2 != null) {
            zzcexVar2.destroy();
            this.zzj = null;
        }
        com.google.android.gms.internal.ads.zzcex zzcexVar3 = this.zzk;
        if (zzcexVar3 != null) {
            zzcexVar3.destroy();
            this.zzk = null;
        }
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.zzm = null;
        }
        com.google.android.gms.internal.ads.zzcab zzcabVar = this.zzn;
        if (zzcabVar != null) {
            zzcabVar.cancel(false);
            this.zzn = null;
        }
        this.zzl = null;
        this.zzv.clear();
        this.zzw.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
    }

    public final synchronized void zzJ(com.google.android.gms.internal.ads.zzbfp zzbfpVar) {
        this.zzc = zzbfpVar;
    }

    public final synchronized void zzK(java.lang.String str) {
        this.zzu = str;
    }

    public final synchronized void zzL(com.google.android.gms.ads.internal.client.zzez zzezVar) {
        this.zzg = zzezVar;
    }

    public final synchronized void zzM(com.google.android.gms.internal.ads.zzbfw zzbfwVar) {
        this.zzs = zzbfwVar;
    }

    public final synchronized void zzN(java.lang.String str, com.google.android.gms.internal.ads.zzbfj zzbfjVar) {
        try {
            if (zzbfjVar == null) {
                this.zzv.remove(str);
            } else {
                this.zzv.put(str, zzbfjVar);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzO(com.google.android.gms.internal.ads.zzcex zzcexVar) {
        this.zzj = zzcexVar;
    }

    public final synchronized void zzP(java.util.List list) {
        this.zze = list;
    }

    public final synchronized void zzQ(com.google.android.gms.internal.ads.zzbfw zzbfwVar) {
        this.zzt = zzbfwVar;
    }

    public final synchronized void zzR(float f) {
        this.zzx = f;
    }

    public final synchronized void zzS(java.util.List list) {
        this.zzf = list;
    }

    public final synchronized void zzT(com.google.android.gms.internal.ads.zzcex zzcexVar) {
        this.zzk = zzcexVar;
    }

    public final synchronized void zzU(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        this.zzm = listenableFuture;
    }

    public final synchronized void zzV(java.lang.String str) {
        this.zzy = str;
    }

    public final synchronized void zzW(com.google.android.gms.internal.ads.zzecr zzecrVar) {
        this.zzl = zzecrVar;
    }

    public final synchronized void zzX(com.google.android.gms.internal.ads.zzcab zzcabVar) {
        this.zzn = zzcabVar;
    }

    public final synchronized void zzY(double d) {
        this.zzr = d;
    }

    public final synchronized void zzZ(java.lang.String str, java.lang.String str2) {
        try {
            if (str2 == null) {
                this.zzw.remove(str);
            } else {
                this.zzw.put(str, str2);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized double zza() {
        return this.zzr;
    }

    public final synchronized void zzaa(int i) {
        this.zza = i;
    }

    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzeb zzebVar) {
        this.zzb = zzebVar;
    }

    public final synchronized void zzac(android.view.View view) {
        this.zzo = view;
    }

    public final synchronized void zzad(com.google.android.gms.internal.ads.zzcex zzcexVar) {
        this.zzi = zzcexVar;
    }

    public final synchronized void zzae(android.view.View view) {
        this.zzp = view;
    }

    public final synchronized boolean zzaf() {
        return this.zzj != null;
    }

    public final synchronized float zzb() {
        return this.zzx;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized android.os.Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new android.os.Bundle();
        }
        return this.zzh;
    }

    public final synchronized android.view.View zze() {
        return this.zzd;
    }

    public final synchronized android.view.View zzf() {
        return this.zzo;
    }

    public final synchronized android.view.View zzg() {
        return this.zzp;
    }

    public final synchronized androidx.collection.SimpleArrayMap zzh() {
        return this.zzv;
    }

    public final synchronized androidx.collection.SimpleArrayMap zzi() {
        return this.zzw;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzeb zzj() {
        return this.zzb;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzez zzk() {
        return this.zzg;
    }

    public final synchronized com.google.android.gms.internal.ads.zzbfp zzl() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zzbfw zzm() {
        java.util.List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.lang.Object obj = this.zze.get(0);
        if (obj instanceof android.os.IBinder) {
            return com.google.android.gms.internal.ads.zzbfv.zzg((android.os.IBinder) obj);
        }
        return null;
    }

    public final synchronized com.google.android.gms.internal.ads.zzbfw zzn() {
        return this.zzs;
    }

    public final synchronized com.google.android.gms.internal.ads.zzbfw zzo() {
        return this.zzt;
    }

    public final synchronized com.google.android.gms.internal.ads.zzcab zzp() {
        return this.zzn;
    }

    public final synchronized com.google.android.gms.internal.ads.zzcex zzq() {
        return this.zzj;
    }

    public final synchronized com.google.android.gms.internal.ads.zzcex zzr() {
        return this.zzk;
    }

    public final synchronized com.google.android.gms.internal.ads.zzcex zzs() {
        return this.zzi;
    }

    public final synchronized com.google.android.gms.internal.ads.zzecr zzu() {
        return this.zzl;
    }

    public final synchronized com.google.android.gms.dynamic.IObjectWrapper zzv() {
        return this.zzq;
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzw() {
        return this.zzm;
    }

    public final synchronized java.lang.String zzx() {
        return zzF(com.ironsource.y8.h.F0);
    }

    public final synchronized java.lang.String zzy() {
        return zzF("body");
    }

    public final synchronized java.lang.String zzz() {
        return zzF("call_to_action");
    }
}
