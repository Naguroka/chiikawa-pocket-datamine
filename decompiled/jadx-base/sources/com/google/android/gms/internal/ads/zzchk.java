package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzchk implements com.google.android.gms.internal.ads.zzher {
    public zzchk(com.google.android.gms.internal.ads.zzcha zzchaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* synthetic */ java.lang.Object zzb() {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(android.net.Uri.parse("https://play.google.com/d"));
        return intent;
    }
}
