package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public final class MediaMetadataCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.media3.session.legacy.MediaMetadataCompat> CREATOR;
    static final androidx.collection.ArrayMap<java.lang.String, java.lang.Integer> METADATA_KEYS_TYPE;
    public static final java.lang.String METADATA_KEY_ADVERTISEMENT = "android.media.metadata.ADVERTISEMENT";
    public static final java.lang.String METADATA_KEY_ALBUM = "android.media.metadata.ALBUM";
    public static final java.lang.String METADATA_KEY_ALBUM_ART = "android.media.metadata.ALBUM_ART";
    public static final java.lang.String METADATA_KEY_ALBUM_ARTIST = "android.media.metadata.ALBUM_ARTIST";
    public static final java.lang.String METADATA_KEY_ALBUM_ART_URI = "android.media.metadata.ALBUM_ART_URI";
    public static final java.lang.String METADATA_KEY_ART = "android.media.metadata.ART";
    public static final java.lang.String METADATA_KEY_ARTIST = "android.media.metadata.ARTIST";
    public static final java.lang.String METADATA_KEY_ART_URI = "android.media.metadata.ART_URI";
    public static final java.lang.String METADATA_KEY_AUTHOR = "android.media.metadata.AUTHOR";
    public static final java.lang.String METADATA_KEY_BT_FOLDER_TYPE = "android.media.metadata.BT_FOLDER_TYPE";
    public static final java.lang.String METADATA_KEY_COMPILATION = "android.media.metadata.COMPILATION";
    public static final java.lang.String METADATA_KEY_COMPOSER = "android.media.metadata.COMPOSER";
    public static final java.lang.String METADATA_KEY_DATE = "android.media.metadata.DATE";
    public static final java.lang.String METADATA_KEY_DISC_NUMBER = "android.media.metadata.DISC_NUMBER";
    public static final java.lang.String METADATA_KEY_DISPLAY_DESCRIPTION = "android.media.metadata.DISPLAY_DESCRIPTION";
    public static final java.lang.String METADATA_KEY_DISPLAY_ICON = "android.media.metadata.DISPLAY_ICON";
    public static final java.lang.String METADATA_KEY_DISPLAY_ICON_URI = "android.media.metadata.DISPLAY_ICON_URI";
    public static final java.lang.String METADATA_KEY_DISPLAY_SUBTITLE = "android.media.metadata.DISPLAY_SUBTITLE";
    public static final java.lang.String METADATA_KEY_DISPLAY_TITLE = "android.media.metadata.DISPLAY_TITLE";
    public static final java.lang.String METADATA_KEY_DOWNLOAD_STATUS = "android.media.metadata.DOWNLOAD_STATUS";
    public static final java.lang.String METADATA_KEY_DURATION = "android.media.metadata.DURATION";
    public static final java.lang.String METADATA_KEY_GENRE = "android.media.metadata.GENRE";
    public static final java.lang.String METADATA_KEY_MEDIA_ID = "android.media.metadata.MEDIA_ID";
    public static final java.lang.String METADATA_KEY_MEDIA_URI = "android.media.metadata.MEDIA_URI";
    public static final java.lang.String METADATA_KEY_NUM_TRACKS = "android.media.metadata.NUM_TRACKS";
    public static final java.lang.String METADATA_KEY_RATING = "android.media.metadata.RATING";
    public static final java.lang.String METADATA_KEY_TITLE = "android.media.metadata.TITLE";
    public static final java.lang.String METADATA_KEY_TRACK_NUMBER = "android.media.metadata.TRACK_NUMBER";
    public static final java.lang.String METADATA_KEY_USER_RATING = "android.media.metadata.USER_RATING";
    public static final java.lang.String METADATA_KEY_WRITER = "android.media.metadata.WRITER";
    public static final java.lang.String METADATA_KEY_YEAR = "android.media.metadata.YEAR";
    static final int METADATA_TYPE_BITMAP = 2;
    static final int METADATA_TYPE_LONG = 0;
    static final int METADATA_TYPE_RATING = 3;
    static final int METADATA_TYPE_TEXT = 1;
    private static final java.lang.String[] PREFERRED_BITMAP_ORDER;
    public static final java.lang.String[] PREFERRED_DESCRIPTION_ORDER;
    private static final java.lang.String[] PREFERRED_URI_ORDER;
    private static final java.lang.String TAG = "MediaMetadata";
    final android.os.Bundle mBundle;
    private androidx.media3.session.legacy.MediaDescriptionCompat mDescription;
    private android.media.MediaMetadata mMetadataFwk;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        androidx.collection.ArrayMap<java.lang.String, java.lang.Integer> arrayMap = new androidx.collection.ArrayMap<>();
        METADATA_KEYS_TYPE = arrayMap;
        arrayMap.put("android.media.metadata.TITLE", 1);
        arrayMap.put("android.media.metadata.ARTIST", 1);
        arrayMap.put("android.media.metadata.DURATION", 0);
        arrayMap.put("android.media.metadata.ALBUM", 1);
        arrayMap.put("android.media.metadata.AUTHOR", 1);
        arrayMap.put("android.media.metadata.WRITER", 1);
        arrayMap.put("android.media.metadata.COMPOSER", 1);
        arrayMap.put("android.media.metadata.COMPILATION", 1);
        arrayMap.put("android.media.metadata.DATE", 1);
        arrayMap.put("android.media.metadata.YEAR", 0);
        arrayMap.put("android.media.metadata.GENRE", 1);
        arrayMap.put("android.media.metadata.TRACK_NUMBER", 0);
        arrayMap.put("android.media.metadata.NUM_TRACKS", 0);
        arrayMap.put("android.media.metadata.DISC_NUMBER", 0);
        arrayMap.put("android.media.metadata.ALBUM_ARTIST", 1);
        arrayMap.put("android.media.metadata.ART", 2);
        arrayMap.put("android.media.metadata.ART_URI", 1);
        arrayMap.put("android.media.metadata.ALBUM_ART", 2);
        arrayMap.put("android.media.metadata.ALBUM_ART_URI", 1);
        arrayMap.put("android.media.metadata.USER_RATING", 3);
        arrayMap.put("android.media.metadata.RATING", 3);
        arrayMap.put("android.media.metadata.DISPLAY_TITLE", 1);
        arrayMap.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        arrayMap.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        arrayMap.put("android.media.metadata.DISPLAY_ICON", 2);
        arrayMap.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        arrayMap.put("android.media.metadata.MEDIA_ID", 1);
        arrayMap.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        arrayMap.put("android.media.metadata.MEDIA_URI", 1);
        arrayMap.put("android.media.metadata.ADVERTISEMENT", 0);
        arrayMap.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        PREFERRED_DESCRIPTION_ORDER = new java.lang.String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        PREFERRED_BITMAP_ORDER = new java.lang.String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        PREFERRED_URI_ORDER = new java.lang.String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new android.os.Parcelable.Creator<androidx.media3.session.legacy.MediaMetadataCompat>() { // from class: androidx.media3.session.legacy.MediaMetadataCompat.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.session.legacy.MediaMetadataCompat createFromParcel(android.os.Parcel parcel) {
                return new androidx.media3.session.legacy.MediaMetadataCompat(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.session.legacy.MediaMetadataCompat[] newArray(int i) {
                return new androidx.media3.session.legacy.MediaMetadataCompat[i];
            }
        };
    }

    MediaMetadataCompat(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle(bundle);
        this.mBundle = bundle2;
        androidx.media3.session.legacy.MediaSessionCompat.ensureClassLoader(bundle2);
    }

    MediaMetadataCompat(android.os.Parcel parcel) {
        this.mBundle = (android.os.Bundle) androidx.media3.common.util.Assertions.checkNotNull(parcel.readBundle(androidx.media3.session.legacy.MediaSessionCompat.class.getClassLoader()));
    }

    public boolean containsKey(java.lang.String str) {
        return this.mBundle.containsKey(str);
    }

    public java.lang.CharSequence getText(java.lang.String str) {
        return this.mBundle.getCharSequence(str);
    }

    public java.lang.String getString(java.lang.String str) {
        java.lang.CharSequence charSequence = this.mBundle.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public long getLong(java.lang.String str) {
        return this.mBundle.getLong(str, 0L);
    }

    public androidx.media3.session.legacy.RatingCompat getRating(java.lang.String str) {
        try {
            return androidx.media3.session.legacy.RatingCompat.fromRating(this.mBundle.getParcelable(str));
        } catch (java.lang.Exception e) {
            android.util.Log.w(TAG, "Failed to retrieve a key as Rating.", e);
            return null;
        }
    }

    public android.graphics.Bitmap getBitmap(java.lang.String str) {
        try {
            return (android.graphics.Bitmap) this.mBundle.getParcelable(str);
        } catch (java.lang.Exception e) {
            android.util.Log.w(TAG, "Failed to retrieve a key as Bitmap.", e);
            return null;
        }
    }

    public androidx.media3.session.legacy.MediaDescriptionCompat getDescription() {
        android.graphics.Bitmap bitmap;
        android.net.Uri uri;
        androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat = this.mDescription;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        java.lang.String string = getString("android.media.metadata.MEDIA_ID");
        java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[3];
        java.lang.CharSequence text = getText("android.media.metadata.DISPLAY_TITLE");
        if (android.text.TextUtils.isEmpty(text)) {
            int i = 0;
            int i2 = 0;
            while (i < 3) {
                java.lang.String[] strArr = PREFERRED_DESCRIPTION_ORDER;
                if (i2 >= strArr.length) {
                    break;
                }
                int i3 = i2 + 1;
                java.lang.CharSequence text2 = getText(strArr[i2]);
                if (!android.text.TextUtils.isEmpty(text2)) {
                    charSequenceArr[i] = text2;
                    i++;
                }
                i2 = i3;
            }
        } else {
            charSequenceArr[0] = text;
            charSequenceArr[1] = getText("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = getText("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i4 = 0;
        while (true) {
            java.lang.String[] strArr2 = PREFERRED_BITMAP_ORDER;
            if (i4 >= strArr2.length) {
                bitmap = null;
                break;
            }
            bitmap = getBitmap(strArr2[i4]);
            if (bitmap != null) {
                break;
            }
            i4++;
        }
        int i5 = 0;
        while (true) {
            java.lang.String[] strArr3 = PREFERRED_URI_ORDER;
            if (i5 >= strArr3.length) {
                uri = null;
                break;
            }
            java.lang.String string2 = getString(strArr3[i5]);
            if (!android.text.TextUtils.isEmpty(string2)) {
                uri = android.net.Uri.parse(string2);
                break;
            }
            i5++;
        }
        java.lang.String string3 = getString("android.media.metadata.MEDIA_URI");
        android.net.Uri uri2 = android.text.TextUtils.isEmpty(string3) ? null : android.net.Uri.parse(string3);
        androidx.media3.session.legacy.MediaDescriptionCompat.Builder builder = new androidx.media3.session.legacy.MediaDescriptionCompat.Builder();
        builder.setMediaId(string);
        builder.setTitle(charSequenceArr[0]);
        builder.setSubtitle(charSequenceArr[1]);
        builder.setDescription(charSequenceArr[2]);
        builder.setIconBitmap(bitmap);
        builder.setIconUri(uri);
        builder.setMediaUri(uri2);
        android.os.Bundle bundle = new android.os.Bundle();
        if (this.mBundle.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", getLong("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (this.mBundle.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", getLong("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (!bundle.isEmpty()) {
            builder.setExtras(bundle);
        }
        androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompatBuild = builder.build();
        this.mDescription = mediaDescriptionCompatBuild;
        return mediaDescriptionCompatBuild;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeBundle(this.mBundle);
    }

    public int size() {
        return this.mBundle.size();
    }

    public java.util.Set<java.lang.String> keySet() {
        return this.mBundle.keySet();
    }

    public android.os.Bundle getBundle() {
        return new android.os.Bundle(this.mBundle);
    }

    public static androidx.media3.session.legacy.MediaMetadataCompat fromMediaMetadata(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        android.media.MediaMetadata mediaMetadata = (android.media.MediaMetadata) obj;
        mediaMetadata.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompatCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        mediaMetadataCompatCreateFromParcel.mMetadataFwk = mediaMetadata;
        return mediaMetadataCompatCreateFromParcel;
    }

    public java.lang.Object getMediaMetadata() {
        android.media.MediaMetadata mediaMetadata = this.mMetadataFwk;
        if (mediaMetadata != null) {
            return mediaMetadata;
        }
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            android.media.MediaMetadata mediaMetadata2 = (android.media.MediaMetadata) android.media.MediaMetadata.CREATOR.createFromParcel(parcelObtain);
            this.mMetadataFwk = mediaMetadata2;
            return mediaMetadata2;
        } finally {
            parcelObtain.recycle();
        }
    }

    public static final class Builder {
        private final android.os.Bundle mBundle;

        public Builder() {
            this.mBundle = new android.os.Bundle();
        }

        public Builder(androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat) {
            android.os.Bundle bundle = new android.os.Bundle(mediaMetadataCompat.mBundle);
            this.mBundle = bundle;
            androidx.media3.session.legacy.MediaSessionCompat.ensureClassLoader(bundle);
        }

        public Builder(androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat, int i) {
            this(mediaMetadataCompat);
            for (java.lang.String str : this.mBundle.keySet()) {
                java.lang.Object obj = this.mBundle.get(str);
                if (obj instanceof android.graphics.Bitmap) {
                    android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
                    if (bitmap.getHeight() > i || bitmap.getWidth() > i) {
                        putBitmap(str, scaleBitmap(bitmap, i));
                    }
                }
            }
        }

        public androidx.media3.session.legacy.MediaMetadataCompat.Builder putText(java.lang.String str, java.lang.CharSequence charSequence) {
            java.lang.Integer num = androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEYS_TYPE.get(str);
            if (num != null && num.intValue() != 1) {
                throw new java.lang.IllegalArgumentException("The " + str + " key cannot be used to put a CharSequence");
            }
            this.mBundle.putCharSequence(str, charSequence);
            return this;
        }

        public androidx.media3.session.legacy.MediaMetadataCompat.Builder putString(java.lang.String str, java.lang.String str2) {
            java.lang.Integer num = androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEYS_TYPE.get(str);
            if (num != null && num.intValue() != 1) {
                throw new java.lang.IllegalArgumentException("The " + str + " key cannot be used to put a String");
            }
            this.mBundle.putCharSequence(str, str2);
            return this;
        }

        public androidx.media3.session.legacy.MediaMetadataCompat.Builder putLong(java.lang.String str, long j) {
            java.lang.Integer num = androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEYS_TYPE.get(str);
            if (num != null && num.intValue() != 0) {
                throw new java.lang.IllegalArgumentException("The " + str + " key cannot be used to put a long");
            }
            this.mBundle.putLong(str, j);
            return this;
        }

        public androidx.media3.session.legacy.MediaMetadataCompat.Builder putRating(java.lang.String str, androidx.media3.session.legacy.RatingCompat ratingCompat) {
            java.lang.Integer num = androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEYS_TYPE.get(str);
            if (num != null && num.intValue() != 3) {
                throw new java.lang.IllegalArgumentException("The " + str + " key cannot be used to put a Rating");
            }
            this.mBundle.putParcelable(str, (android.os.Parcelable) ratingCompat.getRating());
            return this;
        }

        public androidx.media3.session.legacy.MediaMetadataCompat.Builder putBitmap(java.lang.String str, android.graphics.Bitmap bitmap) {
            java.lang.Integer num = androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEYS_TYPE.get(str);
            if (num != null && num.intValue() != 2) {
                throw new java.lang.IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
            }
            this.mBundle.putParcelable(str, bitmap);
            return this;
        }

        public androidx.media3.session.legacy.MediaMetadataCompat build() {
            return new androidx.media3.session.legacy.MediaMetadataCompat(this.mBundle);
        }

        private android.graphics.Bitmap scaleBitmap(android.graphics.Bitmap bitmap, int i) {
            float f = i;
            float fMin = java.lang.Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
            return android.graphics.Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), true);
        }
    }
}
