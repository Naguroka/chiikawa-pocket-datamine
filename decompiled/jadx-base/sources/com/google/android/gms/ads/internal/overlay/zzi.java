package com.google.android.gms.ads.internal.overlay;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzi {
    public final int zza;
    public final android.view.ViewGroup.LayoutParams zzb;
    public final android.view.ViewGroup zzc;
    public final android.content.Context zzd;

    public zzi(com.google.android.gms.internal.ads.zzcex zzcexVar) throws com.google.android.gms.ads.internal.overlay.zzg {
        this.zzb = zzcexVar.getLayoutParams();
        android.view.ViewParent parent = zzcexVar.getParent();
        this.zzd = zzcexVar.zzE();
        if (parent == null || !(parent instanceof android.view.ViewGroup)) {
            throw new com.google.android.gms.ads.internal.overlay.zzg("Could not get the parent of the WebView for an overlay.");
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        this.zzc = viewGroup;
        this.zza = viewGroup.indexOfChild(zzcexVar.zzF());
        viewGroup.removeView(zzcexVar.zzF());
        zzcexVar.zzaq(true);
    }
}
