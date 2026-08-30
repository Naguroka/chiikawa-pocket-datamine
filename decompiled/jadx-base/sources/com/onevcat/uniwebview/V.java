package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class V extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.onevcat.uniwebview.W f3694a;

    public V(com.onevcat.uniwebview.W w) {
        this.f3694a = w;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x009b  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String strValueOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        long longExtra = intent.getLongExtra("extra_download_id", -1L);
        com.onevcat.uniwebview.C1545g c1545g = (com.onevcat.uniwebview.C1545g) this.f3694a.f.get(java.lang.Long.valueOf(longExtra));
        if (c1545g != null) {
            java.lang.String strA = c1545g.a();
            java.lang.String str = c1545g.b;
            android.app.DownloadManager.Query query = new android.app.DownloadManager.Query();
            query.setFilterById(longExtra);
            java.lang.Object systemService = context.getSystemService("download");
            java.lang.String absolutePath = "";
            if (systemService instanceof android.app.DownloadManager) {
                android.database.Cursor cursorQuery = ((android.app.DownloadManager) systemService).query(query);
                if (!cursorQuery.moveToFirst()) {
                    strValueOf = "-1";
                } else if (cursorQuery.getInt(cursorQuery.getColumnIndex("status")) == 8) {
                    android.widget.Toast.makeText(this.f3694a.f3696a, context.getResources().getString(com.onevcat.uniwebview.R.string.DOWNLOAD_COMPLETED), 0).show();
                    absolutePath = new java.io.File(this.f3694a.f3696a.getExternalFilesDir(android.os.Environment.DIRECTORY_DOWNLOADS), str).getAbsolutePath();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "file.absolutePath");
                    strValueOf = "0";
                } else {
                    strValueOf = java.lang.String.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("reason")));
                }
            } else {
                strValueOf = "-1";
            }
            if (c1545g.c) {
                com.onevcat.uniwebview.Y1 y1 = new com.onevcat.uniwebview.Y1(strA, strValueOf, absolutePath, null);
                com.onevcat.uniwebview.W w = this.f3694a;
                w.c.a(w.b, com.onevcat.uniwebview.d2.FileDownloadFinished, y1);
            }
            this.f3694a.f.remove(java.lang.Long.valueOf(longExtra));
        }
    }
}
