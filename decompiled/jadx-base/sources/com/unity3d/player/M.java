package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Class f3878a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final int d;
    public volatile java.lang.reflect.Member e;

    M(java.lang.Class cls, java.lang.String str, java.lang.String str2) {
        this.f3878a = cls;
        this.b = str;
        this.c = str2;
        this.d = str2.hashCode() + ((str.hashCode() + ((cls.hashCode() + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.unity3d.player.M)) {
            return false;
        }
        com.unity3d.player.M m = (com.unity3d.player.M) obj;
        return this.d == m.d && this.c.equals(m.c) && this.b.equals(m.b) && this.f3878a.equals(m.f3878a);
    }

    public final int hashCode() {
        return this.d;
    }
}
