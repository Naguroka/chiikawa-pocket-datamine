package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1563m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3739a;
    public final byte[] b;

    public C1563m(java.lang.String str, byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        this.f3739a = str;
        this.b = data;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.onevcat.uniwebview.C1563m)) {
            return false;
        }
        com.onevcat.uniwebview.C1563m c1563m = (com.onevcat.uniwebview.C1563m) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f3739a, c1563m.f3739a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c1563m.b);
    }

    public final int hashCode() {
        java.lang.String str = this.f3739a;
        return java.util.Arrays.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final java.lang.String toString() {
        return "ParsedDataUrl(mediaType=" + this.f3739a + ", data=" + java.util.Arrays.toString(this.b) + ')';
    }
}
