package com.bykv.vk.openvk.preload.geckox.net;

/* JADX INFO: loaded from: classes3.dex */
public class Response {
    public final java.lang.String body;
    public final int code;
    public final java.util.Map<java.lang.String, java.lang.String> headers;
    public final java.lang.String msg;

    public Response(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, int i, java.lang.String str2) {
        this.headers = map;
        this.body = str;
        this.code = i;
        this.msg = str2;
    }
}
