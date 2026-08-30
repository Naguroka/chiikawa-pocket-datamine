package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class PercentageRating extends androidx.media3.common.Rating {
    private static final java.lang.String FIELD_PERCENT = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final int TYPE = 1;
    private final float percent;

    public PercentageRating() {
        this.percent = -1.0f;
    }

    public PercentageRating(float f) {
        androidx.media3.common.util.Assertions.checkArgument(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.percent = f;
    }

    @Override // androidx.media3.common.Rating
    public boolean isRated() {
        return this.percent != -1.0f;
    }

    public float getPercent() {
        return this.percent;
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(java.lang.Float.valueOf(this.percent));
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof androidx.media3.common.PercentageRating) && this.percent == ((androidx.media3.common.PercentageRating) obj).percent;
    }

    @Override // androidx.media3.common.Rating
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(FIELD_RATING_TYPE, 1);
        bundle.putFloat(FIELD_PERCENT, this.percent);
        return bundle;
    }

    public static androidx.media3.common.PercentageRating fromBundle(android.os.Bundle bundle) {
        androidx.media3.common.util.Assertions.checkArgument(bundle.getInt(FIELD_RATING_TYPE, -1) == 1);
        float f = bundle.getFloat(FIELD_PERCENT, -1.0f);
        return f == -1.0f ? new androidx.media3.common.PercentageRating() : new androidx.media3.common.PercentageRating(f);
    }
}
