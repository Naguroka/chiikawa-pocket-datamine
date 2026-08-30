package com.google.flatbuffers;

/* JADX INFO: loaded from: classes5.dex */
interface ReadBuf {
    byte[] data();

    byte get(int i);

    boolean getBoolean(int i);

    double getDouble(int i);

    float getFloat(int i);

    int getInt(int i);

    long getLong(int i);

    short getShort(int i);

    java.lang.String getString(int i, int i2);

    int limit();
}
