package androidx.activity.result;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.activity.result.ActivityResult> CREATOR = new android.os.Parcelable.Creator<androidx.activity.result.ActivityResult>() { // from class: androidx.activity.result.ActivityResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.activity.result.ActivityResult createFromParcel(android.os.Parcel parcel) {
            return new androidx.activity.result.ActivityResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.activity.result.ActivityResult[] newArray(int i) {
            return new androidx.activity.result.ActivityResult[i];
        }
    };
    private final android.content.Intent mData;
    private final int mResultCode;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ActivityResult(int i, android.content.Intent intent) {
        this.mResultCode = i;
        this.mData = intent;
    }

    ActivityResult(android.os.Parcel parcel) {
        this.mResultCode = parcel.readInt();
        this.mData = parcel.readInt() == 0 ? null : (android.content.Intent) android.content.Intent.CREATOR.createFromParcel(parcel);
    }

    public int getResultCode() {
        return this.mResultCode;
    }

    public android.content.Intent getData() {
        return this.mData;
    }

    public java.lang.String toString() {
        return "ActivityResult{resultCode=" + resultCodeToString(this.mResultCode) + ", data=" + this.mData + '}';
    }

    public static java.lang.String resultCodeToString(int i) {
        if (i != -1) {
            return i != 0 ? java.lang.String.valueOf(i) : "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.mResultCode);
        parcel.writeInt(this.mData == null ? 0 : 1);
        android.content.Intent intent = this.mData;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
