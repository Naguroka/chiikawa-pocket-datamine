package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzces implements android.content.DialogInterface.OnCancelListener {
    final /* synthetic */ android.webkit.JsPromptResult zza;

    zzces(android.webkit.JsPromptResult jsPromptResult) {
        this.zza = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.zza.cancel();
    }
}
