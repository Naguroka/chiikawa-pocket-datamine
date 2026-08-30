package com.facebook.ads.internal.exoplayer2.thirdparty.metadata;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Metadata implements android.os.Parcelable {
    public static java.lang.String[] A01 = {"zUrQL7GUAFocRwXemPY3yhr7l5S0xY70", "XA9ucE3fWwyEdcoFcQASvZGj6bcFZVPf", "ELtxf4Y1Jk8LgiiMyUKCki1FwOPJJgog", "B2kGyn7fabtxlQFxUauI1B2uFfXVCAPw", "ixu7mQ4Wy9aHS7V0bxaOfUuqyif4M3aJ", "47fcOB6GOJ9GbfMYvfTnL8sz1WC6cZa5", "IJISlEQyfUS3lhl3waK4regZPajL", "9B8Fyg4n1zOjDAkl95LqaeehXECnF5Gm"};
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata> CREATOR = new com.facebook.ads.redexgen.core.DY();
    public final com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata.Entry[] A00;

    public interface Entry extends android.os.Parcelable {
    }

    public Metadata(android.os.Parcel parcel) {
        this.A00 = new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata.Entry[parcel.readInt()];
        for (int i = 0; i < i; i++) {
            this.A00[i] = (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata.Entry) parcel.readParcelable(com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata.Entry.class.getClassLoader());
        }
    }

    public Metadata(java.util.List<? extends com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata.Entry> entries) {
        if (entries != null) {
            this.A00 = new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata.Entry[entries.size()];
            entries.toArray(this.A00);
        } else {
            this.A00 = new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata.Entry[0];
        }
    }

    public Metadata(com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata.Entry... entryArr) {
        this.A00 = entryArr == null ? new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata.Entry[0] : entryArr;
    }

    public final int A00() {
        return this.A00.length;
    }

    public final com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata.Entry A01(int i) {
        return this.A00[i];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        boolean zEquals = java.util.Arrays.equals(this.A00, ((com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata) obj).A00);
        if (A01[6].length() == 24) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A01;
        strArr[4] = "4knFxayiXxWd81AO688yXEIAIwBcfeff";
        strArr[1] = "lUV3PTeQde6UvfJepvohNqjkevUlt3kA";
        return zEquals;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.A00.length);
        for (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata.Entry entry : this.A00) {
            parcel.writeParcelable(entry, 0);
        }
    }
}
