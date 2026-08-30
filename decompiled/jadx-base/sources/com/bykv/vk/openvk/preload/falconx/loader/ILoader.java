package com.bykv.vk.openvk.preload.falconx.loader;

/* JADX INFO: loaded from: classes3.dex */
public interface ILoader {
    boolean exist(java.lang.String str) throws java.lang.Exception;

    java.util.Map<java.lang.String, java.lang.Long> getChannelVersion();

    java.io.InputStream getInputStream(java.lang.String str) throws java.lang.Exception;

    java.lang.String getResRootDir();

    void release() throws java.lang.Exception;
}
