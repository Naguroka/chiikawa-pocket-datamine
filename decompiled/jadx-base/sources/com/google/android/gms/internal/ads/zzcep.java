package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcep implements android.content.DialogInterface.OnCancelListener {
    final /* synthetic */ android.webkit.JsResult zza;

    zzcep(android.webkit.JsResult jsResult) {
        this.zza = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.zza.cancel();
    }
}
