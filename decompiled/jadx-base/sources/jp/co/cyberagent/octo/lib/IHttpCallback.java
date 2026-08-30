package jp.co.cyberagent.octo.lib;

/* JADX INFO: loaded from: classes6.dex */
public interface IHttpCallback {
    void onComplete(jp.co.cyberagent.octo.lib.HttpAsyncTask httpAsyncTask, jp.co.cyberagent.octo.lib.HttpResult httpResult);

    void onProgress(long j);
}
