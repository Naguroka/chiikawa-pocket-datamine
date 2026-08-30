package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.media3.session.legacy.ParcelableVolumeInfo> CREATOR = new android.os.Parcelable.Creator<androidx.media3.session.legacy.ParcelableVolumeInfo>() { // from class: androidx.media3.session.legacy.ParcelableVolumeInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.session.legacy.ParcelableVolumeInfo createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.session.legacy.ParcelableVolumeInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.session.legacy.ParcelableVolumeInfo[] newArray(int i) {
            return new androidx.media3.session.legacy.ParcelableVolumeInfo[i];
        }
    };
    public int audioStream;
    public int controlType;
    public int currentVolume;
    public int maxVolume;
    public int volumeType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelableVolumeInfo(int i, int i2, int i3, int i4, int i5) {
        this.volumeType = i;
        this.audioStream = i2;
        this.controlType = i3;
        this.maxVolume = i4;
        this.currentVolume = i5;
    }

    public ParcelableVolumeInfo(android.os.Parcel parcel) {
        this.volumeType = parcel.readInt();
        this.controlType = parcel.readInt();
        this.maxVolume = parcel.readInt();
        this.currentVolume = parcel.readInt();
        this.audioStream = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.volumeType);
        parcel.writeInt(this.controlType);
        parcel.writeInt(this.maxVolume);
        parcel.writeInt(this.currentVolume);
        parcel.writeInt(this.audioStream);
    }
}
