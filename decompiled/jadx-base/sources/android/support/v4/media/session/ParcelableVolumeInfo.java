package android.support.v4.media.session;

/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.session.ParcelableVolumeInfo> CREATOR = new android.os.Parcelable.Creator<android.support.v4.media.session.ParcelableVolumeInfo>() { // from class: android.support.v4.media.session.ParcelableVolumeInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public android.support.v4.media.session.ParcelableVolumeInfo createFromParcel(android.os.Parcel parcel) {
            return new android.support.v4.media.session.ParcelableVolumeInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public android.support.v4.media.session.ParcelableVolumeInfo[] newArray(int i) {
            return new android.support.v4.media.session.ParcelableVolumeInfo[i];
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
