package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SpliceInsertCommand extends com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceCommand {
    public static java.lang.String[] A0D = {"o7T1oZxGxBAHWlRkOQbegsoO93grXIxk", "XvHj8Hk7hABY8IbbTIjHE9pA", "b34rJCODGAR2kw7", "DkxrTnoqNZJiwxANPjTMYz", "HEmBXoCf3O0IVvOMBCnyZOWE", "qlaxw3mTgaR0aM1", "MzIHyiWSWVKcGZIDQW3LWEN9ullkmdDP", "EF2bbwfelQ72cJWGrchq3sqAmXqEDeOA"};
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceInsertCommand> CREATOR = new com.facebook.ads.redexgen.core.C0657Du();
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final java.util.List<com.facebook.ads.redexgen.core.C0658Dv> A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 27 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, java.util.List<com.facebook.ads.redexgen.core.C0658Dv> list, boolean z5, long j4, int i, int i2, int i3) {
        this.A06 = j;
        this.A0B = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A0C = z4;
        this.A05 = j2;
        this.A04 = j3;
        this.A07 = java.util.Collections.unmodifiableList(list);
        this.A08 = z5;
        this.A03 = j4;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public SpliceInsertCommand(android.os.Parcel parcel) {
        this.A06 = parcel.readLong();
        this.A0B = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        this.A0A = parcel.readByte() == 1;
        this.A0C = parcel.readByte() == 1;
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int i = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(com.facebook.ads.redexgen.core.C0658Dv.A00(parcel));
        }
        this.A07 = java.util.Collections.unmodifiableList(arrayList);
        int componentSpliceListSize = parcel.readByte();
        this.A08 = componentSpliceListSize == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListSize2 = parcel.readInt();
        this.A02 = componentSpliceListSize2;
        int componentSpliceListSize3 = parcel.readInt();
        this.A00 = componentSpliceListSize3;
        int componentSpliceListSize4 = parcel.readInt();
        this.A01 = componentSpliceListSize4;
    }

    public /* synthetic */ SpliceInsertCommand(android.os.Parcel parcel, com.facebook.ads.redexgen.core.C0657Du c0657Du) {
        this(parcel);
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceInsertCommand A00(com.facebook.ads.redexgen.core.I4 i4, long j, com.facebook.ads.redexgen.core.IG ig) {
        long jA0M = i4.A0M();
        boolean z = (i4.A0E() & 128) != 0;
        boolean z2 = false;
        boolean outOfNetworkIndicator = false;
        boolean z3 = false;
        long jA00 = androidx.media3.common.C.TIME_UNSET;
        java.util.List listEmptyList = java.util.Collections.emptyList();
        int iA0I = 0;
        int iA0E = 0;
        int iA0E2 = 0;
        boolean z4 = false;
        long jA0M2 = androidx.media3.common.C.TIME_UNSET;
        if (!z) {
            int iA0E3 = i4.A0E();
            z2 = (iA0E3 & 128) != 0;
            outOfNetworkIndicator = (iA0E3 & 64) != 0;
            boolean autoReturn = (iA0E3 & 32) != 0;
            int i = iA0E3 & 16;
            if (A0D[3].length() != 22) {
                throw new java.lang.RuntimeException();
            }
            A0D[3] = "PfD4phwgK3fDtd36VsgCIY";
            if (i != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (outOfNetworkIndicator && !z3) {
                jA00 = com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.TimeSignalCommand.A00(i4, j);
            }
            if (!outOfNetworkIndicator) {
                int componentCount = i4.A0E();
                listEmptyList = new java.util.ArrayList(componentCount);
                for (int i2 = 0; i2 < componentCount; i2++) {
                    int componentTag = i4.A0E();
                    long jA01 = androidx.media3.common.C.TIME_UNSET;
                    if (!z3) {
                        jA01 = com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.TimeSignalCommand.A00(i4, j);
                    }
                    listEmptyList.add(new com.facebook.ads.redexgen.core.C0658Dv(componentTag, jA01, ig.A07(jA01), null));
                }
            }
            if (autoReturn) {
                long jA0E = i4.A0E();
                z4 = (jA0E & 128) != 0;
                jA0M2 = (1000 * (((jA0E & 1) << 32) | i4.A0M())) / 90;
            }
            iA0I = i4.A0I();
            iA0E = i4.A0E();
            iA0E2 = i4.A0E();
        }
        return new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceInsertCommand(jA0M, z, z2, outOfNetworkIndicator, z3, jA00, ig.A07(jA00), listEmptyList, z4, jA0M2, iA0I, iA0E, iA0E2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        int size = this.A07.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            java.util.List<com.facebook.ads.redexgen.core.C0658Dv> list = this.A07;
            java.lang.String[] strArr = A0D;
            if (strArr[2].length() != strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0D;
            strArr2[1] = "4YWbA25kauTneX5iGtOo38Lw";
            strArr2[4] = "7oIVhYtWgczHhLZ4eBK9i0jf";
            list.get(i2).A01(parcel);
        }
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
