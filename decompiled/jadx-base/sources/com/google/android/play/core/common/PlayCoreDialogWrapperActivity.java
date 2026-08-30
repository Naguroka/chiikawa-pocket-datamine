package com.google.android.play.core.common;

/* JADX INFO: compiled from: com.google.android.play:core-common@@2.0.4 */
/* JADX INFO: loaded from: classes5.dex */
public class PlayCoreDialogWrapperActivity extends android.app.Activity {
    private android.os.ResultReceiver zza;

    private final void zza() {
        android.os.ResultReceiver resultReceiver = this.zza;
        if (resultReceiver != null) {
            resultReceiver.send(3, new android.os.Bundle());
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, android.content.Intent intent) {
        android.os.ResultReceiver resultReceiver;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && (resultReceiver = this.zza) != null) {
            if (i2 == -1) {
                resultReceiver.send(1, new android.os.Bundle());
            } else if (i2 == 0) {
                resultReceiver.send(2, new android.os.Bundle());
            }
        }
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        android.content.Intent intent;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("window_flags", intExtra);
            intent = intent2;
        } else {
            intent = null;
        }
        super.onCreate(bundle);
        if (bundle != null) {
            this.zza = (android.os.ResultReceiver) bundle.getParcelable("result_receiver");
            return;
        }
        this.zza = (android.os.ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        android.os.Bundle extras = getIntent().getExtras();
        android.app.PendingIntent pendingIntent = extras != null ? (android.app.PendingIntent) extras.get("confirmation_intent") : null;
        if (extras == null || pendingIntent == null) {
            zza();
            finish();
        } else {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 0, intent, 0, 0, 0);
            } catch (android.content.IntentSender.SendIntentException unused) {
                zza();
                finish();
            }
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.putParcelable("result_receiver", this.zza);
    }
}
