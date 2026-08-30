package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class ar extends android.os.ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.play.core.integrity.as f2290a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(com.google.android.play.core.integrity.as asVar, android.os.Handler handler) {
        super(handler);
        this.f2290a = asVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, android.os.Bundle bundle) {
        if (i == 1) {
            this.f2290a.f2291a.trySetResult(3);
        } else if (i == 2) {
            this.f2290a.f2291a.trySetResult(2);
        } else {
            if (i != 3) {
                return;
            }
            this.f2290a.f2291a.trySetResult(1);
        }
    }
}
