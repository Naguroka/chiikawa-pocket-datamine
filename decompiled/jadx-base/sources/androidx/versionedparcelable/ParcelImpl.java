package androidx.versionedparcelable;

/* JADX INFO: loaded from: classes3.dex */
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> CREATOR = new android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl>() { // from class: androidx.versionedparcelable.ParcelImpl.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.versionedparcelable.ParcelImpl createFromParcel(android.os.Parcel parcel) {
            return new androidx.versionedparcelable.ParcelImpl(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.versionedparcelable.ParcelImpl[] newArray(int i) {
            return new androidx.versionedparcelable.ParcelImpl[i];
        }
    };
    private final androidx.versionedparcelable.VersionedParcelable mParcel;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelImpl(androidx.versionedparcelable.VersionedParcelable versionedParcelable) {
        this.mParcel = versionedParcelable;
    }

    protected ParcelImpl(android.os.Parcel parcel) {
        this.mParcel = new androidx.versionedparcelable.VersionedParcelParcel(parcel).readVersionedParcelable();
    }

    public <T extends androidx.versionedparcelable.VersionedParcelable> T getVersionedParcel() {
        return (T) this.mParcel;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        new androidx.versionedparcelable.VersionedParcelParcel(parcel).writeVersionedParcelable(this.mParcel);
    }
}
