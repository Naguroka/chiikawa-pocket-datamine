package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1551i extends com.onevcat.uniwebview.AbstractC1554j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3728a;

    public C1551i(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        this.f3728a = url;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.onevcat.uniwebview.C1551i) && kotlin.jvm.internal.Intrinsics.areEqual(this.f3728a, ((com.onevcat.uniwebview.C1551i) obj).f3728a);
    }

    public final int hashCode() {
        return this.f3728a.hashCode();
    }

    public final java.lang.String toString() {
        return "Normal(url=" + this.f3728a + ')';
    }
}
