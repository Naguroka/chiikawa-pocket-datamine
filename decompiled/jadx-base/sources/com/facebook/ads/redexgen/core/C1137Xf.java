package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1137Xf implements com.facebook.ads.redexgen.core.InterfaceC0638Db {
    public static java.lang.String[] A03 = {"Zyfxp29hq7sklehO3ZfSPk28lgQjOCUD", "mBhkfvnTYAx8", "jvl4p0IxGGxL", "hS3jxAKBsoqFh0ue9yc", "Tn0diXBh9wstxBqjs2vLzrYzruj", "Eld7aQHWlehNwiaMO32X2Ou2Wkiw9is4", "exrGaTHQQRDlPDs0MMy56kdJq", "kB5CLaxDFbzWNoxMouQGnJGTmKT"};
    public com.facebook.ads.redexgen.core.IG A00;
    public final com.facebook.ads.redexgen.core.I4 A02 = new com.facebook.ads.redexgen.core.I4();
    public final com.facebook.ads.redexgen.core.I3 A01 = new com.facebook.ads.redexgen.core.I3();

    @Override // com.facebook.ads.redexgen.core.InterfaceC0638Db
    public final com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata A5N(com.facebook.ads.redexgen.core.EX ex) throws com.facebook.ads.redexgen.core.AbstractC0639Dc {
        if (this.A00 == null || ex.A00 != this.A00.A05()) {
            this.A00 = new com.facebook.ads.redexgen.core.IG(((com.facebook.ads.redexgen.core.C1177Yw) ex).A00);
            this.A00.A06(((com.facebook.ads.redexgen.core.C1177Yw) ex).A00 - ex.A00);
        }
        java.nio.ByteBuffer buffer = ex.A01;
        byte[] bArrArray = buffer.array();
        int iLimit = buffer.limit();
        this.A02.A0b(bArrArray, iLimit);
        this.A01.A0C(bArrArray, iLimit);
        this.A01.A08(39);
        long jA04 = (((long) this.A01.A04(1)) << 32) | ((long) this.A01.A04(32));
        this.A01.A08(20);
        int spliceCommandType = this.A01.A04(12);
        int iA04 = this.A01.A04(8);
        com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata.Entry spliceNullCommand = null;
        this.A02.A0Z(14);
        switch (iA04) {
            case 0:
                spliceNullCommand = new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceNullCommand();
                break;
            case 4:
                com.facebook.ads.redexgen.core.I4 i4 = this.A02;
                if (A03[6].length() == 16) {
                    throw new java.lang.RuntimeException();
                }
                A03[0] = "CwfQiV2Na4jrWMhTKdMuzXbSEJtlJ6XB";
                spliceNullCommand = com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceScheduleCommand.A00(i4);
                break;
                break;
            case 5:
                spliceNullCommand = com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceInsertCommand.A00(this.A02, jA04, this.A00);
                break;
            case 6:
                spliceNullCommand = com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.TimeSignalCommand.A01(this.A02, jA04, this.A00);
                break;
            case 255:
                spliceNullCommand = com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.PrivateCommand.A00(this.A02, spliceCommandType, jA04);
                break;
        }
        return spliceNullCommand == null ? new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata(new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata.Entry[0]) : new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata(spliceNullCommand);
    }
}
