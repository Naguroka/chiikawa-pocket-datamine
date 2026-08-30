package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
final class Handler {
    final int catchType;
    final java.lang.String catchTypeDescriptor;
    final org.objectweb.asm.Label endPc;
    final org.objectweb.asm.Label handlerPc;
    org.objectweb.asm.Handler nextHandler;
    final org.objectweb.asm.Label startPc;

    Handler(org.objectweb.asm.Label label, org.objectweb.asm.Label label2, org.objectweb.asm.Label label3, int i, java.lang.String str) {
        this.startPc = label;
        this.endPc = label2;
        this.handlerPc = label3;
        this.catchType = i;
        this.catchTypeDescriptor = str;
    }

    Handler(org.objectweb.asm.Handler handler, org.objectweb.asm.Label label, org.objectweb.asm.Label label2) {
        this(label, label2, handler.handlerPc, handler.catchType, handler.catchTypeDescriptor);
        this.nextHandler = handler.nextHandler;
    }

    static org.objectweb.asm.Handler removeRange(org.objectweb.asm.Handler handler, org.objectweb.asm.Label label, org.objectweb.asm.Label label2) {
        if (handler == null) {
            return null;
        }
        handler.nextHandler = removeRange(handler.nextHandler, label, label2);
        int i = handler.startPc.bytecodeOffset;
        int i2 = handler.endPc.bytecodeOffset;
        int i3 = label.bytecodeOffset;
        int i4 = label2 == null ? Integer.MAX_VALUE : label2.bytecodeOffset;
        if (i3 >= i2 || i4 <= i) {
            return handler;
        }
        if (i3 <= i) {
            if (i4 >= i2) {
                return handler.nextHandler;
            }
            return new org.objectweb.asm.Handler(handler, label2, handler.endPc);
        }
        if (i4 >= i2) {
            return new org.objectweb.asm.Handler(handler, handler.startPc, label);
        }
        handler.nextHandler = new org.objectweb.asm.Handler(handler, label2, handler.endPc);
        return new org.objectweb.asm.Handler(handler, handler.startPc, label);
    }

    static int getExceptionTableLength(org.objectweb.asm.Handler handler) {
        int i = 0;
        while (handler != null) {
            i++;
            handler = handler.nextHandler;
        }
        return i;
    }

    static int getExceptionTableSize(org.objectweb.asm.Handler handler) {
        return (getExceptionTableLength(handler) * 8) + 2;
    }

    static void putExceptionTable(org.objectweb.asm.Handler handler, org.objectweb.asm.ByteVector byteVector) {
        byteVector.putShort(getExceptionTableLength(handler));
        while (handler != null) {
            byteVector.putShort(handler.startPc.bytecodeOffset).putShort(handler.endPc.bytecodeOffset).putShort(handler.handlerPc.bytecodeOffset).putShort(handler.catchType);
            handler = handler.nextHandler;
        }
    }
}
