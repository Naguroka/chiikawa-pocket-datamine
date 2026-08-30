package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class ThumbRating extends androidx.media3.common.Rating {
    private static final int TYPE = 3;
    private final boolean isThumbsUp;
    private final boolean rated;
    private static final java.lang.String FIELD_RATED = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_IS_THUMBS_UP = androidx.media3.common.util.Util.intToStringMaxRadix(2);

    public ThumbRating() {
        this.rated = false;
        this.isThumbsUp = false;
    }

    public ThumbRating(boolean z) {
        this.rated = true;
        this.isThumbsUp = z;
    }

    @Override // androidx.media3.common.Rating
    public boolean isRated() {
        return this.rated;
    }

    public boolean isThumbsUp() {
        return this.isThumbsUp;
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(java.lang.Boolean.valueOf(this.rated), java.lang.Boolean.valueOf(this.isThumbsUp));
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.media3.common.ThumbRating)) {
            return false;
        }
        androidx.media3.common.ThumbRating thumbRating = (androidx.media3.common.ThumbRating) obj;
        return this.isThumbsUp == thumbRating.isThumbsUp && this.rated == thumbRating.rated;
    }

    @Override // androidx.media3.common.Rating
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(FIELD_RATING_TYPE, 3);
        bundle.putBoolean(FIELD_RATED, this.rated);
        bundle.putBoolean(FIELD_IS_THUMBS_UP, this.isThumbsUp);
        return bundle;
    }

    public static androidx.media3.common.ThumbRating fromBundle(android.os.Bundle bundle) {
        androidx.media3.common.util.Assertions.checkArgument(bundle.getInt(FIELD_RATING_TYPE, -1) == 3);
        if (bundle.getBoolean(FIELD_RATED, false)) {
            return new androidx.media3.common.ThumbRating(bundle.getBoolean(FIELD_IS_THUMBS_UP, false));
        }
        return new androidx.media3.common.ThumbRating();
    }
}
