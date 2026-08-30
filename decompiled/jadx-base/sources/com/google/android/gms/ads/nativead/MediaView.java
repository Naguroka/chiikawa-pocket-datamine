package com.google.android.gms.ads.nativead;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class MediaView extends android.widget.FrameLayout {
    private com.google.android.gms.ads.MediaContent zza;
    private boolean zzb;
    private android.widget.ImageView.ScaleType zzc;
    private boolean zzd;
    private com.google.android.gms.ads.nativead.zzb zze;
    private com.google.android.gms.ads.nativead.zzc zzf;

    public MediaView(android.content.Context context) {
        super(context);
    }

    public com.google.android.gms.ads.MediaContent getMediaContent() {
        return this.zza;
    }

    public void setImageScaleType(android.widget.ImageView.ScaleType scaleType) {
        this.zzd = true;
        this.zzc = scaleType;
        com.google.android.gms.ads.nativead.zzc zzcVar = this.zzf;
        if (zzcVar != null) {
            zzcVar.zza.zzc(scaleType);
        }
    }

    public void setMediaContent(com.google.android.gms.ads.MediaContent mediaContent) {
        boolean zZzr;
        this.zzb = true;
        this.zza = mediaContent;
        com.google.android.gms.ads.nativead.zzb zzbVar = this.zze;
        if (zzbVar != null) {
            zzbVar.zza.zzb(mediaContent);
        }
        if (mediaContent == null) {
            return;
        }
        try {
            com.google.android.gms.internal.ads.zzbgq zzbgqVarZza = mediaContent.zza();
            if (zzbgqVarZza != null) {
                if (!mediaContent.hasVideoContent()) {
                    if (mediaContent.zzb()) {
                        zZzr = zzbgqVarZza.zzr(com.google.android.gms.dynamic.ObjectWrapper.wrap(this));
                    }
                    removeAllViews();
                }
                zZzr = zzbgqVarZza.zzs(com.google.android.gms.dynamic.ObjectWrapper.wrap(this));
                if (zZzr) {
                    return;
                }
                removeAllViews();
            }
        } catch (android.os.RemoteException e) {
            removeAllViews();
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    protected final synchronized void zza(com.google.android.gms.ads.nativead.zzb zzbVar) {
        this.zze = zzbVar;
        if (this.zzb) {
            zzbVar.zza.zzb(this.zza);
        }
    }

    protected final synchronized void zzb(com.google.android.gms.ads.nativead.zzc zzcVar) {
        this.zzf = zzcVar;
        if (this.zzd) {
            zzcVar.zza.zzc(this.zzc);
        }
    }

    public MediaView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MediaView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
