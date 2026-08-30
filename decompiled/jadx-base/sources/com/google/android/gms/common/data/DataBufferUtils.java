package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class DataBufferUtils {
    public static final java.lang.String KEY_NEXT_PAGE_TOKEN = "next_page_token";
    public static final java.lang.String KEY_PREV_PAGE_TOKEN = "prev_page_token";

    private DataBufferUtils() {
    }

    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freezeAndClose(com.google.android.gms.common.data.DataBuffer<E> dataBuffer) {
        org.objectweb.asm.tree.MethodNode.AnonymousClass1 anonymousClass1 = (java.util.ArrayList<T>) new java.util.ArrayList(dataBuffer.getCount());
        try {
            java.util.Iterator<E> it = dataBuffer.iterator();
            while (it.hasNext()) {
                anonymousClass1.add(it.next().freeze());
            }
            dataBuffer.close();
            return anonymousClass1;
        } catch (java.lang.Throwable th) {
            dataBuffer.close();
            throw th;
        }
    }

    public static boolean hasData(com.google.android.gms.common.data.DataBuffer<?> dataBuffer) {
        return dataBuffer != null && dataBuffer.getCount() > 0;
    }

    public static boolean hasNextPage(com.google.android.gms.common.data.DataBuffer<?> dataBuffer) {
        android.os.Bundle metadata = dataBuffer.getMetadata();
        return (metadata == null || metadata.getString(KEY_NEXT_PAGE_TOKEN) == null) ? false : true;
    }

    public static boolean hasPrevPage(com.google.android.gms.common.data.DataBuffer<?> dataBuffer) {
        android.os.Bundle metadata = dataBuffer.getMetadata();
        return (metadata == null || metadata.getString(KEY_PREV_PAGE_TOKEN) == null) ? false : true;
    }
}
