package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfd implements com.google.android.gms.ads.MediaContent {
    private final com.google.android.gms.internal.ads.zzbft zza;
    private final com.google.android.gms.ads.VideoController zzb = new com.google.android.gms.ads.VideoController();
    private final com.google.android.gms.internal.ads.zzbgq zzc;

    public zzfd(com.google.android.gms.internal.ads.zzbft zzbftVar, com.google.android.gms.internal.ads.zzbgq zzbgqVar) {
        this.zza = zzbftVar;
        this.zzc = zzbgqVar;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getAspectRatio() {
        try {
            return this.zza.zze();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getCurrentTime() {
        try {
            return this.zza.zzf();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getDuration() {
        try {
            return this.zza.zzg();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final android.graphics.drawable.Drawable getMainImage() {
        try {
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzi = this.zza.zzi();
            if (iObjectWrapperZzi != null) {
                return (android.graphics.drawable.Drawable) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperZzi);
            }
            return null;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final com.google.android.gms.ads.VideoController getVideoController() {
        try {
            if (this.zza.zzh() != null) {
                this.zzb.zzb(this.zza.zzh());
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception occurred while getting video controller", e);
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean hasVideoContent() {
        try {
            return this.zza.zzl();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final void setMainImage(android.graphics.drawable.Drawable drawable) {
        try {
            this.zza.zzj(com.google.android.gms.dynamic.ObjectWrapper.wrap(drawable));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final com.google.android.gms.internal.ads.zzbgq zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean zzb() {
        try {
            return this.zza.zzk();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return false;
        }
    }

    public final com.google.android.gms.internal.ads.zzbft zzc() {
        return this.zza;
    }
}
