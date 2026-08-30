package androidx.browser.trusted.sharing;

/* JADX INFO: loaded from: classes.dex */
public final class ShareData {
    public static final java.lang.String KEY_TEXT = "androidx.browser.trusted.sharing.KEY_TEXT";
    public static final java.lang.String KEY_TITLE = "androidx.browser.trusted.sharing.KEY_TITLE";
    public static final java.lang.String KEY_URIS = "androidx.browser.trusted.sharing.KEY_URIS";
    public final java.lang.String text;
    public final java.lang.String title;
    public final java.util.List<android.net.Uri> uris;

    public ShareData(java.lang.String str, java.lang.String str2, java.util.List<android.net.Uri> list) {
        this.title = str;
        this.text = str2;
        this.uris = list;
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.title);
        bundle.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.text);
        if (this.uris != null) {
            bundle.putParcelableArrayList(KEY_URIS, new java.util.ArrayList<>(this.uris));
        }
        return bundle;
    }

    public static androidx.browser.trusted.sharing.ShareData fromBundle(android.os.Bundle bundle) {
        return new androidx.browser.trusted.sharing.ShareData(bundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), bundle.getParcelableArrayList(KEY_URIS));
    }
}
