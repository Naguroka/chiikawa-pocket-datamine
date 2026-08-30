package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzceq implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ android.webkit.JsResult zza;

    zzceq(android.webkit.JsResult jsResult) {
        this.zza = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        this.zza.cancel();
    }
}
