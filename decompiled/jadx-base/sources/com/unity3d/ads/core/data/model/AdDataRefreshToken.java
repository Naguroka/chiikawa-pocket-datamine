package com.unity3d.ads.core.data.model;

/* JADX INFO: compiled from: AdContext.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdDataRefreshToken;", "", "data", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getData", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.JvmInline
public final class AdDataRefreshToken {
    private final java.lang.String data;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ com.unity3d.ads.core.data.model.AdDataRefreshToken m1097boximpl(java.lang.String str) {
        return new com.unity3d.ads.core.data.model.AdDataRefreshToken(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static java.lang.String m1098constructorimpl(java.lang.String data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        return data;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1099equalsimpl(java.lang.String str, java.lang.Object obj) {
        return (obj instanceof com.unity3d.ads.core.data.model.AdDataRefreshToken) && kotlin.jvm.internal.Intrinsics.areEqual(str, ((com.unity3d.ads.core.data.model.AdDataRefreshToken) obj).m1103unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1100equalsimpl0(java.lang.String str, java.lang.String str2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1101hashCodeimpl(java.lang.String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1102toStringimpl(java.lang.String str) {
        return "AdDataRefreshToken(data=" + str + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return m1099equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m1101hashCodeimpl(this.data);
    }

    public java.lang.String toString() {
        return m1102toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.lang.String m1103unboximpl() {
        return this.data;
    }

    private /* synthetic */ AdDataRefreshToken(java.lang.String str) {
        this.data = str;
    }

    public final java.lang.String getData() {
        return this.data;
    }
}
