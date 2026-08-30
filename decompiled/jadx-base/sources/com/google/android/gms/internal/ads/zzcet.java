package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcet implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ android.webkit.JsPromptResult zza;

    zzcet(android.webkit.JsPromptResult jsPromptResult) {
        this.zza = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        this.zza.cancel();
    }
}
