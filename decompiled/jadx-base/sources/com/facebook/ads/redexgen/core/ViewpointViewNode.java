package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.I9, reason: from Kotlin metadata */
/* JADX INFO: loaded from: assets/audience_network.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J \u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00030\u00030\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/instagram/common/viewpoint/core/ViewpointViewNode;", "Lcom/meta/analytics/dsp/uinode/DspViewableNode;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "getView", "()Landroid/view/View;", "viewRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "equals", "", "other", "", "getVisibleRectWithinViewport", "outGlobalVisibleRect", "Landroid/graphics/Rect;", "outGlobalRect", "viewportRect", "hashCode", "", "Companion", "fbandroid.java.com.instagram.common.viewpoint.core.core_an"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ViewpointViewNode implements com.facebook.ads.redexgen.core.DspViewableNode {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"qlxMVOnC9COcKZYZMIIp", "e0umeVRVCdZ74AfkeJbH87y4T07IZLh0", "i66o8C63ky1KE2dtbuTW4TOWqloIKDrs", "LkxvoQ7DD1pBAo3rq5X8aF2iImmrJAYT", "6eVsPVOukcdBuHl172QQtpwtpqadKDAQ", "cx1fs60kw", "R4DtDeY0gnGqEQjTJlumZIRTz9kcJt7M", "qFc9SandmZqx0yjNiQ6hc35paacWJuqv"};
    public static final com.facebook.ads.redexgen.core.C1412dY A03;
    public static final java.util.WeakHashMap<android.view.View, com.facebook.ads.redexgen.core.ViewpointViewNode> A04;
    public final java.lang.ref.WeakReference<android.view.View> A00;

    public /* synthetic */ ViewpointViewNode(android.view.View view, com.facebook.ads.redexgen.core.AbstractC1398d8 abstractC1398d8) {
        this(view);
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 29);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {35, 57, 56, 11, 32, 35, 46, 45, 32, 30, 41, 47, 56, 70, 92, 93, 110, 69, 70, 75, 72, 69, 127, 64, 90, 64, 75, 69, 76, 123, 76, 74, 93, 62, 33, 45, okio.Utf8.REPLACEMENT_BYTE, 56, 39, 58, 60, 26, 45, 43, 60};
        java.lang.String[] strArr = A02;
        if (strArr[2].charAt(28) != strArr[4].charAt(28)) {
            throw new java.lang.RuntimeException();
        }
        A02[0] = "5c7wFedRmnB8vDCVoIYp";
        A01 = bArr;
    }

    static {
        A03();
        A03 = new com.facebook.ads.redexgen.core.C1412dY(null);
        A04 = new java.util.WeakHashMap<>();
    }

    public ViewpointViewNode(android.view.View view) {
        this.A00 = new java.lang.ref.WeakReference<>(view);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.ads.redexgen.core.ViewpointViewNode A00(android.view.View view) {
        return A03.A02(view);
    }

    @Override // com.facebook.ads.redexgen.core.DspViewableNode
    public final boolean A8l(android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Rect rect3) {
        com.facebook.ads.redexgen.core.C1397d7.A07(rect, A01(13, 20, 52));
        com.facebook.ads.redexgen.core.C1397d7.A07(rect2, A01(0, 13, 81));
        com.facebook.ads.redexgen.core.C1397d7.A07(rect3, A01(33, 12, 85));
        android.view.View view = this.A00.get();
        if (view == null) {
            return false;
        }
        return com.facebook.ads.redexgen.core.AbstractC1411dX.A00(view, rect, rect2, rect3);
    }

    public final boolean equals(java.lang.Object other) {
        android.view.View view;
        if (other == this) {
            return true;
        }
        if (other != null) {
            java.lang.Class<?> cls = other.getClass();
            java.lang.String[] strArr = A02;
            if (strArr[2].charAt(28) != strArr[4].charAt(28)) {
                throw new java.lang.RuntimeException();
            }
            A02[1] = "EpRMW7zpKY57PfT1pdGczBJUTQVGWfux";
            return com.facebook.ads.redexgen.core.C1397d7.A0A(cls, getClass()) && (view = this.A00.get()) != null && view == ((com.facebook.ads.redexgen.core.ViewpointViewNode) other).A00.get();
        }
        return false;
    }

    public final int hashCode() {
        android.view.View view = this.A00.get();
        if (view != null) {
            return view.hashCode();
        }
        return 0;
    }
}
