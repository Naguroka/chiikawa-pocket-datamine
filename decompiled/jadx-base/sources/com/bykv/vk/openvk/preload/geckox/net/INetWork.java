package com.bykv.vk.openvk.preload.geckox.net;

/* JADX INFO: loaded from: classes3.dex */
public interface INetWork {
    com.bykv.vk.openvk.preload.geckox.net.Response doGet(java.lang.String str) throws java.lang.Exception;

    com.bykv.vk.openvk.preload.geckox.net.Response doPost(java.lang.String str, java.lang.String str2) throws java.lang.Exception;

    com.bykv.vk.openvk.preload.geckox.net.Response doPost(java.lang.String str, java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list) throws java.lang.Exception;

    void downloadFile(java.lang.String str, long j, com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream bufferOutputStream) throws java.lang.Exception;

    void syncDoGet(java.lang.String str);
}
