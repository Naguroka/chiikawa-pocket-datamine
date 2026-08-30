package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public interface PostMessageBackend {
    void onDisconnectChannel(android.content.Context context);

    boolean onNotifyMessageChannelReady(android.os.Bundle bundle);

    boolean onPostMessage(java.lang.String str, android.os.Bundle bundle);
}
