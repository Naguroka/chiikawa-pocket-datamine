package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class Id3Frame implements com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata.Entry {
    public final java.lang.String A00;

    public Id3Frame(java.lang.String str) {
        this.A00 = (java.lang.String) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return this.A00;
    }
}
