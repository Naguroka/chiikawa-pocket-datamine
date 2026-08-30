package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public interface AdViewProvider {
    android.view.ViewGroup getAdViewGroup();

    default java.util.List<androidx.media3.common.AdOverlayInfo> getAdOverlayInfos() {
        return com.google.common.collect.ImmutableList.of();
    }
}
