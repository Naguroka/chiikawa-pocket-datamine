package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzceu implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ android.webkit.JsPromptResult zza;
    final /* synthetic */ android.widget.EditText zzb;

    zzceu(android.webkit.JsPromptResult jsPromptResult, android.widget.EditText editText) {
        this.zza = jsPromptResult;
        this.zzb = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        this.zza.confirm(this.zzb.getText().toString());
    }
}
