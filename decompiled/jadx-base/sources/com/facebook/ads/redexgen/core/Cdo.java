package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.do, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Cdo<ModelType, StateType> {
    public static byte[] A07;
    public static final com.facebook.ads.redexgen.core.Cdo A08;
    public java.lang.String A00;
    public boolean A01;
    public final com.facebook.ads.redexgen.core.Cdo A02;
    public final ModelType A03;
    public final StateType A04;
    public final java.lang.String A05;
    public final java.util.List<com.facebook.ads.redexgen.core.InterfaceC1429dr<ModelType, StateType>> A06;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 26);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{78, 113, 125, 111, 104, 119, 113, 118, 108, 92, 121, 108, 121, 56, 107, 112, 119, 109, 116, 124, 56, 118, 119, 108, 56, 123, 119, 118, 108, 121, 113, 118, 56, 121, 56, 110, 113, 125, 111, 56, 121, 107, 56, 117, 119, 124, 125, 116, 83, 91, 70, 66, 79};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A03(com.facebook.ads.redexgen.core.InterfaceC1417dd interfaceC1417dd) {
        java.util.Iterator<com.facebook.ads.redexgen.core.InterfaceC1429dr<ModelType, StateType>> it = this.A06.iterator();
        while (it.hasNext()) {
            it.next().A5y(this, interfaceC1417dd);
        }
        if (interfaceC1417dd.A8h(this) == com.facebook.ads.redexgen.core.EnumC1418de.A02) {
            this.A01 = true;
        }
    }

    static {
        A02();
        A08 = new com.facebook.ads.redexgen.core.Cdo(null, null, A01(48, 5, 44), A01(48, 5, 44), java.util.Collections.emptyList(), A08);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.do != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dp != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Illegal instructions before constructor call */
    public Cdo(com.facebook.ads.redexgen.core.C1427dp<ModelType, StateType> c1427dp) {
        java.util.List listEmptyList;
        java.lang.Object obj = c1427dp.A02;
        java.lang.Object obj2 = c1427dp.A03;
        java.lang.String str = c1427dp.A05;
        java.lang.String str2 = c1427dp.A05;
        if (c1427dp.A01 == null) {
            listEmptyList = java.util.Collections.emptyList();
        } else {
            listEmptyList = c1427dp.A01;
        }
        this(obj, obj2, str, str2, listEmptyList, c1427dp.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.do != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public Cdo(ModelType modeltype, StateType statetype, java.lang.String str, java.lang.String str2, java.util.List<com.facebook.ads.redexgen.core.InterfaceC1429dr<ModelType, StateType>> list, com.facebook.ads.redexgen.core.Cdo cdo) {
        if (!(modeltype instanceof android.view.View)) {
            this.A03 = modeltype;
            this.A04 = statetype;
            this.A05 = str;
            this.A00 = str2;
            this.A02 = cdo;
            this.A01 = false;
            this.A06 = list;
            return;
        }
        throw new java.lang.IllegalArgumentException(A01(0, 48, 2));
    }

    public static <ModelType, StateType> com.facebook.ads.redexgen.core.C1427dp<ModelType, StateType> A00(ModelType model, StateType state, java.lang.String str) {
        return new com.facebook.ads.redexgen.core.C1427dp<>(model, state, str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.do != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public final boolean A04() {
        return this.A01;
    }
}
