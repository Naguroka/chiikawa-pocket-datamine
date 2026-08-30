package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.media3.session.legacy.RatingCompat> CREATOR = new android.os.Parcelable.Creator<androidx.media3.session.legacy.RatingCompat>() { // from class: androidx.media3.session.legacy.RatingCompat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.session.legacy.RatingCompat createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.session.legacy.RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.session.legacy.RatingCompat[] newArray(int i) {
            return new androidx.media3.session.legacy.RatingCompat[i];
        }
    };
    public static final int RATING_3_STARS = 3;
    public static final int RATING_4_STARS = 4;
    public static final int RATING_5_STARS = 5;
    public static final int RATING_HEART = 1;
    public static final int RATING_NONE = 0;
    private static final float RATING_NOT_RATED = -1.0f;
    public static final int RATING_PERCENTAGE = 6;
    public static final int RATING_THUMB_UP_DOWN = 2;
    private static final java.lang.String TAG = "Rating";
    private java.lang.Object mRatingObj;
    private final int mRatingStyle;
    private final float mRatingValue;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface StarStyle {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Style {
    }

    RatingCompat(int i, float f) {
        this.mRatingStyle = i;
        this.mRatingValue = f;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("Rating:style=").append(this.mRatingStyle).append(" rating=");
        float f = this.mRatingValue;
        return sbAppend.append(f < 0.0f ? "unrated" : java.lang.String.valueOf(f)).toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.mRatingStyle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.mRatingStyle);
        parcel.writeFloat(this.mRatingValue);
    }

    public static androidx.media3.session.legacy.RatingCompat newUnratedRating(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new androidx.media3.session.legacy.RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    public static androidx.media3.session.legacy.RatingCompat newHeartRating(boolean z) {
        return new androidx.media3.session.legacy.RatingCompat(1, z ? 1.0f : 0.0f);
    }

    public static androidx.media3.session.legacy.RatingCompat newThumbRating(boolean z) {
        return new androidx.media3.session.legacy.RatingCompat(2, z ? 1.0f : 0.0f);
    }

    public static androidx.media3.session.legacy.RatingCompat newStarRating(int i, float f) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else {
            if (i != 5) {
                android.util.Log.e(TAG, "Invalid rating style (" + i + ") for a star rating");
                return null;
            }
            f2 = 5.0f;
        }
        if (f < 0.0f || f > f2) {
            android.util.Log.e(TAG, "Trying to set out of range star-based rating");
            return null;
        }
        return new androidx.media3.session.legacy.RatingCompat(i, f);
    }

    public static androidx.media3.session.legacy.RatingCompat newPercentageRating(float f) {
        if (f < 0.0f || f > 100.0f) {
            android.util.Log.e(TAG, "Invalid percentage-based rating value");
            return null;
        }
        return new androidx.media3.session.legacy.RatingCompat(6, f);
    }

    public boolean isRated() {
        return this.mRatingValue >= 0.0f;
    }

    public int getRatingStyle() {
        return this.mRatingStyle;
    }

    public boolean hasHeart() {
        return this.mRatingStyle == 1 && this.mRatingValue == 1.0f;
    }

    public boolean isThumbUp() {
        return this.mRatingStyle == 2 && this.mRatingValue == 1.0f;
    }

    public float getStarRating() {
        int i = this.mRatingStyle;
        if ((i == 3 || i == 4 || i == 5) && isRated()) {
            return this.mRatingValue;
        }
        return -1.0f;
    }

    public float getPercentRating() {
        if (this.mRatingStyle == 6 && isRated()) {
            return this.mRatingValue;
        }
        return -1.0f;
    }

    public static androidx.media3.session.legacy.RatingCompat fromRating(java.lang.Object obj) {
        androidx.media3.session.legacy.RatingCompat ratingCompatNewUnratedRating = null;
        if (obj != null) {
            android.media.Rating rating = (android.media.Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompatNewUnratedRating = newHeartRating(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompatNewUnratedRating = newThumbRating(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompatNewUnratedRating = newStarRating(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompatNewUnratedRating = newPercentageRating(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompatNewUnratedRating = newUnratedRating(ratingStyle);
            }
            ((androidx.media3.session.legacy.RatingCompat) androidx.media3.common.util.Assertions.checkNotNull(ratingCompatNewUnratedRating)).mRatingObj = obj;
        }
        return ratingCompatNewUnratedRating;
    }

    public java.lang.Object getRating() {
        if (this.mRatingObj == null) {
            if (isRated()) {
                int i = this.mRatingStyle;
                switch (i) {
                    case 1:
                        this.mRatingObj = android.media.Rating.newHeartRating(hasHeart());
                        break;
                    case 2:
                        this.mRatingObj = android.media.Rating.newThumbRating(isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.mRatingObj = android.media.Rating.newStarRating(i, getStarRating());
                        break;
                    case 6:
                        this.mRatingObj = android.media.Rating.newPercentageRating(getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                this.mRatingObj = android.media.Rating.newUnratedRating(this.mRatingStyle);
            }
        }
        return this.mRatingObj;
    }
}
