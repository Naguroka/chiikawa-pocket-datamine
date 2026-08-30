package com.google.android.gms.games.internal.v2.resolution;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class GamesResolutionActivity extends android.app.Activity {
    private android.os.ResultReceiver zza;

    private final void zza(int i, android.content.Intent intent) {
        android.os.Bundle bundle;
        android.os.ResultReceiver resultReceiver = this.zza;
        if (resultReceiver == null) {
            return;
        }
        if (intent == null) {
            bundle = new android.os.Bundle();
        } else {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putParcelable("resultData", intent);
            bundle = bundle2;
        }
        resultReceiver.send(i, bundle);
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            zza(i2, intent);
            finish();
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(36);
        sb.append("Unexpected request code: ");
        sb.append(i);
        com.google.android.gms.internal.games_v2.zzez.zzc("ResultActivity", sb.toString());
        zza(0, intent);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zza = (android.os.ResultReceiver) com.google.android.gms.common.internal.Preconditions.checkNotNull((android.os.ResultReceiver) bundle.getParcelable("resultReceiver"));
            return;
        }
        this.zza = (android.os.ResultReceiver) com.google.android.gms.common.internal.Preconditions.checkNotNull((android.os.ResultReceiver) getIntent().getParcelableExtra("resultReceiver"));
        try {
            startIntentSenderForResult(((android.app.PendingIntent) com.google.android.gms.common.internal.Preconditions.checkNotNull((android.app.PendingIntent) getIntent().getParcelableExtra(com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT))).getIntentSender(), 0, null, 0, 0, 0);
        } catch (android.content.IntentSender.SendIntentException e) {
            com.google.android.gms.internal.games_v2.zzez.zzd("ResultActivity", "Failed to launch", e);
            zza(0, null);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("resultReceiver", this.zza);
    }
}
