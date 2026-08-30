package org.jacoco.core.internal.data;

/* JADX INFO: loaded from: classes6.dex */
public class CompactDataOutput extends java.io.DataOutputStream {
    public CompactDataOutput(java.io.OutputStream outputStream) {
        super(outputStream);
    }

    public void writeVarInt(int i) throws java.io.IOException {
        if ((i & (-128)) == 0) {
            writeByte(i);
        } else {
            writeByte((i & 127) | 128);
            writeVarInt(i >>> 7);
        }
    }

    public void writeBooleanArray(boolean[] zArr) throws java.io.IOException {
        writeVarInt(zArr.length);
        int i = 0;
        int i2 = 0;
        for (boolean z : zArr) {
            if (z) {
                i2 |= 1 << i;
            }
            i++;
            if (i == 8) {
                writeByte(i2);
                i = 0;
                i2 = 0;
            }
        }
        if (i > 0) {
            writeByte(i2);
        }
    }
}
