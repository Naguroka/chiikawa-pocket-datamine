package jp.co.applibot.ldx.nativeshare;

/* JADX INFO: loaded from: classes6.dex */
public class NativeShare {
    public static void ShareText(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType(androidx.webkit.internal.AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", str);
        activity.startActivity(android.content.Intent.createChooser(intent, str2));
    }

    public static void ShareTextAndImage(android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType(str3);
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.addFlags(1);
        android.content.Context applicationContext = activity.getApplicationContext();
        intent.putExtra("android.intent.extra.STREAM", androidx.core.content.FileProvider.getUriForFile(applicationContext, applicationContext.getPackageName() + ".LDXNativeShare.provider", new java.io.File(str2)));
        activity.startActivity(android.content.Intent.createChooser(intent, str4));
    }
}
