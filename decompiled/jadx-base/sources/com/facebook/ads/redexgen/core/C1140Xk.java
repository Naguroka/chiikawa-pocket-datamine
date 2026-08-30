package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1140Xk implements com.facebook.ads.redexgen.core.InterfaceC0638Db {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0638Db
    public final com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata A5N(com.facebook.ads.redexgen.core.EX ex) {
        java.nio.ByteBuffer byteBuffer = ex.A01;
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        com.facebook.ads.redexgen.core.I4 i4 = new com.facebook.ads.redexgen.core.I4(bArrArray, iLimit);
        java.lang.String strA0Q = i4.A0Q();
        java.lang.String strA0Q2 = i4.A0Q();
        long jA0M = i4.A0M();
        return new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata(new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.emsg.EventMessage(strA0Q, strA0Q2, com.facebook.ads.redexgen.core.IK.A0F(i4.A0M(), 1000L, jA0M), i4.A0M(), java.util.Arrays.copyOfRange(bArrArray, i4.A06(), iLimit), com.facebook.ads.redexgen.core.IK.A0F(i4.A0M(), 1000000L, jA0M)));
    }
}
