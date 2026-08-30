package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f2265a;

    public p(android.content.Context context) {
        this.f2265a = context;
    }

    static java.lang.String b(android.content.Context context) {
        try {
            android.os.Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString("local_testing_dir");
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    final android.content.Context a() {
        return this.f2265a;
    }
}
