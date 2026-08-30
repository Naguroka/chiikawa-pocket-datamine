package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbfj extends com.google.android.gms.internal.ads.zzbfv {
    private final android.graphics.drawable.Drawable zza;
    private final android.net.Uri zzb;
    private final double zzc;
    private final int zzd;
    private final int zze;

    public zzbfj(android.graphics.drawable.Drawable drawable, android.net.Uri uri, double d, int i, int i2) {
        this.zza = drawable;
        this.zzb = uri;
        this.zzc = d;
        this.zzd = i;
        this.zze = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final double zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final int zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final android.net.Uri zze() throws android.os.RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final com.google.android.gms.dynamic.IObjectWrapper zzf() throws android.os.RemoteException {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza);
    }
}
