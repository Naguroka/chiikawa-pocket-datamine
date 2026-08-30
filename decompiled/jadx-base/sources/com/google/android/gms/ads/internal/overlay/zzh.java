package com.google.android.gms.ads.internal.overlay;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzh extends android.widget.RelativeLayout {
    final com.google.android.gms.ads.internal.util.zzau zza;
    boolean zzb;

    public zzh(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(context);
        com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context, str);
        this.zza = zzauVar;
        zzauVar.zzo(str2);
        zzauVar.zzn(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.zzb) {
            return false;
        }
        this.zza.zzm(motionEvent);
        return false;
    }
}
