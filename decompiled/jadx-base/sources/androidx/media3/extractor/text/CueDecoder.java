package androidx.media3.extractor.text;

/* JADX INFO: loaded from: classes.dex */
public final class CueDecoder {
    static final java.lang.String BUNDLE_FIELD_CUES = "c";
    static final java.lang.String BUNDLE_FIELD_DURATION_US = "d";

    public androidx.media3.extractor.text.CuesWithTiming decode(long j, byte[] bArr) {
        return decode(j, bArr, 0, bArr.length);
    }

    public androidx.media3.extractor.text.CuesWithTiming decode(long j, byte[] bArr, int i, int i2) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.unmarshall(bArr, i, i2);
        parcelObtain.setDataPosition(0);
        android.os.Bundle bundle = parcelObtain.readBundle(android.os.Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new androidx.media3.extractor.text.CuesWithTiming(androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new androidx.media3.common.text.CueGroup$$ExternalSyntheticLambda1(), (java.util.ArrayList) androidx.media3.common.util.Assertions.checkNotNull(bundle.getParcelableArrayList(BUNDLE_FIELD_CUES))), j, bundle.getLong("d"));
    }
}
