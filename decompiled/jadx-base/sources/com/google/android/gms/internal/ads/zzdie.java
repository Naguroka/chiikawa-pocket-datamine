package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdie extends com.google.android.gms.ads.internal.client.zzea {
    private final java.lang.Object zza = new java.lang.Object();

    @javax.annotation.Nullable
    private final com.google.android.gms.ads.internal.client.zzeb zzb;

    @javax.annotation.Nullable
    private final com.google.android.gms.internal.ads.zzbpt zzc;

    public zzdie(@javax.annotation.Nullable com.google.android.gms.ads.internal.client.zzeb zzebVar, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzbpt zzbptVar) {
        this.zzb = zzebVar;
        this.zzc = zzbptVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zze() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzf() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbpt zzbptVar = this.zzc;
        if (zzbptVar != null) {
            return zzbptVar.zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzg() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbpt zzbptVar = this.zzc;
        if (zzbptVar != null) {
            return zzbptVar.zzh();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final int zzh() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    @javax.annotation.Nullable
    public final com.google.android.gms.ads.internal.client.zzee zzi() throws android.os.RemoteException {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return null;
            }
            return zzebVar.zzi();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzj(boolean z) throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzk() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzl() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzm(@javax.annotation.Nullable com.google.android.gms.ads.internal.client.zzee zzeeVar) throws android.os.RemoteException {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzeb zzebVar = this.zzb;
            if (zzebVar != null) {
                zzebVar.zzm(zzeeVar);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzn() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzo() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzp() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzq() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }
}
