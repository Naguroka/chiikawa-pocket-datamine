package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzo implements com.google.android.gms.internal.ads.zzbdl {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbdm zza;
    final /* synthetic */ android.content.Context zzb;
    final /* synthetic */ android.net.Uri zzc;

    zzo(com.google.android.gms.ads.internal.util.zzs zzsVar, com.google.android.gms.internal.ads.zzbdm zzbdmVar, android.content.Context context, android.net.Uri uri) {
        this.zza = zzbdmVar;
        this.zzb = context;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbdl
    public final void zza() {
        androidx.browser.customtabs.CustomTabsIntent customTabsIntentBuild = new androidx.browser.customtabs.CustomTabsIntent.Builder(this.zza.zza()).build();
        customTabsIntentBuild.intent.setPackage(com.google.android.gms.internal.ads.zzhfk.zza(this.zzb));
        customTabsIntentBuild.launchUrl(this.zzb, this.zzc);
        this.zza.zzf((android.app.Activity) this.zzb);
    }
}
