package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.assetpacks.internal.o f2218a = new com.google.android.play.core.assetpacks.internal.o("PackageStateCache");
    private final android.content.Context b;
    private int c = -1;

    ed(android.content.Context context) {
        this.b = context;
    }

    public final synchronized int a() {
        if (this.c == -1) {
            try {
                this.c = this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 0).versionCode;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                f2218a.b("The current version of the app could not be retrieved", new java.lang.Object[0]);
            }
        }
        return this.c;
    }
}
