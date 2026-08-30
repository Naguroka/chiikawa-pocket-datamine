package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
public final class TrustedWebActivityIntent {
    private final android.content.Intent mIntent;
    private final java.util.List<android.net.Uri> mSharedFileUris;

    TrustedWebActivityIntent(android.content.Intent intent, java.util.List<android.net.Uri> list) {
        this.mIntent = intent;
        this.mSharedFileUris = list;
    }

    public void launchTrustedWebActivity(android.content.Context context) {
        grantUriPermissionToProvider(context);
        androidx.core.content.ContextCompat.startActivity(context, this.mIntent, null);
    }

    private void grantUriPermissionToProvider(android.content.Context context) {
        java.util.Iterator<android.net.Uri> it = this.mSharedFileUris.iterator();
        while (it.hasNext()) {
            context.grantUriPermission(this.mIntent.getPackage(), it.next(), 1);
        }
    }

    public android.content.Intent getIntent() {
        return this.mIntent;
    }
}
