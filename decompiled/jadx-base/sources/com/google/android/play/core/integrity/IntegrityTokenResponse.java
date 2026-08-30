package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class IntegrityTokenResponse {
    public abstract com.google.android.gms.tasks.Task<java.lang.Integer> showDialog(android.app.Activity activity, int i);

    public abstract java.lang.String token();
}
