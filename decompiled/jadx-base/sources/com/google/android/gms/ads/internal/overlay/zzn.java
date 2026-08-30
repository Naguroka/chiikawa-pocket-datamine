package com.google.android.gms.ads.internal.overlay;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzn {
    public static final void zza(android.content.Context context, com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel, boolean z, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        if (adOverlayInfoParcel.zzk == 4 && adOverlayInfoParcel.zzc == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            com.google.android.gms.internal.ads.zzdds zzddsVar = adOverlayInfoParcel.zzu;
            if (zzddsVar != null) {
                zzddsVar.zzdd();
            }
            android.app.Activity activityZzi = adOverlayInfoParcel.zzd.zzi();
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = adOverlayInfoParcel.zza;
            android.content.Context context2 = (zzcVar == null || !zzcVar.zzj || activityZzi == null) ? context : activityZzi;
            com.google.android.gms.ads.internal.zzv.zzi();
            com.google.android.gms.ads.internal.overlay.zzc zzcVar2 = adOverlayInfoParcel.zza;
            com.google.android.gms.ads.internal.overlay.zza.zzb(context2, zzcVar2, adOverlayInfoParcel.zzi, zzcVar2 != null ? zzcVar2.zzi : null, zzdrwVar, adOverlayInfoParcel.zzq);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, com.google.android.gms.ads.AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzm.isClientJar);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmU)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzX(context, intent, zzdrwVar, adOverlayInfoParcel.zzq);
        } else {
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzT(context, intent);
        }
    }
}
