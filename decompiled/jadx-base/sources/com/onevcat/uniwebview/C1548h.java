package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1548h extends com.onevcat.uniwebview.AbstractC1554j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3725a;
    public final byte[] b;

    public C1548h(java.lang.String url, byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        this.f3725a = url;
        this.b = data;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(com.onevcat.uniwebview.C1548h.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.onevcat.uniwebview.DownloadTaskType.DataUrl");
        }
        com.onevcat.uniwebview.C1548h c1548h = (com.onevcat.uniwebview.C1548h) obj;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.f3725a, c1548h.f3725a)) {
            return java.util.Arrays.equals(this.b, c1548h.b);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.b) + (this.f3725a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "DataUrl(url=" + this.f3725a + ", data=" + java.util.Arrays.toString(this.b) + ')';
    }
}
