package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zac implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ android.app.Activity zaa;
    final /* synthetic */ int zab;
    final /* synthetic */ androidx.activity.result.ActivityResultLauncher zac;
    final /* synthetic */ com.google.android.gms.common.GoogleApiAvailability zad;

    zac(com.google.android.gms.common.GoogleApiAvailability googleApiAvailability, android.app.Activity activity, int i, androidx.activity.result.ActivityResultLauncher activityResultLauncher) {
        this.zaa = activity;
        this.zab = i;
        this.zac = activityResultLauncher;
        this.zad = googleApiAvailability;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        android.app.PendingIntent errorResolutionPendingIntent = this.zad.getErrorResolutionPendingIntent(this.zaa, this.zab, 0);
        if (errorResolutionPendingIntent == null) {
            return;
        }
        this.zac.launch(new androidx.activity.result.IntentSenderRequest.Builder(errorResolutionPendingIntent.getIntentSender()).build());
    }
}
