package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dh, reason: from Kotlin metadata */
/* JADX INFO: loaded from: assets/audience_network.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000eJ\u0016\u0010\u000f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u0007J*\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\u001a\u0010\u0012\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\f0\u0013J&\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\b2\u000e\u0010\u0016\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\tJ\u001e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\u000e\u0010\u0016\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\tJ\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0007J\u0016\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\bR.\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t0\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/instagram/common/viewpoint/core/ViewpointRegistry;", "", "qeConfig", "Lcom/instagram/common/viewpoint/core/ViewpointQeConfig;", "(Lcom/instagram/common/viewpoint/core/ViewpointQeConfig;)V", "multiViewpointDataMap", "", "Lcom/meta/analytics/dsp/uinode/DspViewableNode;", "Lcom/instagram/common/viewpoint/core/SharedViewpointManager$UniqueKey;", "Lcom/instagram/common/viewpoint/core/ViewpointData;", "viewpointDataMap", "getEligibleViews", "", "result", "", "getViewpointData", "node", "iterateMultiViewpointData", "action", "Lkotlin/Function1;", "registerView", com.ironsource.y8.h.W, "viewpointData", "unregisterView", "fbandroid.java.com.instagram.common.viewpoint.core.core_an"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ViewpointRegistry {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"hdmlO0", "Pao0VUuQuwhiUKXn89wfKbyo9VlN", "lRas", "TeEMb6eZZD5whrU9be0IX5ZV1M9RKr26", "Qnqbn5lACluJ2ApCqm5BpSPW4vhAMGtg", "gvJZrbHq4P5HQU5ufyPQZZXTOJgB", "vCidj0D7LJg5PqPuMk2VvvwKDqfmQpdZ", "0ZH2VL3AtCsRULFWGVsN9oD"};
    public final com.facebook.ads.redexgen.core.ViewpointQeConfig A00;
    public final java.util.Map<com.facebook.ads.redexgen.core.DspViewableNode, java.util.Map<com.facebook.ads.redexgen.core.C1430dt, com.facebook.ads.redexgen.core.Cdo<?, ?>>> A01;
    public final java.util.Map<com.facebook.ads.redexgen.core.DspViewableNode, com.facebook.ads.redexgen.core.Cdo<?, ?>> A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A04[2].length() == 16) {
                throw new java.lang.RuntimeException();
            }
            A04[4] = "98jXpaahab3bDGJdYqYLl1lSw3QVyboZ";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 47);
            i4++;
        }
    }

    public static void A01() {
        A03 = new byte[]{-18, -10, -7, -3, 2, -98, -96, -79, -90, -84, -85, -94, -100, -80, -16, -15, -26, -25, 16, 4, -30, 14, 13, 5, 8, 6, -13, -26, -12, -10, -19, -11, -49, -62, -66, -48, -55, -56, -62, -57, -51, -99, -70, -51, -70};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A05(com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode, com.facebook.ads.redexgen.core.C1430dt c1430dt, com.facebook.ads.redexgen.core.Cdo<?, ?> cdo) {
        com.facebook.ads.redexgen.core.C1397d7.A07(dspViewableNode, A00(14, 4, 83));
        com.facebook.ads.redexgen.core.C1397d7.A07(c1430dt, A00(11, 3, 8));
        com.facebook.ads.redexgen.core.C1397d7.A07(cdo, A00(32, 13, 42));
        java.util.Map<com.facebook.ads.redexgen.core.DspViewableNode, java.util.Map<com.facebook.ads.redexgen.core.C1430dt, com.facebook.ads.redexgen.core.Cdo<?, ?>>> map = this.A01;
        java.util.WeakHashMap weakHashMap = map.get(dspViewableNode);
        if (weakHashMap == null) {
            weakHashMap = new java.util.WeakHashMap();
            map.put(dspViewableNode, weakHashMap);
        }
        weakHashMap.put(c1430dt, cdo);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A07(com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode, com.facebook.ads.redexgen.core.InterfaceC0728Hd<? super com.facebook.ads.redexgen.core.Cdo<?, ?>, com.facebook.ads.redexgen.core.C1406dK> interfaceC0728Hd) {
        java.util.Collection<com.facebook.ads.redexgen.core.Cdo<?, ?>> collectionValues;
        com.facebook.ads.redexgen.core.C1397d7.A07(dspViewableNode, A00(14, 4, 83));
        com.facebook.ads.redexgen.core.C1397d7.A07(interfaceC0728Hd, A00(5, 6, 14));
        com.facebook.ads.redexgen.core.Cdo<?, ?> cdo = this.A02.get(dspViewableNode);
        if (cdo != null) {
            interfaceC0728Hd.A9K(cdo);
        }
        java.util.Map<com.facebook.ads.redexgen.core.C1430dt, com.facebook.ads.redexgen.core.Cdo<?, ?>> map = this.A01.get(dspViewableNode);
        if (map != null && (collectionValues = map.values()) != null) {
            java.util.Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                interfaceC0728Hd.A9K((com.facebook.ads.redexgen.core.Cdo) it.next());
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized void A08(java.util.Collection<com.facebook.ads.redexgen.core.DspViewableNode> collection) {
        com.facebook.ads.redexgen.core.C1397d7.A07(collection, A00(26, 6, 82));
        collection.addAll(this.A02.keySet());
        if (this.A00.A00) {
            java.util.Set<com.facebook.ads.redexgen.core.DspViewableNode> setKeySet = this.A01.keySet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : setKeySet) {
                if (!this.A02.containsKey((com.facebook.ads.redexgen.core.DspViewableNode) obj)) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                collection.add((com.facebook.ads.redexgen.core.DspViewableNode) it.next());
            }
        }
    }

    static {
        A01();
    }

    public ViewpointRegistry(com.facebook.ads.redexgen.core.ViewpointQeConfig viewpointQeConfig) {
        com.facebook.ads.redexgen.core.C1397d7.A07(viewpointQeConfig, A00(18, 8, 112));
        this.A00 = viewpointQeConfig;
        this.A02 = new java.util.WeakHashMap();
        this.A01 = new java.util.WeakHashMap();
    }

    public final synchronized com.facebook.ads.redexgen.core.Cdo<?, ?> A02(com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode) {
        com.facebook.ads.redexgen.core.Cdo<?, ?> cdo;
        com.facebook.ads.redexgen.core.C1397d7.A07(dspViewableNode, A00(14, 4, 83));
        cdo = this.A02.get(dspViewableNode);
        if (cdo == null) {
            cdo = com.facebook.ads.redexgen.core.Cdo.A08;
            com.facebook.ads.redexgen.core.C1397d7.A06(cdo, A00(0, 5, 122));
        }
        return cdo;
    }

    public final synchronized void A03(com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode) {
        com.facebook.ads.redexgen.core.C1397d7.A07(dspViewableNode, A00(14, 4, 83));
        this.A02.remove(dspViewableNode);
    }

    public final synchronized void A04(com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode, com.facebook.ads.redexgen.core.C1430dt c1430dt) {
        com.facebook.ads.redexgen.core.C1397d7.A07(dspViewableNode, A00(14, 4, 83));
        com.facebook.ads.redexgen.core.C1397d7.A07(c1430dt, A00(11, 3, 8));
        java.util.Map<com.facebook.ads.redexgen.core.C1430dt, com.facebook.ads.redexgen.core.Cdo<?, ?>> map = this.A01.get(dspViewableNode);
        if (map != null) {
            map.remove(c1430dt);
            if (map.isEmpty()) {
                this.A01.remove(dspViewableNode);
            }
        }
    }

    public final synchronized void A06(com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode, com.facebook.ads.redexgen.core.Cdo<?, ?> cdo) {
        com.facebook.ads.redexgen.core.C1397d7.A07(dspViewableNode, A00(14, 4, 83));
        com.facebook.ads.redexgen.core.C1397d7.A07(cdo, A00(32, 13, 42));
        this.A02.put(dspViewableNode, cdo);
    }
}
