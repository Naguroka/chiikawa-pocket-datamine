package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class StarRating extends androidx.media3.common.Rating {
    private static final java.lang.String FIELD_MAX_STARS = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_STAR_RATING = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final int MAX_STARS_DEFAULT = 5;
    private static final int TYPE = 2;
    private final int maxStars;
    private final float starRating;

    public StarRating(int i) {
        androidx.media3.common.util.Assertions.checkArgument(i > 0, "maxStars must be a positive integer");
        this.maxStars = i;
        this.starRating = -1.0f;
    }

    public StarRating(int i, float f) {
        androidx.media3.common.util.Assertions.checkArgument(i > 0, "maxStars must be a positive integer");
        androidx.media3.common.util.Assertions.checkArgument(f >= 0.0f && f <= ((float) i), "starRating is out of range [0, maxStars]");
        this.maxStars = i;
        this.starRating = f;
    }

    @Override // androidx.media3.common.Rating
    public boolean isRated() {
        return this.starRating != -1.0f;
    }

    public int getMaxStars() {
        return this.maxStars;
    }

    public float getStarRating() {
        return this.starRating;
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(java.lang.Integer.valueOf(this.maxStars), java.lang.Float.valueOf(this.starRating));
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.media3.common.StarRating)) {
            return false;
        }
        androidx.media3.common.StarRating starRating = (androidx.media3.common.StarRating) obj;
        return this.maxStars == starRating.maxStars && this.starRating == starRating.starRating;
    }

    @Override // androidx.media3.common.Rating
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(FIELD_RATING_TYPE, 2);
        bundle.putInt(FIELD_MAX_STARS, this.maxStars);
        bundle.putFloat(FIELD_STAR_RATING, this.starRating);
        return bundle;
    }

    public static androidx.media3.common.StarRating fromBundle(android.os.Bundle bundle) {
        androidx.media3.common.util.Assertions.checkArgument(bundle.getInt(FIELD_RATING_TYPE, -1) == 2);
        int i = bundle.getInt(FIELD_MAX_STARS, 5);
        float f = bundle.getFloat(FIELD_STAR_RATING, -1.0f);
        if (f == -1.0f) {
            return new androidx.media3.common.StarRating(i);
        }
        return new androidx.media3.common.StarRating(i, f);
    }
}
