package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PrivateCommand extends com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceCommand {
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.PrivateCommand> CREATOR = new com.facebook.ads.redexgen.core.C0656Dt();
    public final long A00;
    public final long A01;
    public final byte[] A02;

    public PrivateCommand(long j, byte[] bArr, long j2) {
        this.A01 = j2;
        this.A00 = j;
        this.A02 = bArr;
    }

    public PrivateCommand(android.os.Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A02 = new byte[parcel.readInt()];
        parcel.readByteArray(this.A02);
    }

    public /* synthetic */ PrivateCommand(android.os.Parcel parcel, com.facebook.ads.redexgen.core.C0656Dt c0656Dt) {
        this(parcel);
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.PrivateCommand A00(com.facebook.ads.redexgen.core.I4 i4, int i, long j) {
        long jA0M = i4.A0M();
        byte[] bArr = new byte[i - 4];
        i4.A0c(bArr, 0, bArr.length);
        return new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.PrivateCommand(jA0M, bArr, j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A02.length);
        parcel.writeByteArray(this.A02);
    }
}
