package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdhn extends com.google.android.gms.internal.ads.zzbfs {
    private final com.google.android.gms.internal.ads.zzdif zza;
    private com.google.android.gms.dynamic.IObjectWrapper zzb;

    public zzdhn(com.google.android.gms.internal.ads.zzdif zzdifVar) {
        this.zza = zzdifVar;
    }

    private static float zzb(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        android.graphics.drawable.Drawable drawable;
        if (iObjectWrapper == null || (drawable = (android.graphics.drawable.Drawable) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final float zze() throws android.os.RemoteException {
        if (this.zza.zzb() != 0.0f) {
            return this.zza.zzb();
        }
        if (this.zza.zzj() != null) {
            try {
                return this.zza.zzj().zze();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        }
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return zzb(iObjectWrapper);
        }
        com.google.android.gms.internal.ads.zzbfw zzbfwVarZzm = this.zza.zzm();
        if (zzbfwVarZzm == null) {
            return 0.0f;
        }
        float fZzd = (zzbfwVarZzm.zzd() == -1 || zzbfwVarZzm.zzc() == -1) ? 0.0f : zzbfwVarZzm.zzd() / zzbfwVarZzm.zzc();
        return fZzd == 0.0f ? zzb(zzbfwVarZzm.zzf()) : fZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final float zzf() throws android.os.RemoteException {
        if (this.zza.zzj() != null) {
            return this.zza.zzj().zzf();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final float zzg() throws android.os.RemoteException {
        if (this.zza.zzj() != null) {
            return this.zza.zzj().zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final com.google.android.gms.ads.internal.client.zzeb zzh() throws android.os.RemoteException {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final com.google.android.gms.dynamic.IObjectWrapper zzi() throws android.os.RemoteException {
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        com.google.android.gms.internal.ads.zzbfw zzbfwVarZzm = this.zza.zzm();
        if (zzbfwVarZzm == null) {
            return null;
        }
        return zzbfwVarZzm.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final boolean zzk() throws android.os.RemoteException {
        return this.zza.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final boolean zzl() throws android.os.RemoteException {
        return this.zza.zzj() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void zzm(com.google.android.gms.internal.ads.zzbhe zzbheVar) {
        if (this.zza.zzj() instanceof com.google.android.gms.internal.ads.zzcfz) {
            ((com.google.android.gms.internal.ads.zzcfz) this.zza.zzj()).zzv(zzbheVar);
        }
    }
}
