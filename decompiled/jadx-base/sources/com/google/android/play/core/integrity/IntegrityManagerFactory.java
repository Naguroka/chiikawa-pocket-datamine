package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
public class IntegrityManagerFactory {
    private IntegrityManagerFactory() {
    }

    public static com.google.android.play.core.integrity.IntegrityManager create(android.content.Context context) {
        return com.google.android.play.core.integrity.z.a(context).a();
    }

    public static com.google.android.play.core.integrity.StandardIntegrityManager createStandard(android.content.Context context) {
        return com.google.android.play.core.integrity.ax.a(context).a();
    }
}
