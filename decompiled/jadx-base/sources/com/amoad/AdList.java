package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
public final class AdList implements android.os.Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final android.os.Parcelable.Creator<com.amoad.AdList> f165a = new android.os.Parcelable.Creator<com.amoad.AdList>() { // from class: com.amoad.AdList.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amoad.AdList createFromParcel(android.os.Parcel parcel) {
            return new com.amoad.AdList(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amoad.AdList[] newArray(int i) {
            return new com.amoad.AdList[i];
        }
    };
    private final int b;
    private final int c;
    private final java.util.List<com.amoad.AdItem> d;

    private AdList(android.os.Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.createTypedArrayList(com.amoad.AdItem.f162a);
    }

    /* synthetic */ AdList(android.os.Parcel parcel, byte b) {
        this(parcel);
    }

    AdList(java.util.List<com.amoad.AdItem> list, int i, int i2) {
        this.d = list;
        this.c = i < 0 ? 0 : i;
        this.b = i2 < 0 ? 0 : i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.util.List<com.amoad.AdItem> getAdItemList() {
        return this.d;
    }

    public final int getBeginIndex() {
        return this.c;
    }

    public final int getInterval() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeTypedList(this.d);
    }
}
