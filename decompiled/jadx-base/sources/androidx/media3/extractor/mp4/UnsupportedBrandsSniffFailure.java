package androidx.media3.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
public final class UnsupportedBrandsSniffFailure implements androidx.media3.extractor.SniffFailure {
    public final com.google.common.primitives.ImmutableIntArray compatibleBrands;
    public final int majorBrand;

    public UnsupportedBrandsSniffFailure(int i, int[] iArr) {
        com.google.common.primitives.ImmutableIntArray immutableIntArrayOf;
        this.majorBrand = i;
        if (iArr != null) {
            immutableIntArrayOf = com.google.common.primitives.ImmutableIntArray.copyOf(iArr);
        } else {
            immutableIntArrayOf = com.google.common.primitives.ImmutableIntArray.of();
        }
        this.compatibleBrands = immutableIntArrayOf;
    }
}
