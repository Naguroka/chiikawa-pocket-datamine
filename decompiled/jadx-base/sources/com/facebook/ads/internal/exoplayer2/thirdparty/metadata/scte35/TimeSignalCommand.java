package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TimeSignalCommand extends com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceCommand {
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.TimeSignalCommand> CREATOR = new com.facebook.ads.redexgen.core.E0();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public /* synthetic */ TimeSignalCommand(long j, long j2, com.facebook.ads.redexgen.core.E0 e0) {
        this(j, j2);
    }

    public static long A00(com.facebook.ads.redexgen.core.I4 i4, long j) {
        long jA0E = i4.A0E();
        if ((128 & jA0E) == 0) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        long ptsTime = 1 & jA0E;
        long firstByte = i4.A0M();
        return (((ptsTime << 32) | firstByte) + j) & 8589934591L;
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.TimeSignalCommand A01(com.facebook.ads.redexgen.core.I4 i4, long j, com.facebook.ads.redexgen.core.IG ig) {
        long jA00 = A00(i4, j);
        return new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.TimeSignalCommand(jA00, ig.A07(jA00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
