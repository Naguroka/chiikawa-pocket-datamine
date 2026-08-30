package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public final class LegacyParcelableUtil {
    private LegacyParcelableUtil() {
    }

    public static <T extends android.os.Parcelable, U extends android.os.Parcelable> T convert(U u, android.os.Parcelable.Creator<T> creator) {
        if (u == null) {
            return null;
        }
        android.os.Parcelable parcelable = (android.os.Parcelable) maybeApplyMediaDescriptionParcelableBugWorkaround(u);
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            return (T) maybeApplyMediaDescriptionParcelableBugWorkaround(creator.createFromParcel(parcelObtain));
        } finally {
            parcelObtain.recycle();
        }
    }

    public static <T extends android.os.Parcelable, U extends android.os.Parcelable> java.util.ArrayList<T> convertList(java.util.List<U> list, android.os.Parcelable.Creator<T> creator) {
        if (list == null) {
            return null;
        }
        org.objectweb.asm.tree.MethodNode.AnonymousClass1 anonymousClass1 = (java.util.ArrayList<T>) new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            anonymousClass1.add(convert(list.get(i), creator));
        }
        return anonymousClass1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T maybeApplyMediaDescriptionParcelableBugWorkaround(T t) {
        if (androidx.media3.common.util.Util.SDK_INT < 21 || androidx.media3.common.util.Util.SDK_INT >= 23) {
            return t;
        }
        if (!(t instanceof android.support.v4.media.MediaBrowserCompat.MediaItem)) {
            return t instanceof android.support.v4.media.MediaDescriptionCompat ? (T) rebuildMediaDescriptionCompat((android.support.v4.media.MediaDescriptionCompat) t) : t;
        }
        android.support.v4.media.MediaBrowserCompat.MediaItem mediaItem = (android.support.v4.media.MediaBrowserCompat.MediaItem) t;
        return (T) new android.support.v4.media.MediaBrowserCompat.MediaItem(rebuildMediaDescriptionCompat(mediaItem.getDescription()), mediaItem.getFlags());
    }

    private static android.support.v4.media.MediaDescriptionCompat rebuildMediaDescriptionCompat(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
        return new android.support.v4.media.MediaDescriptionCompat.Builder().setMediaId(mediaDescriptionCompat.getMediaId()).setTitle(mediaDescriptionCompat.getTitle()).setSubtitle(mediaDescriptionCompat.getSubtitle()).setDescription(mediaDescriptionCompat.getDescription()).setIconBitmap(mediaDescriptionCompat.getIconBitmap()).setIconUri(mediaDescriptionCompat.getIconUri()).setExtras(mediaDescriptionCompat.getExtras()).setMediaUri(mediaDescriptionCompat.getMediaUri()).build();
    }
}
