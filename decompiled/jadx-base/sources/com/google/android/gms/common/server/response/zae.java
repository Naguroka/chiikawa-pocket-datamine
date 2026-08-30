package com.google.android.gms.common.server.response;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zae implements com.google.android.gms.common.server.response.zai {
    zae() {
    }

    @Override // com.google.android.gms.common.server.response.zai
    public final /* bridge */ /* synthetic */ java.lang.Object zaa(com.google.android.gms.common.server.response.FastParser fastParser, java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        return java.lang.Boolean.valueOf(fastParser.zay(bufferedReader, false));
    }
}
