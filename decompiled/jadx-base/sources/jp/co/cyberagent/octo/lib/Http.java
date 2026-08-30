package jp.co.cyberagent.octo.lib;

/* JADX INFO: loaded from: classes6.dex */
public class Http {
    public static jp.co.cyberagent.octo.lib.HttpAsyncTask downloadFile(java.lang.String str, java.lang.String str2, android.os.Looper looper, jp.co.cyberagent.octo.lib.IHttpCallback iHttpCallback) {
        jp.co.cyberagent.octo.lib.HttpAsyncTask httpAsyncTask = new jp.co.cyberagent.octo.lib.HttpAsyncTask(str, str2, looper, iHttpCallback);
        httpAsyncTask.run();
        return httpAsyncTask;
    }
}
