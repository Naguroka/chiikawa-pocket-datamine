package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/instagram/common/viewpoint/core/ViewpointViewNode$Companion;", "", "()V", "viewToNodeMap", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "Lcom/instagram/common/viewpoint/core/ViewpointViewNode;", "forView", "view", "fbandroid.java.com.instagram.common.viewpoint.core.core_an"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class C1412dY {
    public static byte[] A00;

    static {
        A01();
    }

    public /* synthetic */ C1412dY(com.facebook.ads.redexgen.core.AbstractC1398d8 abstractC1398d8) {
        this();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 60);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-3, -16, -20, -2};
    }

    public C1412dY() {
    }

    @kotlin.jvm.JvmStatic
    public final com.facebook.ads.redexgen.core.ViewpointViewNode A02(android.view.View view) {
        com.facebook.ads.redexgen.core.C1397d7.A07(view, A00(0, 4, 75));
        java.util.WeakHashMap weakHashMap = com.facebook.ads.redexgen.core.ViewpointViewNode.A04;
        java.lang.Object viewpointViewNode = weakHashMap.get(view);
        if (viewpointViewNode == null) {
            viewpointViewNode = new com.facebook.ads.redexgen.core.ViewpointViewNode(view, null);
            weakHashMap.put(view, viewpointViewNode);
        }
        return (com.facebook.ads.redexgen.core.ViewpointViewNode) viewpointViewNode;
    }
}
