package android.support.v4.media;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements android.os.Parcelable {
    public static final long BT_FOLDER_TYPE_ALBUMS = 2;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3;
    public static final long BT_FOLDER_TYPE_GENRES = 4;
    public static final long BT_FOLDER_TYPE_MIXED = 0;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5;
    public static final long BT_FOLDER_TYPE_TITLES = 1;
    public static final long BT_FOLDER_TYPE_YEARS = 6;
    public static final android.os.Parcelable.Creator<android.support.v4.media.MediaDescriptionCompat> CREATOR = new android.os.Parcelable.Creator<android.support.v4.media.MediaDescriptionCompat>() { // from class: android.support.v4.media.MediaDescriptionCompat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public android.support.v4.media.MediaDescriptionCompat createFromParcel(android.os.Parcel parcel) {
            return android.support.v4.media.MediaDescriptionCompat.fromMediaDescription(android.media.MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public android.support.v4.media.MediaDescriptionCompat[] newArray(int i) {
            return new android.support.v4.media.MediaDescriptionCompat[i];
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
        android.media.MediaDescription.Builder builderCreateBuilder = android.support.v4.media.MediaDescriptionCompat.Api21Impl.createBuilder();
        android.support.v4.media.MediaDescriptionCompat.Api21Impl.setMediaId(builderCreateBuilder, this.mMediaId);
        android.support.v4.media.MediaDescriptionCompat.Api21Impl.setTitle(builderCreateBuilder, this.mTitle);
        android.support.v4.media.MediaDescriptionCompat.Api21Impl.setSubtitle(builderCreateBuilder, this.mSubtitle);
        android.support.v4.media.MediaDescriptionCompat.Api21Impl.setDescription(builderCreateBuilder, this.mDescription);
        android.support.v4.media.MediaDescriptionCompat.Api21Impl.setIconBitmap(builderCreateBuilder, this.mIcon);
        android.support.v4.media.MediaDescriptionCompat.Api21Impl.setIconUri(builderCreateBuilder, this.mIconUri);
        android.support.v4.media.MediaDescriptionCompat.Api21Impl.setExtras(builderCreateBuilder, this.mExtras);
        android.support.v4.media.MediaDescriptionCompat.Api23Impl.setMediaUri(builderCreateBuilder, this.mMediaUri);
        android.media.MediaDescription mediaDescriptionBuild = android.support.v4.media.MediaDescriptionCompat.Api21Impl.build(builderCreateBuilder);
        this.mDescriptionFwk = mediaDescriptionBuild;
        return mediaDescriptionBuild;
    }

    public static android.support.v4.media.MediaDescriptionCompat fromMediaDescription(java.lang.Object obj) {
        android.os.Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        android.support.v4.media.MediaDescriptionCompat.Builder builder = new android.support.v4.media.MediaDescriptionCompat.Builder();
        android.media.MediaDescription mediaDescription = (android.media.MediaDescription) obj;
        builder.setMediaId(android.support.v4.media.MediaDescriptionCompat.Api21Impl.getMediaId(mediaDescription));
        builder.setTitle(android.support.v4.media.MediaDescriptionCompat.Api21Impl.getTitle(mediaDescription));
        builder.setSubtitle(android.support.v4.media.MediaDescriptionCompat.Api21Impl.getSubtitle(mediaDescription));
        builder.setDescription(android.support.v4.media.MediaDescriptionCompat.Api21Impl.getDescription(mediaDescription));
        builder.setIconBitmap(android.support.v4.media.MediaDescriptionCompat.Api21Impl.getIconBitmap(mediaDescription));
        builder.setIconUri(android.support.v4.media.MediaDescriptionCompat.Api21Impl.getIconUri(mediaDescription));
        android.os.Bundle extras = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getExtras(mediaDescription);
        if (extras != null) {
            extras = android.support.v4.media.session.MediaSessionCompat.unparcelWithClassLoader(extras);
        }
        android.net.Uri uri = extras != null ? (android.net.Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri == null) {
            bundle = extras;
        } else if (!extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || extras.size() != 2) {
            extras.remove("android.support.v4.media.description.MEDIA_URI");
            extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = extras;
        }
        builder.setExtras(bundle);
        if (uri != null) {
            builder.setMediaUri(uri);
        } else {
            builder.setMediaUri(android.support.v4.media.MediaDescriptionCompat.Api23Impl.getMediaUri(mediaDescription));
        }
        android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompatBuild = builder.build();
        mediaDescriptionCompatBuild.mDescriptionFwk = mediaDescription;
        return mediaDescriptionCompatBuild;
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

        public android.support.v4.media.MediaDescriptionCompat.Builder setMediaId(java.lang.String str) {
            this.mMediaId = str;
            return this;
        }

        public android.support.v4.media.MediaDescriptionCompat.Builder setTitle(java.lang.CharSequence charSequence) {
            this.mTitle = charSequence;
            return this;
        }

        public android.support.v4.media.MediaDescriptionCompat.Builder setSubtitle(java.lang.CharSequence charSequence) {
            this.mSubtitle = charSequence;
            return this;
        }

        public android.support.v4.media.MediaDescriptionCompat.Builder setDescription(java.lang.CharSequence charSequence) {
            this.mDescription = charSequence;
            return this;
        }

        public android.support.v4.media.MediaDescriptionCompat.Builder setIconBitmap(android.graphics.Bitmap bitmap) {
            this.mIcon = bitmap;
            return this;
        }

        public android.support.v4.media.MediaDescriptionCompat.Builder setIconUri(android.net.Uri uri) {
            this.mIconUri = uri;
            return this;
        }

        public android.support.v4.media.MediaDescriptionCompat.Builder setExtras(android.os.Bundle bundle) {
            this.mExtras = bundle;
            return this;
        }

        public android.support.v4.media.MediaDescriptionCompat.Builder setMediaUri(android.net.Uri uri) {
            this.mMediaUri = uri;
            return this;
        }

        public android.support.v4.media.MediaDescriptionCompat build() {
            return new android.support.v4.media.MediaDescriptionCompat(this.mMediaId, this.mTitle, this.mSubtitle, this.mDescription, this.mIcon, this.mIconUri, this.mExtras, this.mMediaUri);
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
