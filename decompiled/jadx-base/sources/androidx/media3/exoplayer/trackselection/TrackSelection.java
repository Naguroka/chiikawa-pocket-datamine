package androidx.media3.exoplayer.trackselection;

/* JADX INFO: loaded from: classes.dex */
public interface TrackSelection {
    public static final int TYPE_CUSTOM_BASE = 10000;
    public static final int TYPE_UNSET = 0;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Type {
    }

    androidx.media3.common.Format getFormat(int i);

    int getIndexInTrackGroup(int i);

    androidx.media3.common.TrackGroup getTrackGroup();

    int getType();

    int indexOf(int i);

    int indexOf(androidx.media3.common.Format format);

    int length();
}
