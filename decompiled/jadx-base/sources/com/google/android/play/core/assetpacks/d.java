package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.google.android.play.core.assetpacks.a f2191a;

    static synchronized com.google.android.play.core.assetpacks.a a(android.content.Context context) {
        if (f2191a == null) {
            com.google.android.play.core.assetpacks.cd cdVar = new com.google.android.play.core.assetpacks.cd(null);
            cdVar.b(new com.google.android.play.core.assetpacks.p(com.google.android.play.core.assetpacks.internal.ag.a(context)));
            f2191a = cdVar.a();
        }
        return f2191a;
    }
}
