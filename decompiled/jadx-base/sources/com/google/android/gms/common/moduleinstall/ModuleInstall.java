package com.google.android.gms.common.moduleinstall;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class ModuleInstall {
    private ModuleInstall() {
    }

    public static com.google.android.gms.common.moduleinstall.ModuleInstallClient getClient(android.app.Activity activity) {
        return new com.google.android.gms.common.moduleinstall.internal.zay(activity);
    }

    public static com.google.android.gms.common.moduleinstall.ModuleInstallClient getClient(android.content.Context context) {
        return new com.google.android.gms.common.moduleinstall.internal.zay(context);
    }
}
