package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.assetpacks.internal.o f2239a = new com.google.android.play.core.assetpacks.internal.o("SplitInstallInfoProvider");
    private final android.content.Context b;
    private final java.lang.String c;

    ad(android.content.Context context) {
        this.b = context;
        this.c = context.getPackageName();
    }

    public final java.util.Set a() {
        android.content.pm.PackageInfo packageInfo;
        try {
            packageInfo = this.b.getPackageManager().getPackageInfo(this.c, 128);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            f2239a.b("App is not found in PackageManager", new java.lang.Object[0]);
            packageInfo = null;
        }
        if (packageInfo == null || packageInfo.applicationInfo == null) {
            return new java.util.HashSet();
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        android.os.Bundle bundle = packageInfo.applicationInfo.metaData;
        java.util.HashSet<java.lang.String> hashSet2 = new java.util.HashSet();
        if (bundle != null) {
            java.lang.String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                f2239a.a("App has no fused modules.", new java.lang.Object[0]);
            } else {
                java.util.Collections.addAll(hashSet2, string.split(",", -1));
                hashSet2.remove("");
                hashSet2.remove(androidx.media3.extractor.text.ttml.TtmlNode.RUBY_BASE);
            }
        }
        java.lang.String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            f2239a.a("Adding splits from package manager: %s", java.util.Arrays.toString(strArr));
            java.util.Collections.addAll(hashSet2, strArr);
        } else {
            f2239a.a("No splits are found or app cannot be found in package manager.", new java.lang.Object[0]);
        }
        com.google.android.play.core.assetpacks.internal.ab abVarA = com.google.android.play.core.assetpacks.internal.ac.a();
        if (abVarA != null) {
            hashSet2.addAll(abVarA.a());
        }
        for (java.lang.String str : hashSet2) {
            if (!str.startsWith("config.") && !str.contains(".config.")) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }
}
