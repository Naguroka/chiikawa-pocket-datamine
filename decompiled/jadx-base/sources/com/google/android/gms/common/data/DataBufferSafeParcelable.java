package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class DataBufferSafeParcelable<T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> extends com.google.android.gms.common.data.AbstractDataBuffer<T> {
    private static final java.lang.String[] zaa = {"data"};
    private final android.os.Parcelable.Creator zab;

    public DataBufferSafeParcelable(com.google.android.gms.common.data.DataHolder dataHolder, android.os.Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.zab = creator;
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> void addValue(com.google.android.gms.common.data.DataHolder.Builder builder, T t) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        t.writeToParcel(parcelObtain, 0);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("data", parcelObtain.marshall());
        builder.withRow(contentValues);
        parcelObtain.recycle();
    }

    public static com.google.android.gms.common.data.DataHolder.Builder buildDataHolder() {
        return com.google.android.gms.common.data.DataHolder.builder(zaa);
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public T get(int i) {
        com.google.android.gms.common.data.DataHolder dataHolder = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.mDataHolder);
        byte[] byteArray = dataHolder.getByteArray("data", i, dataHolder.getWindowIndex(i));
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.unmarshall(byteArray, 0, byteArray.length);
        parcelObtain.setDataPosition(0);
        T t = (T) this.zab.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return t;
    }
}
