package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbki implements com.google.android.gms.internal.ads.zzbjp {
    private final android.content.Context zza;

    public zzbki(android.content.Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(java.lang.Object obj, java.util.Map map) {
        if (!map.containsKey("text") || android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("text"))) {
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("Opening Share Sheet with text: ".concat(java.lang.String.valueOf((java.lang.String) map.get("text"))));
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType(androidx.webkit.internal.AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", (java.lang.String) map.get("text"));
        if (map.containsKey(com.ironsource.y8.h.D0)) {
            intent.putExtra("android.intent.extra.TITLE", (java.lang.String) map.get(com.ironsource.y8.h.D0));
        }
        try {
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzT(this.zza, intent);
        } catch (java.lang.RuntimeException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to open Share Sheet", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
