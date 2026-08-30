package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements android.os.Parcelable {
    public static final long BT_FOLDER_TYPE_ALBUMS = 2;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3;
    public static final long BT_FOLDER_TYPE_GENRES = 4;
    public static final long BT_FOLDER_TYPE_MIXED = 0;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5;
    public static final long BT_FOLDER_TYPE_TITLES = 1;
    public static final long BT_FOLDER_TYPE_YEARS = 6;
    public static final android.os.Parcelable.Creator<androidx.media3.session.legacy.MediaDescriptionCompat> CREATOR = new android.os.Parcelable.Creator<androidx.media3.session.legacy.MediaDescriptionCompat>() { // from class: androidx.media3.session.legacy.MediaDescriptionCompat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.session.legacy.MediaDescriptionCompat createFromParcel(android.os.Parcel parcel) {
            return (androidx.media3.session.legacy.MediaDescriptionCompat) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.session.legacy.MediaDescriptionCompat.fromMediaDescription(android.media.MediaDescription.CREATOR.createFromParcel(parcel)));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.session.legacy.MediaDescriptionCompat[] newArray(int i) {
            return new androidx.media3.session.legacy.MediaDescriptionCompat[i];
        }
    };
    public static final java.lang.String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";
    public static final java.lang.String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    public static final java.lang.String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
    public static final java.lang.String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
    public static final long STATUS_DOWNLOADED = 2;
    public static final long STATUS_DOWNLOADING = 1;
    public static final long STATUS_NOT_DOWNLOADED = 0;
    private static final java.lang.String TAG = "MediaDescriptionCompat";
    private final java.lang.CharSequence mDescription;
    private android.media.MediaDescription mDescriptionFwk;
    private final android.os.Bundle mExtras;
    private final android.graphics.Bitmap mIcon;
    private final android.net.Uri mIconUri;
    private final java.lang.String mMediaId;
    private final android.net.Uri mMediaUri;
    private final java.lang.CharSequence mSubtitle;
    private final java.lang.CharSequence mTitle;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    MediaDescriptionCompat(java.lang.String str, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, android.graphics.Bitmap bitmap, android.net.Uri uri, android.os.Bundle bundle, android.net.Uri uri2) {
        this.mMediaId = str;
        this.mTitle = charSequence;
        this.mSubtitle = charSequence2;
        this.mDescription = charSequence3;
        this.mIcon = bitmap;
        this.mIconUri = uri;
        this.mExtras = bundle;
        this.mMediaUri = uri2;
    }

    MediaDescriptionCompat(android.os.Parcel parcel) {
        this.mMediaId = parcel.readString();
        this.mTitle = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mSubtitle = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mDescription = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        java.lang.ClassLoader classLoader = getClass().getClassLoader();
        this.mIcon = (android.graphics.Bitmap) parcel.readParcelable(classLoader);
        this.mIconUri = (android.net.Uri) parcel.readParcelable(classLoader);
        this.mExtras = parcel.readBundle(classLoader);
        this.mMediaUri = (android.net.Uri) parcel.readParcelable(classLoader);
    }

    public java.lang.String getMediaId() {
        return this.mMediaId;
    }

    public java.lang.CharSequence getTitle() {
        return this.mTitle;
    }

    public java.lang.CharSequence getSubtitle() {
        return this.mSubtitle;
    }

    public java.lang.CharSequence getDescription() {
        return this.mDescription;
    }

    public android.graphics.Bitmap getIconBitmap() {
        return this.mIcon;
    }

    public android.net.Uri getIconUri() {
        return this.mIconUri;
    }

    public android.os.Bundle getExtras() {
        return this.mExtras;
    }

    public android.net.Uri getMediaUri() {
        return this.mMediaUri;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        ((android.media.MediaDescription) getMediaDescription()).writeToParcel(parcel, i);
    }

    public java.lang.String toString() {
        return ((java.lang.Object) this.mTitle) + ", " + ((java.lang.Object) this.mSubtitle) + ", " + ((java.lang.Object) this.mDescription);
    }

    public java.lang.Object getMediaDescription() {
        android.media.MediaDescription mediaDescription = this.mDescriptionFwk;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        android.media.MediaDescription.Builder builderCreateBuilder = androidx.media3.session.legacy.MediaDescriptionCompat.Api21Impl.createBuilder();
        androidx.media3.session.legacy.MediaDescriptionCompat.Api21Impl.setMediaId(builderCreateBuilder, this.mMediaId);
        androidx.media3.session.legacy.MediaDescriptionCompat.Api21Impl.setTitle(builderCreateBuilder, this.mTitle);
        androidx.media3.session.legacy.MediaDescriptionCompat.Api21Impl.setSubtitle(builderCreateBuilder, this.mSubtitle);
        androidx.media3.session.legacy.MediaDescriptionCompat.Api21Impl.setDescription(builderCreateBuilder, this.mDescription);
        androidx.media3.session.legacy.MediaDescriptionCompat.Api21Impl.setIconBitmap(builderCreateBuilder, this.mIcon);
        androidx.media3.session.legacy.MediaDescriptionCompat.Api21Impl.setIconUri(builderCreateBuilder, this.mIconUri);
        androidx.media3.session.legacy.MediaDescriptionCompat.Api21Impl.setExtras(builderCreateBuilder, this.mExtras);
        androidx.media3.session.legacy.MediaDescriptionCompat.Api23Impl.setMediaUri(builderCreateBuilder, this.mMediaUri);
        android.media.MediaDescription mediaDescriptionBuild = androidx.media3.session.legacy.MediaDescriptionCompat.Api21Impl.build(builderCreateBuilder);
        this.mDescriptionFwk = mediaDescriptionBuild;
        return mediaDescriptionBuild;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    public static androidx.media3.session.legacy.MediaDescriptionCompat fromMediaDescription(java.lang.Object obj) {
        android.net.Uri uri;
        android.os.Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        androidx.media3.session.legacy.MediaDescriptionCompat.Builder builder = new androidx.media3.session.legacy.MediaDescriptionCompat.Builder();
        android.media.MediaDescription mediaDescription = (android.media.MediaDescription) obj;
        builder.setMediaId(androidx.media3.session.legacy.MediaDescriptionCompat.Api21Impl.getMediaId(mediaDescription));
        builder.setTitle(androidx.media3.session.legacy.MediaDescriptionCompat.Api21Impl.getTitle(mediaDescription));
        builder.setSubtitle(androidx.media3.session.legacy.MediaDescriptionCompat.Api21Impl.getSubtitle(mediaDescription));
        builder.setDescription(androidx.media3.session.legacy.MediaDescriptionCompat.Api21Impl.getDescription(mediaDescription));
        builder.setIconBitmap(androidx.media3.session.legacy.MediaDescriptionCompat.Api21Impl.getIconBitmap(mediaDescription));
        builder.setIconUri(androidx.media3.session.legacy.MediaDescriptionCompat.Api21Impl.getIconUri(mediaDescription));
        android.os.Bundle bundleUnparcelWithClassLoader = androidx.media3.session.legacy.MediaSessionCompat.unparcelWithClassLoader(androidx.media3.session.legacy.MediaDescriptionCompat.Api21Impl.getExtras(mediaDescription));
        if (bundleUnparcelWithClassLoader != null) {
            bundleUnparcelWithClassLoader = new android.os.Bundle(bundleUnparcelWithClassLoader);
        }
        if (bundleUnparcelWithClassLoader != null) {
            uri = (android.net.Uri) bundleUnparcelWithClassLoader.getParcelable("android.support.v4.media.description.MEDIA_URI");
            if (uri != null) {
                if (!bundleUnparcelWithClassLoader.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleUnparcelWithClassLoader.size() != 2) {
                    bundleUnparcelWithClassLoader.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleUnparcelWithClassLoader.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                }
            }
            builder.setExtras(bundle);
            if (uri != null) {
                builder.setMediaUri(uri);
            } else {
                builder.setMediaUri(androidx.media3.session.legacy.MediaDescriptionCompat.Api23Impl.getMediaUri(mediaDescription));
            }
            androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompatBuild = builder.build();
            mediaDescriptionCompatBuild.mDescriptionFwk = mediaDescription;
            return mediaDescriptionCompatBuild;
        }
        uri = null;
        bundle = bundleUnparcelWithClassLoader;
        builder.setExtras(bundle);
        if (uri != null) {
            builder.setMediaUri(uri);
        } else {
            builder.setMediaUri(androidx.media3.session.legacy.MediaDescriptionCompat.Api23Impl.getMediaUri(mediaDescription));
        }
        androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompatBuild2 = builder.build();
        mediaDescriptionCompatBuild2.mDescriptionFwk = mediaDescription;
        return mediaDescriptionCompatBuild2;
    }

    public static final class Builder {
        private java.lang.CharSequence mDescription;
        private android.os.Bundle mExtras;
        private android.graphics.Bitmap mIcon;
        private android.net.Uri mIconUri;
        private java.lang.String mMediaId;
        private android.net.Uri mMediaUri;
        private java.lang.CharSequence mSubtitle;
        private java.lang.CharSequence mTitle;

        public androidx.media3.session.legacy.MediaDescriptionCompat.Builder setMediaId(java.lang.String str) {
            this.mMediaId = str;
            return this;
        }

        public androidx.media3.session.legacy.MediaDescriptionCompat.Builder setTitle(java.lang.CharSequence charSequence) {
            this.mTitle = charSequence;
            return this;
        }

        public androidx.media3.session.legacy.MediaDescriptionCompat.Builder setSubtitle(java.lang.CharSequence charSequence) {
            this.mSubtitle = charSequence;
            return this;
        }

        public androidx.media3.session.legacy.MediaDescriptionCompat.Builder setDescription(java.lang.CharSequence charSequence) {
            this.mDescription = charSequence;
            return this;
        }

        public androidx.media3.session.legacy.MediaDescriptionCompat.Builder setIconBitmap(android.graphics.Bitmap bitmap) {
            this.mIcon = bitmap;
            return this;
        }

        public androidx.media3.session.legacy.MediaDescriptionCompat.Builder setIconUri(android.net.Uri uri) {
            this.mIconUri = uri;
            return this;
        }

        public androidx.media3.session.legacy.MediaDescriptionCompat.Builder setExtras(android.os.Bundle bundle) {
            this.mExtras = bundle;
            return this;
        }

        public androidx.media3.session.legacy.MediaDescriptionCompat.Builder setMediaUri(android.net.Uri uri) {
            this.mMediaUri = uri;
            return this;
        }

        public androidx.media3.session.legacy.MediaDescriptionCompat build() {
            return new androidx.media3.session.legacy.MediaDescriptionCompat(this.mMediaId, this.mTitle, this.mSubtitle, this.mDescription, this.mIcon, this.mIconUri, this.mExtras, this.mMediaUri);
        }
    }

    private static class Api21Impl {
        private Api21Impl() {
        }

        static android.media.MediaDescription.Builder createBuilder() {
            return new android.media.MediaDescription.Builder();
        }

        static void setMediaId(android.media.MediaDescription.Builder builder, java.lang.String str) {
            builder.setMediaId(str);
        }

        static void setTitle(android.media.MediaDescription.Builder builder, java.lang.CharSequence charSequence) {
            builder.setTitle(charSequence);
        }

        static void setSubtitle(android.media.MediaDescription.Builder builder, java.lang.CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void setDescription(android.media.MediaDescription.Builder builder, java.lang.CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void setIconBitmap(android.media.MediaDescription.Builder builder, android.graphics.Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        static void setIconUri(android.media.MediaDescription.Builder builder, android.net.Uri uri) {
            builder.setIconUri(uri);
        }

        static void setExtras(android.media.MediaDescription.Builder builder, android.os.Bundle bundle) {
            builder.setExtras(bundle);
        }

        static android.media.MediaDescription build(android.media.MediaDescription.Builder builder) {
            return builder.build();
        }

        static java.lang.String getMediaId(android.media.MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        static java.lang.CharSequence getTitle(android.media.MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        static java.lang.CharSequence getSubtitle(android.media.MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        static java.lang.CharSequence getDescription(android.media.MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        static android.graphics.Bitmap getIconBitmap(android.media.MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        static android.net.Uri getIconUri(android.media.MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        static android.os.Bundle getExtras(android.media.MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }
    }

    private static class Api23Impl {
        private Api23Impl() {
        }

        static void setMediaUri(android.media.MediaDescription.Builder builder, android.net.Uri uri) {
            builder.setMediaUri(uri);
        }

        static android.net.Uri getMediaUri(android.media.MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }
    }
}
