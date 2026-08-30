package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Dz {
    public static java.lang.String[] A0B = {"MbQlclBS93OpAIrGgy", "fr4nhdwawCkfl6xe", "", "jazGPK14ugDp9XSpPVwjXwSunadlaYol", "c8hCDXw30CLUJvo3hmXfNwPZepkI4Dm3", "1stzsAzc5mICw7Ui", "zsUepILv7pzPEMGeAcwpA2C", "FE9c5HnV3VVOUNIp57h4JuspLxtKtT80"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final java.util.List<com.facebook.ads.redexgen.core.C0661Dy> A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static com.facebook.ads.redexgen.core.Dz A02(com.facebook.ads.redexgen.core.I4 i4) {
        long jA0M = i4.A0M();
        boolean z = (i4.A0E() & 128) != 0;
        boolean z2 = false;
        boolean z3 = false;
        long jA0M2 = androidx.media3.common.C.TIME_UNSET;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iA0I = 0;
        int iA0E = 0;
        int iA0E2 = 0;
        boolean z4 = false;
        long jA0M3 = androidx.media3.common.C.TIME_UNSET;
        if (!z) {
            int iA0E3 = i4.A0E();
            z2 = (iA0E3 & 128) != 0;
            z3 = (iA0E3 & 64) != 0;
            int i = iA0E3 & 32;
            if (A0B[4].charAt(19) != 'f') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0B;
            strArr[1] = "lR24oTmvDHmhIRnH";
            strArr[5] = "ZGf4jEcTYFHAfCYP";
            boolean z5 = i != 0;
            if (z3) {
                jA0M2 = i4.A0M();
            }
            if (!z3) {
                int iA0E4 = i4.A0E();
                arrayList = new java.util.ArrayList(iA0E4);
                for (int i2 = 0; i2 < iA0E4; i2++) {
                    arrayList.add(new com.facebook.ads.redexgen.core.C0661Dy(i4.A0E(), i4.A0M(), null));
                }
            }
            if (z5) {
                long jA0E = i4.A0E();
                z4 = (128 & jA0E) != 0;
                jA0M3 = (1000 * (((1 & jA0E) << 32) | i4.A0M())) / 90;
            }
            iA0I = i4.A0I();
            iA0E = i4.A0E();
            iA0E2 = i4.A0E();
        }
        return new com.facebook.ads.redexgen.core.Dz(jA0M, z, z2, z3, arrayList, jA0M2, z4, jA0M3, iA0I, iA0E, iA0E2);
    }

    public Dz(long j, boolean z, boolean z2, boolean z3, java.util.List<com.facebook.ads.redexgen.core.C0661Dy> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
        this.A04 = j;
        this.A0A = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A06 = java.util.Collections.unmodifiableList(list);
        this.A05 = j2;
        this.A07 = z4;
        this.A03 = j3;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public Dz(android.os.Parcel parcel) {
        this.A04 = parcel.readLong();
        this.A0A = parcel.readByte() == 1;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        int i = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(com.facebook.ads.redexgen.core.C0661Dy.A00(parcel));
        }
        this.A06 = java.util.Collections.unmodifiableList(arrayList);
        this.A05 = parcel.readLong();
        int componentSpliceListLength = parcel.readByte();
        this.A07 = componentSpliceListLength == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListLength2 = parcel.readInt();
        this.A02 = componentSpliceListLength2;
        int componentSpliceListLength3 = parcel.readInt();
        this.A00 = componentSpliceListLength3;
        int componentSpliceListLength4 = parcel.readInt();
        this.A01 = componentSpliceListLength4;
    }

    public static com.facebook.ads.redexgen.core.Dz A00(android.os.Parcel parcel) {
        return new com.facebook.ads.redexgen.core.Dz(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(android.os.Parcel parcel) {
        parcel.writeLong(this.A04);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        int size = this.A06.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            this.A06.get(i).A02(parcel);
        }
        parcel.writeLong(this.A05);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
