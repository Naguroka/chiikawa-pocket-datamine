package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzok extends android.database.ContentObserver {
    final /* synthetic */ com.google.android.gms.internal.ads.zzon zza;
    private final android.content.ContentResolver zzb;
    private final android.net.Uri zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzok(com.google.android.gms.internal.ads.zzon zzonVar, android.os.Handler handler, android.content.ContentResolver contentResolver, android.net.Uri uri) {
        super(handler);
        this.zza = zzonVar;
        this.zzb = contentResolver;
        this.zzc = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        com.google.android.gms.internal.ads.zzon zzonVar = this.zza;
        this.zza.zzj(com.google.android.gms.internal.ads.zzoi.zzc(zzonVar.zza, zzonVar.zzh, zzonVar.zzg));
    }

    public final void zza() {
        this.zzb.registerContentObserver(this.zzc, false, this);
    }

    public final void zzb() {
        this.zzb.unregisterContentObserver(this);
    }
}
