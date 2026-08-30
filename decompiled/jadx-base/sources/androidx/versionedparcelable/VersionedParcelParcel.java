package androidx.versionedparcelable;

/* JADX INFO: loaded from: classes3.dex */
class VersionedParcelParcel extends androidx.versionedparcelable.VersionedParcel {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "VersionedParcelParcel";
    private int mCurrentField;
    private final int mEnd;
    private int mFieldId;
    private int mNextRead;
    private final int mOffset;
    private final android.os.Parcel mParcel;
    private final android.util.SparseIntArray mPositionLookup;
    private final java.lang.String mPrefix;

    VersionedParcelParcel(android.os.Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.ArrayMap(), new androidx.collection.ArrayMap(), new androidx.collection.ArrayMap());
    }

    private VersionedParcelParcel(android.os.Parcel parcel, int i, int i2, java.lang.String str, androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> arrayMap, androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> arrayMap2, androidx.collection.ArrayMap<java.lang.String, java.lang.Class> arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.mPositionLookup = new android.util.SparseIntArray();
        this.mCurrentField = -1;
        this.mFieldId = -1;
        this.mParcel = parcel;
        this.mOffset = i;
        this.mEnd = i2;
        this.mNextRead = i;
        this.mPrefix = str;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readField(int i) {
        while (this.mNextRead < this.mEnd) {
            int i2 = this.mFieldId;
            if (i2 == i) {
                return true;
            }
            if (java.lang.String.valueOf(i2).compareTo(java.lang.String.valueOf(i)) > 0) {
                return false;
            }
            this.mParcel.setDataPosition(this.mNextRead);
            int i3 = this.mParcel.readInt();
            this.mFieldId = this.mParcel.readInt();
            this.mNextRead += i3;
        }
        return this.mFieldId == i;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void setOutputField(int i) {
        closeField();
        this.mCurrentField = i;
        this.mPositionLookup.put(i, this.mParcel.dataPosition());
        writeInt(0);
        writeInt(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void closeField() {
        int i = this.mCurrentField;
        if (i >= 0) {
            int i2 = this.mPositionLookup.get(i);
            int iDataPosition = this.mParcel.dataPosition();
            this.mParcel.setDataPosition(i2);
            this.mParcel.writeInt(iDataPosition - i2);
            this.mParcel.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected androidx.versionedparcelable.VersionedParcel createSubParcel() {
        android.os.Parcel parcel = this.mParcel;
        int iDataPosition = parcel.dataPosition();
        int i = this.mNextRead;
        if (i == this.mOffset) {
            i = this.mEnd;
        }
        return new androidx.versionedparcelable.VersionedParcelParcel(parcel, iDataPosition, i, this.mPrefix + "  ", this.mReadCache, this.mWriteCache, this.mParcelizerCache);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] bArr) {
        if (bArr != null) {
            this.mParcel.writeInt(bArr.length);
            this.mParcel.writeByteArray(bArr);
        } else {
            this.mParcel.writeInt(-1);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            this.mParcel.writeInt(bArr.length);
            this.mParcel.writeByteArray(bArr, i, i2);
        } else {
            this.mParcel.writeInt(-1);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeInt(int i) {
        this.mParcel.writeInt(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeLong(long j) {
        this.mParcel.writeLong(j);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeFloat(float f) {
        this.mParcel.writeFloat(f);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeDouble(double d) {
        this.mParcel.writeDouble(d);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeString(java.lang.String str) {
        this.mParcel.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongBinder(android.os.IBinder iBinder) {
        this.mParcel.writeStrongBinder(iBinder);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeParcelable(android.os.Parcelable parcelable) {
        this.mParcel.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBoolean(boolean z) {
        this.mParcel.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongInterface(android.os.IInterface iInterface) {
        this.mParcel.writeStrongInterface(iInterface);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBundle(android.os.Bundle bundle) {
        this.mParcel.writeBundle(bundle);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void writeCharSequence(java.lang.CharSequence charSequence) {
        android.text.TextUtils.writeToParcel(charSequence, this.mParcel, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected java.lang.CharSequence readCharSequence() {
        return (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.mParcel);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int readInt() {
        return this.mParcel.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public long readLong() {
        return this.mParcel.readLong();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public float readFloat() {
        return this.mParcel.readFloat();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public double readDouble() {
        return this.mParcel.readDouble();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public java.lang.String readString() {
        return this.mParcel.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public android.os.IBinder readStrongBinder() {
        return this.mParcel.readStrongBinder();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] readByteArray() {
        int i = this.mParcel.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.mParcel.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends android.os.Parcelable> T readParcelable() {
        return (T) this.mParcel.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public android.os.Bundle readBundle() {
        return this.mParcel.readBundle(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readBoolean() {
        return this.mParcel.readInt() != 0;
    }
}
