package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public abstract class Rating {
    static final java.lang.String FIELD_RATING_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    static final int RATING_TYPE_HEART = 0;
    static final int RATING_TYPE_PERCENTAGE = 1;
    static final int RATING_TYPE_STAR = 2;
    static final int RATING_TYPE_THUMB = 3;
    static final int RATING_TYPE_UNSET = -1;
    static final float RATING_UNSET = -1.0f;

    public abstract boolean isRated();

    public abstract android.os.Bundle toBundle();

    Rating() {
    }

    public static androidx.media3.common.Rating fromBundle(android.os.Bundle bundle) {
        int i = bundle.getInt(FIELD_RATING_TYPE, -1);
        if (i == 0) {
            return androidx.media3.common.HeartRating.fromBundle(bundle);
        }
        if (i == 1) {
            return androidx.media3.common.PercentageRating.fromBundle(bundle);
        }
        if (i == 2) {
            return androidx.media3.common.StarRating.fromBundle(bundle);
        }
        if (i == 3) {
            return androidx.media3.common.ThumbRating.fromBundle(bundle);
        }
        throw new java.lang.IllegalArgumentException("Unknown RatingType: " + i);
    }
}
