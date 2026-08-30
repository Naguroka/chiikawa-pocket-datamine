package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.play.core.assetpacks.p f2169a;

    private cd() {
    }

    /* synthetic */ cd(com.google.android.play.core.assetpacks.cc ccVar) {
    }

    public final com.google.android.play.core.assetpacks.cd b(com.google.android.play.core.assetpacks.p pVar) {
        this.f2169a = pVar;
        return this;
    }

    public final com.google.android.play.core.assetpacks.a a() {
        com.google.android.play.core.assetpacks.p pVar = this.f2169a;
        if (pVar != null) {
            return new com.google.android.play.core.assetpacks.cb(pVar, null);
        }
        throw new java.lang.IllegalStateException(java.lang.String.valueOf(com.google.android.play.core.assetpacks.p.class.getCanonicalName()).concat(" must be set"));
    }
}
