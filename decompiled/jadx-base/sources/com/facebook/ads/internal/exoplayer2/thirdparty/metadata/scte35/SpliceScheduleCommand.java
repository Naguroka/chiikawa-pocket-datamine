package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SpliceScheduleCommand extends com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceCommand {
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceScheduleCommand> CREATOR = new com.facebook.ads.redexgen.core.C0660Dx();
    public final java.util.List<com.facebook.ads.redexgen.core.Dz> A00;

    public SpliceScheduleCommand(android.os.Parcel parcel) {
        int i = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(com.facebook.ads.redexgen.core.Dz.A00(parcel));
        }
        this.A00 = java.util.Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ SpliceScheduleCommand(android.os.Parcel parcel, com.facebook.ads.redexgen.core.C0660Dx c0660Dx) {
        this(parcel);
    }

    public SpliceScheduleCommand(java.util.List<com.facebook.ads.redexgen.core.Dz> list) {
        this.A00 = java.util.Collections.unmodifiableList(list);
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceScheduleCommand A00(com.facebook.ads.redexgen.core.I4 i4) {
        int iA0E = i4.A0E();
        java.util.ArrayList arrayList = new java.util.ArrayList(iA0E);
        for (int i = 0; i < iA0E; i++) {
            arrayList.add(com.facebook.ads.redexgen.core.Dz.A02(i4));
        }
        return new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int size = this.A00.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.A00.get(i2).A04(parcel);
        }
    }
}
