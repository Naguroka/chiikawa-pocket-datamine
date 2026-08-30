package com.pairip.application;

/* JADX INFO: loaded from: classes2.dex */
public class Application extends android.app.Application {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(android.content.Context context) {
        com.pairip.licensecheck.LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}
